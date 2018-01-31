package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;

import com.cisdi.business.entity.Dictionary;
import com.cisdi.business.example.DictionaryExample;
import com.cisdi.business.responseBean.MenuModule;

public interface DictionaryDao {

    Dictionary selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(DictionaryExample example);

    int insertSelective(Dictionary entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(DictionaryExample example);
    
    int deleteByExampleInLogic(DictionaryExample example);
    
    Integer countByExample(DictionaryExample example);
    
    int updateByPrimaryKeySelective(Dictionary entity);
    
    List<MenuModule> selectTreeDicByCondition(Map<String, Object> param);
    
}