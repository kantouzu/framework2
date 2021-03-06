package com.cisdi.business.entity;

import java.beans.Transient;
import java.util.Date;

import com.cisdi.base.entity.BaseEntity;

/* 读取表结构信息 */
public class UserInfo extends BaseEntity {
    
	private static final long serialVersionUID = 1L;
	
    public UserInfo() {

    }
    
    /* 用户名  */
    private String userName;
    /* 密码  */
    private String pwd;
    /* 姓名  */
    private String name;
    /* 所属单位编码  */
    private String departno;
    /* 是否可用  */
    private String usable;
    /* 手机号码  */
    private String phone;
    /* 邮箱  */
    private String email;
    
    private Integer departId;// 当前组织机构id 
    
    private String isSuperAdmin;// 是否是超管
    
    public String getUserName() {
        return this.userName;
    }
    public String getPwd() {
        return this.pwd;
    }
    public String getName() {
        return this.name;
    }
    public String getDepartno() {
        return this.departno;
    }
    public String getUsable() {
        return this.usable;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getEmail() {
        return this.email;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartno(String departno) {
        this.departno = departno;
    }
    public void setUsable(String usable) {
        this.usable = usable;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Transient
	public Integer getDepartId() {
		return departId;
	}
	public void setDepartId(Integer departId) {
		this.departId = departId;
	}
	public String getIsSuperAdmin() {
		return isSuperAdmin;
	}
	public void setIsSuperAdmin(String isSuperAdmin) {
		this.isSuperAdmin = isSuperAdmin;
	}
  
}