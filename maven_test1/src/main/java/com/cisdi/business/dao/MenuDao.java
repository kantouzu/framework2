package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;

import com.cisdi.business.entity.Menu;
import com.cisdi.business.example.MenuExample;
import com.cisdi.business.responseBean.MenuModule;

public interface MenuDao {

    Menu selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(MenuExample example);

    int insertSelective(Menu entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(MenuExample example);
    
    int deleteByExampleInLogic(MenuExample example);
    
    Integer countByExample(MenuExample example);
    
    int updateByPrimaryKeySelective(Menu entity);
    
    /**
     * 非业务菜单
     * @param param
     * @return
     */
    List<MenuModule> selectTreeMenuByCondition(Map<String, Object> param);
    
    /**
     * 业务菜单
     * @param param
     * @return
     */
    List<MenuModule> selectBusinessTreeMenuByCondition(Map<String, Object> param);
    
    /**
     * 全部菜单
     * @param param
     * @return
     */
    List<MenuModule> selectAllTreeMenuByCondition(Map<String, Object> param);
    
}