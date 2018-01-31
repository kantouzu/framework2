package com.cisdi.business.entity;

import com.cisdi.base.entity.BaseEntity;
import java.util.Date;

/* 读取表结构信息 */
public class RoleInfo extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    public RoleInfo() {

    }
    
    /* 角色名称  */
    private String roleName;
    /* 角色编码  */
    private String roleCode;
    /* RoleType  */
    private String roleType;
    /* 备注  */
    private String remark;
    
    public String getRoleName() {
        return this.roleName;
    }
    public String getRoleCode() {
        return this.roleCode;
    }
    public String getRoleType() {
        return this.roleType;
    }
    public String getRemark() {
        return this.remark;
    }
   
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
  
}