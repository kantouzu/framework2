package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;
import com.cisdi.business.entity.UserRelDepart;
import com.cisdi.business.example.UserRelDepartExample;

public interface UserRelDepartDao {

    UserRelDepart selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(UserRelDepartExample example);

    int insertSelective(UserRelDepart entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(UserRelDepartExample example);
    
    int deleteByExampleInLogic(UserRelDepartExample example);
    
    Integer countByExample(UserRelDepartExample example);
    
    int updateByPrimaryKeySelective(UserRelDepart entity);
    
    /**
     * 根据条件返回指定grid
     * @param example
     * @return
     */
    List<Map<String, Object>> selectTotalByExample(UserRelDepartExample example);
    
}