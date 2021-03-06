package com.cisdi.business.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.impl.BaseServiceImpl;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.dao.DepartInfoDao;
import com.cisdi.business.dao.UserRelDepartDao;
import com.cisdi.business.dao.UserdepartRelRoleDao;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.entity.UserRelDepart;
import com.cisdi.business.example.UserRelDepartExample;
import com.cisdi.business.example.UserdepartRelRoleExample;
import com.cisdi.business.service.UserRelDepartService;

@Service
public class UserRelDepartServiceImpl extends BaseServiceImpl implements UserRelDepartService {

    @Autowired
    private UserRelDepartDao userRelDepartDao;
    @Autowired
    private UserdepartRelRoleDao userdepartRelRoleDao;
    @Autowired
    private DepartInfoDao departInfoDao;
    
    @Override
    public UserRelDepart selectByPrimaryKey(Integer id) {
        UserRelDepart result = userRelDepartDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<Map<String, Object>> selectByExample(UserRelDepartExample  record) {
        List<Map<String, Object>> result = userRelDepartDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(UserRelDepart record) {
         int resultKey = userRelDepartDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(UserRelDepartExample  record) {
        int resultKey = userRelDepartDao.deleteByExample(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    @Transactional
    public AjaxJson deleteByExampleInLogic(UserRelDepartExample  record) {
        int resultKey = userRelDepartDao.deleteByExampleInLogic(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = userRelDepartDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(UserRelDepartExample example){
        Integer count = userRelDepartDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(UserRelDepart entity){
        int resultKey = userRelDepartDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
	public LayGridReturn selectDataGridByExample(UserRelDepartExample record) {
		return new LayGridReturn(0, "", userRelDepartDao.selectByExample(record), userRelDepartDao.countByExample(record));
	}
	
	@Override
    @Transactional
    public AjaxJson saveOrUpdate(UserRelDepart entity){
		if(BaseUtil.isEmpty(entity))
			return AjaxJson.fail("数据不能为空");
		if(BaseUtil.isEmpty(entity.getUserId()))
			return AjaxJson.fail("用户id不能为空");
		if(BaseUtil.isEmpty(entity.getDepartId()))
			return AjaxJson.fail("机构id不能为空");
		Integer id = entity.getId();
		if(BaseUtil.isEmpty(id)){
			UserRelDepartExample userRelDepartExample = new UserRelDepartExample();
			userRelDepartExample.or().andUserIdEqualTo(entity.getUserId())
									.andDepartIdEqualTo(entity.getDepartId())
									.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
			List<Map<String, Object>> checkList = userRelDepartDao.selectByExample(userRelDepartExample);
			if(!BaseUtil.isEmpty(checkList))
				return AjaxJson.fail("不可重复绑定");
			userRelDepartDao.insertSelective(entity);
		}else{
			userRelDepartDao.updateByPrimaryKeySelective(entity);
		}
        return AjaxJson.returnJsonObj(true);
    }
	

    @Override
	public List<Map<String, Object>> selectTotalGridByExample(UserRelDepartExample record) {
		return userRelDepartDao.selectTotalByExample(record);
	}

	@Override
	public AjaxJson unBind(Map<String, Object> param) {
		UserInfo sessionUser = (UserInfo) param.get("sessionUser");
		List<Integer> ids = (List<Integer>) param.get("ids");
		if(!BaseUtil.isEmpty(ids)){
			for (Integer id : ids) {
				UserRelDepart userRelDepart = userRelDepartDao.selectByPrimaryKey(id);
				if(BaseUtil.isEmpty(userRelDepart))
					return AjaxJson.fail("无法根据参数找到对应数据");
				//先检查该绑定记录是否在当前登录人的数据权限之内，如果不是，则返回错误信息
				if(!YesOrNo.是.getValue().equals(sessionUser.getIsSuperAdmin())){
					if(userRelDepart.getDepartId().equals(sessionUser.getDepartId()+""))
						return AjaxJson.fail("无法解绑自己当前单位");
					param = new HashMap<String, Object>();
					param.put("rootId", sessionUser.getDepartId());
					param.put("otherCondition", " and departInfo.id = "+userRelDepart.getDepartId());
					List<Map<String, Object>> departInfoList = departInfoDao.selectIfInTree(param);
					if(BaseUtil.isEmpty(departInfoList))
						return AjaxJson.fail("您的权限不能解绑该用户该机构");
				}
				//先根据主键找到对应的权限删掉
				UserdepartRelRoleExample userdepartRelRoleExample = new UserdepartRelRoleExample();
				userdepartRelRoleExample.or().andUserdepartIdEqualTo(id);
				userdepartRelRoleDao.deleteByExample(userdepartRelRoleExample);
				//权限删除完之后，再删除绑定的企业关联
				userRelDepartDao.deleteByPrimaryKey(id);
			}
		}
		return AjaxJson.returnJsonObj(true);
	}
    
}