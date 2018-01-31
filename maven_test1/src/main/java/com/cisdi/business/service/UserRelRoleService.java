package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.UserRelRole;
import com.cisdi.business.example.UserRelRoleExample;

public interface UserRelRoleService extends BaseService {
    
    UserRelRole selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(UserRelRoleExample record);

    AjaxJson insertSelective(UserRelRole record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(UserRelRoleExample example);
    
    AjaxJson deleteByExampleInLogic(UserRelRoleExample example);
    
    AjaxJson countByExample(UserRelRoleExample example);
    
    AjaxJson updateByPrimaryKeySelective(UserRelRole entity);
    
    LayGridReturn selectDataGridByExample(UserRelRoleExample record);
    
    AjaxJson saveOrUpdate(UserRelRole entity);
    
    /**
     * 刷新用户业务角色权限，先删除对应userId的所有关联数据，再重新添加
     * @param businessMap
     * @return
     */
    AjaxJson flushUserRelRoles(Map<String, Object> businessMap);
}