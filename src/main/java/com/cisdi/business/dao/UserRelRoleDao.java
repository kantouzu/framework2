package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;
import com.cisdi.business.entity.UserRelRole;
import com.cisdi.business.example.UserRelRoleExample;

public interface UserRelRoleDao {

    UserRelRole selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(UserRelRoleExample example);

    int insertSelective(UserRelRole entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(UserRelRoleExample example);
    
    int deleteByExampleInLogic(UserRelRoleExample example);
    
    Integer countByExample(UserRelRoleExample example);
    
    int updateByPrimaryKeySelective(UserRelRole entity);
    
}