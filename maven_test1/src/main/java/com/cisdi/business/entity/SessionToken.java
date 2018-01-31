package com.cisdi.business.entity;

import java.util.Date;

import com.cisdi.base.entity.BaseEntity;

/* 读取表结构信息 */
public class SessionToken extends BaseEntity {
    
	private static final long serialVersionUID = 1L;
	
    public SessionToken() {

    }
    
    /* 用户id  */
    private Integer userId;
    /* token串  */
    private String token;
    /* token失效日期  */
    private Date expireTime;
    
    public Integer getUserId() {
        return this.userId;
    }
    public String getToken() {
        return this.token;
    }
    public Date getExpireTime() {
        return this.expireTime;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
  
}