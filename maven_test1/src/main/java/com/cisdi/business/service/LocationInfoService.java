package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.LocationInfo;
import com.cisdi.business.example.LocationInfoExample;
import com.cisdi.business.responseBean.LayerTree;

public interface LocationInfoService extends BaseService {
    
    LocationInfo selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(LocationInfoExample record);

    AjaxJson insertSelective(LocationInfo record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(LocationInfoExample example);
    
    AjaxJson deleteByExampleInLogic(LocationInfoExample example);
    
    AjaxJson countByExample(LocationInfoExample example);
    
    AjaxJson updateByPrimaryKeySelective(LocationInfo entity);
    
    LayGridReturn selectDataGridByExample(LocationInfoExample record);
    
    AjaxJson saveOrUpdate(LocationInfo entity);
    
    /**
     * 获取地区信息列表数据
     * @param parentId
     * @param rootId
     * @return
     */
	List<LayerTree> getLocList(Map<String, Object> param);
	
	/**
	 * 递归向上获取地区信息列表数据
	 * @param id
	 * @return
	 */
	List<LayerTree> getParentLocList(Map<String, Object> param);
}