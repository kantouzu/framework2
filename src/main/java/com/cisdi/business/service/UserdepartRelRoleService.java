package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.UserdepartRelRole;
import com.cisdi.business.example.UserdepartRelRoleExample;

public interface UserdepartRelRoleService extends BaseService {
    
    UserdepartRelRole selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(UserdepartRelRoleExample record);

    AjaxJson insertSelective(UserdepartRelRole record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(UserdepartRelRoleExample example);
    
    AjaxJson deleteByExampleInLogic(UserdepartRelRoleExample example);
    
    AjaxJson countByExample(UserdepartRelRoleExample example);
    
    AjaxJson updateByPrimaryKeySelective(UserdepartRelRole entity);
    
    LayGridReturn selectDataGridByExample(UserdepartRelRoleExample record);
    
    AjaxJson saveOrUpdate(UserdepartRelRole entity);
    
    /**
     * 刷新用户业务角色权限，先删除对应userdepartId的所有关联数据，再重新添加
     * @param businessMap
     * @return
     */
    AjaxJson flushUserdepartRelRoles(Map<String, Object> businessMap);
    
    /**
     * 根据userId查询绑定的业务角色数量
     * @param param
     * @return
     */
    AjaxJson countRoleByExample(Map<String, Object> param);
}