package com.cisdi.business.responseBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 */
public class DepartModule implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date createTime;
	private Date updateTime;
	private String deleteflag;
	// 组织机构名称
	private String name;
	// 逻辑级次
	private String level;
	// 地区id
	private String locId;
	// 地区名称
	private String locName;
	// 父节点Id
	private Integer parentId;
    // 子模块数量
	private Integer childrenNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDeleteflag() {
		return deleteflag;
	}

	public void setDeleteflag(String deleteflag) {
		this.deleteflag = deleteflag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getChildrenNum() {
		return childrenNum;
	}

	public void setChildrenNum(Integer childrenNum) {
		this.childrenNum = childrenNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		DepartModule other = (DepartModule) obj;
		if(this.id != null || other.getId() != null){
			return this.getId().equals(other.getId());
		}else{
			return this.name.equals(other.getName());
		}
	}
}
