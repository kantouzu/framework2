package com.cisdi.business.service;

import java.util.List;
import java.util.Map;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.UserRelDepart;
import com.cisdi.business.example.UserRelDepartExample;

public interface UserRelDepartService extends BaseService {
    
    UserRelDepart selectByPrimaryKey(Integer id);

    List<Map<String, Object>> selectByExample(UserRelDepartExample record);

    AjaxJson insertSelective(UserRelDepart record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(UserRelDepartExample example);
    
    AjaxJson deleteByExampleInLogic(UserRelDepartExample example);
    
    AjaxJson countByExample(UserRelDepartExample example);
    
    AjaxJson updateByPrimaryKeySelective(UserRelDepart entity);
    
    LayGridReturn selectDataGridByExample(UserRelDepartExample record);
    
    AjaxJson saveOrUpdate(UserRelDepart entity);
    
    /**
     * 列表查询所有符合条件的grid
     * @param record
     * @return
     */
    List<Map<String, Object>> selectTotalGridByExample(UserRelDepartExample record);
    
    /**
     * 解绑用户的组织机构
     * @param param
     * @return
     */
    AjaxJson unBind(Map<String, Object> param);
}