package com.cisdi.business.dao;

import java.util.List;
import java.util.Map;

import com.cisdi.business.entity.DepartInfo;
import com.cisdi.business.example.DepartInfoExample;
import com.cisdi.business.responseBean.DepartModule;

public interface DepartInfoDao {

    DepartInfo selectByPrimaryKey(Integer id);
    
    List<Map<String, Object>> selectByExample(DepartInfoExample example);

    int insertSelective(DepartInfo entity);
  
    int deleteByPrimaryKey(Integer id);
    
    int deleteByExample(DepartInfoExample example);
    
    int deleteByExampleInLogic(DepartInfoExample example);
    
    Integer countByExample(DepartInfoExample example);
    
    int updateByPrimaryKeySelective(DepartInfo entity);
    
    List<DepartModule> selectTreeDepartByCondition(Map<String, Object> param);
    
    /**
     * 查询指定节点是否包含目标节点
     * @param param
     * @return
     */
    List<Map<String, Object>> selectIfInTree(Map<String, Object> param);
    
    /**
     * 查询指定节点是否包含目标节点
     * @param param
     * @return
     */
    List<DepartModule> selectParentTreeDepartByCondition(Map<String, Object> param);
    
    /**
     * 根据根节点id修改所有下级的值
     * @param param
     * @return
     */
    int updateChildrenDepart(Map<String, Object> param);
    
}