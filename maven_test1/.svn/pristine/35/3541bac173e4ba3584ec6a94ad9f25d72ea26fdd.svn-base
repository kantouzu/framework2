package com.cisdi.base.util;

import com.cisdi.business.responseBean.DepartTree;


/**
 * DepartTree生成策略
 * @author xiangjz
 * @version 
 */
public interface DepartTreeStrategy<T> {
	
	/**
	 * 从数据源转换为DepartTree
	 * @param resource 数据源
	 * @return
	 * @version
	 */
	public DepartTree convert(T resource);
	
	/**
	 * child对象是否为parent对象的子节点
	 * @param parent
	 * @param child
	 * @return
	 * @version
	 */
	public boolean isChild(T parent, T child);
	
	/**
	 * 当前节点是否存在子节点
	 * @param obj
	 * @return
	 * @version
	 */
	public boolean hasChildren(T obj);
	
	/**
	 * 是否为根节点
	 * @param obj
	 * @return
	 * @version
	 */
	public boolean isRootNode(T obj);
	
	/**
	 * 设置树节点的选中状态
	 * @param DepartTree
	 * @param checkedIds 选中的节点Id,以","分隔
	 * @version
	 */
	public void setIsChecked(DepartTree DepartTree, String checkedIds);
}
