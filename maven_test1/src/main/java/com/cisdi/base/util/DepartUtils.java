package com.cisdi.base.util;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cisdi.business.responseBean.DepartModule;
import com.cisdi.business.responseBean.DepartTree;

public class DepartUtils {
	
	/**
	 * 绘制菜单树
	 */
	public static List<DepartTree> drawMenuDepartTree(List<DepartModule> menuData, final String rootNode, String checkedIds){
		return DepartUIUtil.drawDepartTree(menuData, checkedIds, new DepartTreeStrategy<DepartModule>() {
			@Override
			public DepartTree convert(DepartModule resource) {
				DepartTree DepartTree = new DepartTree();
				DepartTree.setId(resource.getId());
				DepartTree.setName(resource.getName());
				DepartTree.setLevel(resource.getLevel());
				DepartTree.setLocId(resource.getLocId());
				DepartTree.setLocName(resource.getLocName());
				return DepartTree;
			}

			@Override
			public boolean isChild(DepartModule parent, DepartModule child) {
				return child.getParentId().equals(parent.getId());
			}

			@Override
			public boolean hasChildren(DepartModule obj) {
				return obj.getChildrenNum().intValue() > 0;
			}

			@Override
			public boolean isRootNode(DepartModule obj) {
//				return BaseUtil.isEmpty(obj.getParentId()) || "0".equals(obj.getParentId().toString());
				return BaseUtil.isEmpty(obj.getParentId()) || (obj.getId()+"").equals(rootNode);
			}

			@Override
			public void setIsChecked(DepartTree DepartTree, String checkedIds) {
				if(StringUtils.isNotBlank(checkedIds)){
					for (String checkedId : checkedIds.split(",")) {
						if(checkedId.equals(DepartTree.getId()+"")){
							DepartTree.setChecked(true);
							break;
						}
					}
				}
			}
		});
	}
	
}
