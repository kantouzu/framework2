package com.cisdi.business.service;

import java.util.List;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.service.BaseService;
import com.cisdi.business.entity.SessionToken;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.SessionTokenExample;

public interface SessionTokenService extends BaseService {
    
    SessionToken selectByPrimaryKey(Integer id);

    List<SessionToken> selectByExample(SessionTokenExample record);

    AjaxJson insertSelective(SessionToken record);
    
    AjaxJson deleteByPrimaryKey(Integer id);
    
    AjaxJson deleteByExample(SessionTokenExample example);
    
    AjaxJson countByExample(SessionTokenExample example);
    
    AjaxJson updateByPrimaryKeySelective(SessionToken entity);
    
    /**
     * 重置用户的登录token
     * @param user
     * @return
     */
    AjaxJson reloadTokenByUser(UserInfo user);
    
}