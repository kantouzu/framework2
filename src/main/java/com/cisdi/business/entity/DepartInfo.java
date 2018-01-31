package com.cisdi.business.entity;

import com.cisdi.base.entity.BaseEntity;
import java.util.Date;

/* 读取表结构信息 */
public class DepartInfo extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    public DepartInfo() {

    }
    
    /* 组织名称  */
    private String name;
    /* 父级组织id  */
    private Integer parentId;
    /* 逻辑级次  */
    private Integer level;
    /* 所属地区  */
    private Integer locId;
    
    public String getName() {
        return this.name;
    }
    public Integer getParentId() {
        return this.parentId;
    }
    public Integer getLevel() {
        return this.level;
    }
    public Integer getLocId() {
        return this.locId;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public void setLocId(Integer locId) {
        this.locId = locId;
    }
  
}