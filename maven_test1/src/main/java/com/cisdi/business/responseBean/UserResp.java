package com.cisdi.business.responseBean;

import java.util.Date;

public class UserResp {
    
    public UserResp() {

    }
    
    /* 自增主键  */
    private Integer id;
    /* 用户名  */
    private String userName;
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
    /* token  */
    private String token;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartno() {
		return departno;
	}
	public void setDepartno(String departno) {
		this.departno = departno;
	}
	public String getUsable() {
		return usable;
	}
	public void setUsable(String usable) {
		this.usable = usable;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
    
  
}