package com.cisdi.business.responseBean;

import java.util.List;

public class LayerTree implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	// id
	private Integer id;
	// 树节点名称
	private String name;
	// 跳转地址
	private String url;
	// 备注
	private String remark;
	// 排序
	private Long orderNum;
	// 子节点
	private List<LayerTree> children;
	// 是否勾选状态
	private Boolean checked = false;
	// 是否省略前缀
	private String isIgnorePre;
	// 提前处理url
	private String preHandleUrl;
	// 图标class
	private String icon;
	// 是否是根节点
	private String isRoot;
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}
	public List<LayerTree> getChildren() {
		return children;
	}
	public void setChildren(List<LayerTree> children) {
		this.children = children;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getIsIgnorePre() {
		return isIgnorePre;
	}
	public void setIsIgnorePre(String isIgnorePre) {
		this.isIgnorePre = isIgnorePre;
	}
	public String getPreHandleUrl() {
		return preHandleUrl;
	}
	public void setPreHandleUrl(String preHandleUrl) {
		this.preHandleUrl = preHandleUrl;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIsRoot() {
		return isRoot;
	}
	public void setIsRoot(String isRoot) {
		this.isRoot = isRoot;
	}
	
	
}
