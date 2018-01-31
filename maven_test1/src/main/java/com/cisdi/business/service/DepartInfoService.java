package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.DepartInfo;
import com.cisdi.business.example.DepartInfoExample;
import com.cisdi.business.responseBean.DepartTree;

public interface DepartInfoService extends BaseService {
    
    DepartInfo selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(DepartInfoExample record);

    AjaxJson insertSelective(DepartInfo record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(DepartInfoExample example, List<Integer> ids);
    
    AjaxJson deleteByExampleInLogic(DepartInfoExample example, List<Integer> ids);
    
    AjaxJson countByExample(DepartInfoExample example);
    
    AjaxJson updateByPrimaryKeySelective(DepartInfo entity);
    
    LayGridReturn selectDataGridByExample(DepartInfoExample record);
    
    AjaxJson saveOrUpdate(DepartInfo entity);
    
    /**
     * 获取组织单位信息列表数据
     * @param parentId
     * @param rootId
     * @return
     */
	List<DepartTree> getDepartList(Map<String, Object> param);
	
	/**
	 * 改变机构层级到指定位置
	 * @param param
	 * @return
	 */
	AjaxJson changeClass(Map<String, Object> param);
}