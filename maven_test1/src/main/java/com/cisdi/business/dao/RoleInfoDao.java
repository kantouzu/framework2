package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;
import com.cisdi.business.entity.RoleInfo;
import com.cisdi.business.example.RoleInfoExample;

public interface RoleInfoDao {

    RoleInfo selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(RoleInfoExample example);

    int insertSelective(RoleInfo entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(RoleInfoExample example);
    
    int deleteByExampleInLogic(RoleInfoExample example);
    
    Integer countByExample(RoleInfoExample example);
    
    int updateByPrimaryKeySelective(RoleInfo entity);
    
}