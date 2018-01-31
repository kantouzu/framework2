package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.Menu;
import com.cisdi.business.example.MenuExample;
import com.cisdi.business.responseBean.LayerTree;

public interface MenuService extends BaseService {
    
    Menu selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(MenuExample record);

    AjaxJson insertSelective(Menu record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(MenuExample example);
    
    AjaxJson deleteByExampleInLogic(MenuExample example, List<Integer> ids);
    
    AjaxJson countByExample(MenuExample example);
    
    AjaxJson updateByPrimaryKeySelective(Menu entity);
    
    LayGridReturn selectDataGridByExample(MenuExample record);
    
    AjaxJson saveOrUpdate(Menu entity);
    
    /**
     * 获取菜单信息列表数据
     * @param parentId
     * @param checkedIds
     * @return
     */
	List<LayerTree> getMenuList(String parentId, String checkedIds);
    
}