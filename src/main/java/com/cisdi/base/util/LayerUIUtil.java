package com.cisdi.base.util;

import java.util.ArrayList;
import java.util.List;

import com.cisdi.business.responseBean.LayerTree;

/**
 */
public class LayerUIUtil {
	
	/**
	 * 绘制LayerTree树形结构图
	 * @param data 数据源
	 * @param selectNode 选中的树形节点
	 * @param strategy LayerTree树形结构图绘制策略
	 * @return
	 * @version
	 */
	public static <T> List<LayerTree> drawLayerTree(List<T> data, String checkedIds, LayerTreeStrategy<T> strategy){
		if(data == null || data.size() <= 0){
			return null;
		}
		List<LayerTree> tree = new ArrayList<LayerTree>();
		List<T> root = new ArrayList<T>();
		List<T> children = new ArrayList<T>();
		splitNode(data, root, children, strategy);
		
		for(int i = 0, size = root.size(); i < size; i++){
			T r = root.get(i);
			LayerTree LayerTreeRoot = strategy.convert(r);
			tree.add(LayerTreeRoot);
			if(strategy.hasChildren(r)){
				setLayerTreeChildren(LayerTreeRoot, r, children, checkedIds, strategy);
			}else{
				strategy.setIsChecked(LayerTreeRoot, checkedIds);
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
	private static <T> void splitNode(List<T> data, List<T> root, List<T> children, LayerTreeStrategy<T> strategy){
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
	private static <T> void setLayerTreeChildren(LayerTree root, T parent, List<T> children, 
			String checkedIds, LayerTreeStrategy<T> strategy){
		List<LayerTree> LayerTreeChildren = new ArrayList<LayerTree>();
		for(int i = 0; i < children.size(); i++){
			T child = children.get(i);
			if(child == null){
				continue;
			}
			LayerTree LayerTree = strategy.convert(child);
			if(strategy.isChild(parent, child)){
				LayerTreeChildren.add(LayerTree);
				children.set(i, null);
				if(strategy.hasChildren(child)){
					setLayerTreeChildren(LayerTree, child, children, checkedIds, strategy);
				}else{
					strategy.setIsChecked(LayerTree, checkedIds);
				}
			}
		}
		root.setChildren(LayerTreeChildren);
	}

}
