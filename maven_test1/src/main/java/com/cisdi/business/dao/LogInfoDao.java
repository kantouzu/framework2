package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;
import com.cisdi.business.entity.LogInfo;
import com.cisdi.business.example.LogInfoExample;

public interface LogInfoDao {

    LogInfo selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(LogInfoExample example);

    int insertSelective(LogInfo entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(LogInfoExample example);
    
    int deleteByExampleInLogic(LogInfoExample example);
    
    Integer countByExample(LogInfoExample example);
    
    int updateByPrimaryKeySelective(LogInfo entity);
    
}