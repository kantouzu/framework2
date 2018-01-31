package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.UserInfoExample;
import com.cisdi.business.responseBean.LayerTree;

public interface UserInfoService extends BaseService {
    
    UserInfo selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(UserInfoExample record);

    AjaxJson insertSelective(UserInfo record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(UserInfoExample example);
    
    AjaxJson deleteByExampleInLogic(UserInfoExample example);
    
    AjaxJson countByExample(UserInfoExample example);
    
    AjaxJson updateByPrimaryKeySelective(UserInfo entity);
    
    LayGridReturn selectDataGridByExample(UserInfoExample record);
    
    AjaxJson saveOrUpdate(Map<String, Object> param);
    
    /**
     * 根据用户Id获取菜单（非业务角色）
     * @param userId
     * @return
     */
	public List<LayerTree> getMenus(Integer userId);
	
	/**
	 * 根据用户Id获取菜单（业务角色）
	 * @param userId
	 * @return
	 */
	public List<LayerTree> getBusinessMenus(Map<String, Object> param);
	
	/**
	 * 查询全部菜单
	 * @param userId
	 * @return
	 */
	public List<LayerTree> getAllMenus(Map<String, Object> param);
    
}