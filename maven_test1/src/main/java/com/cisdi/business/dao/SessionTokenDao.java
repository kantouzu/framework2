package com.cisdi.business.dao;

import java.util.List;
import com.cisdi.business.entity.SessionToken;
import com.cisdi.business.example.SessionTokenExample;

public interface SessionTokenDao {

    SessionToken selectByPrimaryKey(Integer id);
    
    List<SessionToken> selectByExample(SessionTokenExample example);

    int insertSelective(SessionToken entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(SessionTokenExample example);
    
    Integer countByExample(SessionTokenExample example);
    
    int updateByPrimaryKeySelective(SessionToken entity);
    
}