package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.RoleRelMenu;
import com.cisdi.business.example.RoleRelMenuExample;

public interface RoleRelMenuService extends BaseService {
    
    RoleRelMenu selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(RoleRelMenuExample record);

    AjaxJson insertSelective(RoleRelMenu record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(RoleRelMenuExample example);
    
    AjaxJson deleteByExampleInLogic(RoleRelMenuExample example);
    
    AjaxJson countByExample(RoleRelMenuExample example);
    
    AjaxJson updateByPrimaryKeySelective(RoleRelMenu entity);
    
    LayGridReturn selectDataGridByExample(RoleRelMenuExample record);
    
    AjaxJson saveOrUpdate(RoleRelMenu entity);
    
    /**
     * 根据roleCode查询关联菜单
     * @param roleCode
     * @return
     */
    String getMenuIdsByRole(Integer roleId);
    
    /**
     * 刷新角色绑定菜单信息，先删后新增
     * @param businessMap
     * @return
     */
    AjaxJson flushRoleRelMenus(Map<String, Object> businessMap);
}