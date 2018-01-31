package com.cisdi.base.util;

import java.util.ArrayList;
import java.util.List;

import com.cisdi.business.responseBean.DepartTree;

/**
 */
public class DepartUIUtil {
	
	/**
	 * 绘制DepartTree树形结构图
	 * @param data 数据源
	 * @param selectNode 选中的树形节点
	 * @param strategy DepartTree树形结构图绘制策略
	 * @return
	 * @version
	 */
	public static <T> List<DepartTree> drawDepartTree(List<T> data, String checkedIds, DepartTreeStrategy<T> strategy){
		if(data == null || data.size() <= 0){
			return null;
		}
		List<DepartTree> tree = new ArrayList<DepartTree>();
		List<T> root = new ArrayList<T>();
		List<T> children = new ArrayList<T>();
		splitNode(data, root, children, strategy);
		
		for(int i = 0, size = root.size(); i < size; i++){
			T r = root.get(i);
			DepartTree DepartTreeRoot = strategy.convert(r);
			tree.add(DepartTreeRoot);
			if(strategy.hasChildren(r)){
				setDepartTreeChildren(DepartTreeRoot, r, children, checkedIds, strategy);
			}else{
				strategy.setIsChecked(DepartTreeRoot, checkedIds);
			}
		}
		tree.remove(null);
		return tree;
	}
	
	/**
	 * 分离根节点和非根节点
	 * @param data
	 * @param root
	 * @param children
	 * @param strategy
	 * @version
	 */
	private static <T> void splitNode(List<T> data, List<T> root, List<T> children, DepartTreeStrategy<T> strategy){
		for (T t : data) {
			if(strategy.isRootNode(t)){
				root.add(t);
				continue;
			}
			children.add(t);
		}
	}
	
	/**
	 * 为根节点设置子节点
	 * @param root
	 * @param parent
	 * @param children
	 * @param checkedIds
	 * @param strategy
	 * @version
	 */
	private static <T> void setDepartTreeChildren(DepartTree root, T parent, List<T> children, 
			String checkedIds, DepartTreeStrategy<T> strategy){
		List<DepartTree> DepartTreeChildren = new ArrayList<DepartTree>();
		for(int i = 0; i < children.size(); i++){
			T child = children.get(i);
			if(child == null){
				continue;
			}
			DepartTree DepartTree = strategy.convert(child);
			if(strategy.isChild(parent, child)){
				DepartTreeChildren.add(DepartTree);
				children.set(i, null);
				if(strategy.hasChildren(child)){
					setDepartTreeChildren(DepartTree, child, children, checkedIds, strategy);
				}else{
					strategy.setIsChecked(DepartTree, checkedIds);
				}
			}
		}
		root.setChildren(DepartTreeChildren);
	}

}
