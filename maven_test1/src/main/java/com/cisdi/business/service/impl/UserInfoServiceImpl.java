package com.cisdi.business.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.impl.BaseServiceImpl;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.base.util.MenuUtils;
import com.cisdi.business.dao.MenuDao;
import com.cisdi.business.dao.UserInfoDao;
import com.cisdi.business.dao.UserRelDepartDao;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.entity.UserRelDepart;
import com.cisdi.business.example.MenuExample;
import com.cisdi.business.example.UserInfoExample;
import com.cisdi.business.responseBean.LayerTree;
import com.cisdi.business.service.UserInfoService;

@Service
public class UserInfoServiceImpl extends BaseServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;
    @Autowired
    private UserRelDepartDao userRelDepartDao;
    @Autowired
    private MenuDao menuDao;
    
    @Override
    public UserInfo selectByPrimaryKey(Integer id) {
        UserInfo result = userInfoDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<Map<String, Object>> selectByExample(UserInfoExample  record) {
        List<Map<String, Object>> result = userInfoDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(UserInfo record) {
         int resultKey = userInfoDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(UserInfoExample  record) {
        int resultKey = userInfoDao.deleteByExample(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    @Transactional
    public AjaxJson deleteByExampleInLogic(UserInfoExample  record) {
    	int resultKey = userInfoDao.deleteByExampleInLogic(record);
    	return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = userInfoDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(UserInfoExample example){
        Integer count = userInfoDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(UserInfo entity){
        int resultKey = userInfoDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

	@Override
	public LayGridReturn selectDataGridByExample(UserInfoExample record) {
		return new LayGridReturn(0, "", userInfoDao.selectByExample(record), userInfoDao.countByExample(record));
	}
	
	@Override
    @Transactional
    public AjaxJson saveOrUpdate(Map<String, Object> param){
		UserInfo entity = (UserInfo) param.get("userInfo");
		UserInfo sessionUser = (UserInfo) param.get("sessionUser");
		Integer id = entity.getId();
		if(BaseUtil.isEmpty(id)){
			userInfoDao.insertSelective(entity);
			//根据当前登录人当前的组织机构，为其新增的用户绑定其组织机构
			UserRelDepart userRelDepart = new UserRelDepart();
			userRelDepart.setUserId(entity.getId());
			userRelDepart.setDepartId(BaseUtil.retStr(sessionUser.getDepartId()));
			userRelDepartDao.insertSelective(userRelDepart);
		}else{
			userInfoDao.updateByPrimaryKeySelective(entity);
		}
        return AjaxJson.returnJsonObj(true);
    }

	@Override
	public List<LayerTree> getMenus(Integer userId) {
		MenuExample menuExample = new MenuExample();
		menuExample.or().andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userId", userId);
		return MenuUtils.drawMenuLayerTree(menuDao.selectTreeMenuByCondition(paramMap), null);
	}
    
	@Override
	public List<LayerTree> getBusinessMenus(Map<String, Object> param) {
		Integer userId = (Integer) param.get("userId");
		Integer departId = (Integer) param.get("departId");
		MenuExample menuExample = new MenuExample();
		menuExample.or().andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userId", userId);
		paramMap.put("departId", departId);
		return MenuUtils.drawMenuLayerTree(menuDao.selectBusinessTreeMenuByCondition(paramMap), null);
	}
	
	@Override
	public List<LayerTree> getAllMenus(Map<String, Object> param) {
		return MenuUtils.drawMenuLayerTree(menuDao.selectAllTreeMenuByCondition(null), null);
	}
	
}