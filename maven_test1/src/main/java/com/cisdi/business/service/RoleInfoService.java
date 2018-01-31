package com.cisdi.business.service;

import java.util.List;
import java.util.Map;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.RoleInfo;
import com.cisdi.business.example.RoleInfoExample;

public interface RoleInfoService extends BaseService {
    
    RoleInfo selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(RoleInfoExample record);

    AjaxJson insertSelective(RoleInfo record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(RoleInfoExample example);
    
    AjaxJson deleteByExampleInLogic(RoleInfoExample example);
    
    AjaxJson countByExample(RoleInfoExample example);
    
    AjaxJson updateByPrimaryKeySelective(RoleInfo entity);
    
    LayGridReturn selectDataGridByExample(RoleInfoExample record);
    
    AjaxJson saveOrUpdate(RoleInfo entity);
}