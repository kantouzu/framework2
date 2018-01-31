package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;

import com.cisdi.business.entity.LocationInfo;
import com.cisdi.business.example.LocationInfoExample;
import com.cisdi.business.responseBean.MenuModule;

public interface LocationInfoDao {

    LocationInfo selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(LocationInfoExample example);

    int insertSelective(LocationInfo entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(LocationInfoExample example);
    
    int deleteByExampleInLogic(LocationInfoExample example);
    
    Integer countByExample(LocationInfoExample example);
    
    int updateByPrimaryKeySelective(LocationInfo entity);
    
    List<MenuModule> selectTreeLocByCondition(Map<String, Object> param);
    
    List<MenuModule> selectParentTreeLocByCondition(Map<String, Object> param);
    
}