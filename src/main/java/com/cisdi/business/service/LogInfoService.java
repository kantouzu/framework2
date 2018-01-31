package com.cisdi.business.service;

import java.util.List;
import java.util.Map;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.LogInfo;
import com.cisdi.business.example.LogInfoExample;

public interface LogInfoService extends BaseService {
    
    LogInfo selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(LogInfoExample record);

    AjaxJson insertSelective(LogInfo record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(LogInfoExample example);
    
    AjaxJson deleteByExampleInLogic(LogInfoExample example);
    
    AjaxJson countByExample(LogInfoExample example);
    
    AjaxJson updateByPrimaryKeySelective(LogInfo entity);
    
    LayGridReturn selectDataGridByExample(LogInfoExample record);
    
    AjaxJson saveOrUpdate(LogInfo entity);
}