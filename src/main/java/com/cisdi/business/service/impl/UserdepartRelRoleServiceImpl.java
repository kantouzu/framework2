package com.cisdi.business.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cisdi.base.common.enums.CommonEnumType;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.impl.BaseServiceImpl;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.dao.UserdepartRelRoleDao;
import com.cisdi.business.entity.UserRelRole;
import com.cisdi.business.entity.UserdepartRelRole;
import com.cisdi.business.example.UserRelRoleExample;
import com.cisdi.business.example.UserdepartRelRoleExample;
import com.cisdi.business.service.UserdepartRelRoleService;

@Service
public class UserdepartRelRoleServiceImpl extends BaseServiceImpl implements UserdepartRelRoleService {

    @Autowired
    private UserdepartRelRoleDao userdepartRelRoleDao;
    
    @Override
    public UserdepartRelRole selectByPrimaryKey(Integer id) {
        UserdepartRelRole result = userdepartRelRoleDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<Map<String, Object>> selectByExample(UserdepartRelRoleExample  record) {
        List<Map<String, Object>> result = userdepartRelRoleDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(UserdepartRelRole record) {
         int resultKey = userdepartRelRoleDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(UserdepartRelRoleExample  record) {
        int resultKey = userdepartRelRoleDao.deleteByExample(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    @Transactional
    public AjaxJson deleteByExampleInLogic(UserdepartRelRoleExample  record) {
        int resultKey = userdepartRelRoleDao.deleteByExampleInLogic(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = userdepartRelRoleDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(UserdepartRelRoleExample example){
        Integer count = userdepartRelRoleDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(UserdepartRelRole entity){
        int resultKey = userdepartRelRoleDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
	public LayGridReturn selectDataGridByExample(UserdepartRelRoleExample record) {
		return new LayGridReturn(0, "", userdepartRelRoleDao.selectByExample(record), userdepartRelRoleDao.countByExample(record));
	}
	
	@Override
    @Transactional
    public AjaxJson saveOrUpdate(UserdepartRelRole entity){
		Integer id = entity.getId();
		if(BaseUtil.isEmpty(id)){
			userdepartRelRoleDao.insertSelective(entity);
		}else{
			userdepartRelRoleDao.updateByPrimaryKeySelective(entity);
		}
        return AjaxJson.returnJsonObj(true);
    }
	
	@Override
	@Transactional
	public AjaxJson flushUserdepartRelRoles(Map<String, Object> businessMap) {
		try {
			Integer userdepartId = Integer.parseInt(BaseUtil.retStr(businessMap.get("userdepartId")));
			List<Integer> roleIds = (List<Integer>) businessMap.get("roleId");
			if(!BaseUtil.isEmpty(roleIds)){
				//先删除关联角色数据
				UserdepartRelRoleExample userdepartRelRoleExample = new UserdepartRelRoleExample();
				userdepartRelRoleExample.or().andUserdepartIdEqualTo(userdepartId);
				userdepartRelRoleDao.deleteByExample(userdepartRelRoleExample);
				//再重新添加角色
				for (Integer roleId : roleIds) {
					UserdepartRelRole userdepartRelRole = new UserdepartRelRole();
					userdepartRelRole.setUserdepartId(userdepartId);
					userdepartRelRole.setRoleId(roleId);
					userdepartRelRoleDao.insertSelective(userdepartRelRole);
				}
			}
			return AjaxJson.returnJsonObj(true);
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
	}

	@Override
	public AjaxJson countRoleByExample(Map<String, Object> param) {
		return AjaxJson.returnJsonObj(true, userdepartRelRoleDao.countRoleByExample(param));
	}
    
}