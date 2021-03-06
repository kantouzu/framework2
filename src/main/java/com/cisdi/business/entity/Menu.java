package com.cisdi.business.entity;

import java.util.Date;

import com.cisdi.base.entity.BaseEntity;

/* 读取表结构信息 */
public class Menu extends BaseEntity {
    
	private static final long serialVersionUID = 1L;
    
    public Menu() {

    }
    
    /* 菜单名称  */
    private String menuName;
    /* 跳转地址  */
    private String url;
    /* 父节点Id  */
    private Integer parentId;
    /* 排序顺序  */
    private Integer orderNum;
    /* 图标class  */
    private String icon;
    /* YesOrNo  */
    private String isIgnorePre;
    /* 请求前处理地址  */
    private String preHandleUrl;
    /* 备注  */
    private String remark;
    /* YesOrNo  */
    private String isRoot;
    
    public String getMenuName() {
        return this.menuName;
    }
    public String getUrl() {
        return this.url;
    }
    public Integer getParentId() {
        return this.parentId;
    }
    public Integer getOrderNum() {
        return this.orderNum;
    }
    public String getIcon() {
        return this.icon;
    }
    public String getIsIgnorePre() {
        return this.isIgnorePre;
    }
    public String getPreHandleUrl() {
        return this.preHandleUrl;
    }
    public String getRemark() {
        return this.remark;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public void setIsIgnorePre(String isIgnorePre) {
        this.isIgnorePre = isIgnorePre;
    }
    public void setPreHandleUrl(String preHandleUrl) {
        this.preHandleUrl = preHandleUrl;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
	public String getIsRoot() {
		return isRoot;
	}
	public void setIsRoot(String isRoot) {
		this.isRoot = isRoot;
	}
  
}