package com.cisdi.business.responseBean;

import java.util.List;

public class DepartTree implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	// id
	private Integer id;
	// 树节点名称
	private String name;
	// 逻辑级次
	private String level;
	// 地区id
	private String locId;
	// 地区名称
	private String locName;
	// 子节点
	private List<DepartTree> children;
	// 是否勾选状态
	private Boolean checked = false;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public List<DepartTree> getChildren() {
		return children;
	}
	public void setChildren(List<DepartTree> children) {
		this.children = children;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	
}
