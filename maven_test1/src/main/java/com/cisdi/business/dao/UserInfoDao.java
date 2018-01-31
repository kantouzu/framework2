package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;

import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.UserInfoExample;

public interface UserInfoDao {

    UserInfo selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(UserInfoExample example);

    int insertSelective(UserInfo entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(UserInfoExample example);
    
    int deleteByExampleInLogic(UserInfoExample example);
    
    Integer countByExample(UserInfoExample example);
    
    int updateByPrimaryKeySelective(UserInfo entity);
    
}