package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;
import com.cisdi.business.entity.RoleRelMenu;
import com.cisdi.business.example.RoleRelMenuExample;

public interface RoleRelMenuDao {

    RoleRelMenu selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(RoleRelMenuExample example);

    int insertSelective(RoleRelMenu entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(RoleRelMenuExample example);
    
    int deleteByExampleInLogic(RoleRelMenuExample example);
    
    Integer countByExample(RoleRelMenuExample example);
    
    int updateByPrimaryKeySelective(RoleRelMenu entity);
    
}