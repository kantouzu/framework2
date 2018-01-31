package com.cisdi.base.util;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cisdi.business.responseBean.LayerTree;
import com.cisdi.business.responseBean.MenuModule;

public class MenuUtils {
	
	/**
	 * 绘制菜单树
	 */
	public static List<LayerTree> drawMenuLayerTree(List<MenuModule> menuData, String checkedIds){
		return LayerUIUtil.drawLayerTree(menuData, checkedIds, new LayerTreeStrategy<MenuModule>() {
			@Override
			public LayerTree convert(MenuModule resource) {
				LayerTree LayerTree = new LayerTree();
				LayerTree.setId(resource.getId());
				LayerTree.setName(resource.getMenuName());
				LayerTree.setUrl(resource.getUrl());
				LayerTree.setIsIgnorePre(resource.getIsIgnorePre());
				LayerTree.setPreHandleUrl(resource.getPreHandleUrl());
				LayerTree.setIcon(resource.getIcon());
				LayerTree.setIsRoot(resource.getIsRoot());
				if(BaseUtil.isEmpty(resource.getOrderNum())){
//					Date createTime = resource.getCREATETIME();
//					String month = (createTime.getMonth()+"").length() == 1?"0"+createTime.getMonth():createTime.getMonth()+"";
//					String day = (createTime.getDate()+"").length() == 1?"0"+createTime.getDate():createTime.getDate()+"";
//					String hour = (createTime.getHours()+"").length() == 1?"0"+createTime.getHours():createTime.getHours()+"";
//					String minute = (createTime.getMinutes()+"").length() == 1?"0"+createTime.getMinutes():createTime.getMinutes()+"";
//					String second = (createTime.getSeconds()+"").length() == 1?"0"+createTime.getSeconds():createTime.getSeconds()+"";
//					String timeStr = ""+createTime.getYear()+month+day+hour+minute+second;
					LayerTree.setOrderNum(resource.getCreateTime().getTime());
				}
				LayerTree.setRemark(resource.getRemark());
				return LayerTree;
			}

			@Override
			public boolean isChild(MenuModule parent, MenuModule child) {
				return child.getParentId().equals(parent.getId());
			}

			@Override
			public boolean hasChildren(MenuModule obj) {
				return obj.getChildrenNum().intValue() > 0;
			}

			@Override
			public boolean isRootNode(MenuModule obj) {
				return BaseUtil.isEmpty(obj.getParentId()) || "0".equals(obj.getParentId().toString());
			}

			@Override
			public void setIsChecked(LayerTree LayerTree, String checkedIds) {
				if(StringUtils.isNotBlank(checkedIds)){
					for (String checkedId : checkedIds.split(",")) {
						if(checkedId.equals(LayerTree.getId()+"")){
							LayerTree.setChecked(true);
							break;
						}
					}
				}
			}
		});
	}
	
}
