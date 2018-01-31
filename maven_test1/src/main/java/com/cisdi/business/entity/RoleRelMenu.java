package com.cisdi.business.entity;

import com.cisdi.base.entity.BaseEntity;
import java.util.Date;

/* 读取表结构信息 */
public class RoleRelMenu extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    public RoleRelMenu() {

    }
    
    /* 角色表id  */
    private Integer roleId;
    /* 菜单id  */
    private Integer menuId;
    
    public Integer getRoleId() {
        return this.roleId;
    }
    public Integer getMenuId() {
        return this.menuId;
    }
   
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
  
}