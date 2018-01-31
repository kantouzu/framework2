package com.cisdi.business.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisdi.base.common.GlobalConfigHolder;
import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.service.impl.BaseServiceImpl;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.base.util.DateUtil;
import com.cisdi.business.common.SessionTokenLoader;
import com.cisdi.business.dao.SessionTokenDao;
import com.cisdi.business.dao.UserInfoDao;
import com.cisdi.business.entity.SessionToken;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.SessionTokenExample;
import com.cisdi.business.service.SessionTokenService;

@Service
public class SessionTokenServiceImpl extends BaseServiceImpl implements SessionTokenService {

    @Autowired
    private SessionTokenDao sessionTokenDao;
    @Autowired
    private UserInfoDao userInfoDao;
    
    @Override
    public SessionToken selectByPrimaryKey(Integer id) {
        SessionToken result = sessionTokenDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<SessionToken> selectByExample(SessionTokenExample  record) {
        List<SessionToken> result = sessionTokenDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(SessionToken record) {
         int resultKey = sessionTokenDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(SessionTokenExample  record) {
        int resultKey = sessionTokenDao.deleteByExample(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = sessionTokenDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(SessionTokenExample example){
        Integer count = sessionTokenDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(SessionToken entity){
        int resultKey = sessionTokenDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

	@Override
	public AjaxJson reloadTokenByUser(UserInfo user) {
		//先删除原token记录userInfoDao
		SessionTokenExample sessionTokenExample = new SessionTokenExample();
		sessionTokenExample.or().andUserIdEqualTo(user.getId());
		sessionTokenDao.deleteByExample(sessionTokenExample);
		Map<String, Date> tokenMap = new HashMap<String, Date>();
			//重新录入token数据
			SessionToken sessionToken = new SessionToken();
			sessionToken.setCreateTime(new Date());
			sessionToken.setDeleteflag(DeleteFlag.未删除.getValue());
			sessionToken.setExpireTime(DateUtil.dayPlus(new Date(), Integer.parseInt(GlobalConfigHolder.getProperty("token_expire_days"))));
			sessionToken.setToken(UUID.randomUUID().toString());
			sessionToken.setUserId(user.getId());
			sessionTokenDao.insertSelective(sessionToken);
			tokenMap.put(sessionToken.getToken(), sessionToken.getExpireTime());
			SessionTokenLoader.getInstance().addSessionToken(tokenMap);
		return AjaxJson.returnJsonObj(true, tokenMap);
	}
	
	/**
	 * 系统启动时（依赖注入完毕之后）执行
	 * 加载token到内存中
	 * @throws FrameworkException
	 */
	@PostConstruct
	public void init() {
		SessionTokenLoader sessionTokenParams = SessionTokenLoader.getInstance();
		System.out.println("开始加载sessionTokens......");
		//获取所有的sessionTokens
		SessionTokenExample example = new SessionTokenExample(DeleteFlag.未删除.getValue());
		List<SessionToken> tokenList = sessionTokenDao.selectByExample(example);
		
		if(!BaseUtil.isEmpty(tokenList)){
			for (SessionToken sessionToken : tokenList) {
				Map<String, Date> map = new HashMap<String, Date>();
				map.put(sessionToken.getToken(), sessionToken.getExpireTime());
				sessionTokenParams.addSessionToken(map);
			}
		}
		System.out.println("加载sessionTokens成功......");
	}
    
}