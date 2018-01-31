package com.cisdi.business.entity;

import com.cisdi.base.entity.BaseEntity;
import java.util.Date;

/* 读取表结构信息 */
public class UserRelDepart extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    public UserRelDepart() {

    }
    
    /* 用户id  */
    private Integer userId;
    /* 组织机构id  */
    private String departId;
    
    public Integer getUserId() {
        return this.userId;
    }
    public String getDepartId() {
        return this.departId;
    }
   
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public void setDepartId(String departId) {
        this.departId = departId;
    }
  
}