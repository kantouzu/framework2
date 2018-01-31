package com.cisdi.business.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.impl.BaseServiceImpl;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.dao.RoleInfoDao;
import com.cisdi.business.dao.RoleRelMenuDao;
import com.cisdi.business.entity.RoleInfo;
import com.cisdi.business.entity.RoleRelMenu;
import com.cisdi.business.example.RoleRelMenuExample;
import com.cisdi.business.service.RoleRelMenuService;

@Service
public class RoleRelMenuServiceImpl extends BaseServiceImpl implements RoleRelMenuService {

    @Autowired
    private RoleRelMenuDao roleRelMenuDao;
    @Autowired
    private RoleInfoDao roleInfoDao;
    
    @Override
    public RoleRelMenu selectByPrimaryKey(Integer id) {
        RoleRelMenu result = roleRelMenuDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<Map<String, Object>> selectByExample(RoleRelMenuExample  record) {
        List<Map<String, Object>> result = roleRelMenuDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(RoleRelMenu record) {
         int resultKey = roleRelMenuDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(RoleRelMenuExample  record) {
        int resultKey = roleRelMenuDao.deleteByExample(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    @Transactional
    public AjaxJson deleteByExampleInLogic(RoleRelMenuExample  record) {
        int resultKey = roleRelMenuDao.deleteByExampleInLogic(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = roleRelMenuDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(RoleRelMenuExample example){
        Integer count = roleRelMenuDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(RoleRelMenu entity){
        int resultKey = roleRelMenuDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
	public LayGridReturn selectDataGridByExample(RoleRelMenuExample record) {
		return new LayGridReturn(0, "", roleRelMenuDao.selectByExample(record), roleRelMenuDao.countByExample(record));
	}
	
	@Override
    @Transactional
    public AjaxJson saveOrUpdate(RoleRelMenu entity){
		Integer id = entity.getId();
		if(BaseUtil.isEmpty(id)){
			roleRelMenuDao.insertSelective(entity);
		}else{
			roleRelMenuDao.updateByPrimaryKeySelective(entity);
		}
        return AjaxJson.returnJsonObj(true);
    }

	@Override
	public String getMenuIdsByRole(Integer roleId) {
		RoleRelMenuExample roleRelMenuExample = new RoleRelMenuExample();
		roleRelMenuExample.or().andRoleIdEqualTo(roleId)
								.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
		List<Map<String, Object>> roleRelMenuList = 
				roleRelMenuDao.selectByExample(roleRelMenuExample);
		String checkedIds = "";
		if(!BaseUtil.isEmpty(roleRelMenuList)){
			for (Map<String, Object> map : roleRelMenuList) {
				checkedIds += BaseUtil.retStr(map.get("menuId"))+",";
			}
		}
		if(!BaseUtil.isEmpty(checkedIds))
			checkedIds = BaseUtil.removeLastChar(checkedIds);
		return checkedIds;
	}

	@Override
	public AjaxJson flushRoleRelMenus(Map<String, Object> businessMap) {
		try {
			Integer roleId = Integer.parseInt(BaseUtil.retStr(businessMap.get("roleId")));
			String menuIds = BaseUtil.retStr(businessMap.get("menuIds"));
			if(!BaseUtil.isEmpty(roleId)){
				//先删除关联角色数据
				RoleRelMenuExample roleRelMenuExample = new RoleRelMenuExample();
				roleRelMenuExample.or().andRoleIdEqualTo(roleId);
				roleRelMenuDao.deleteByExample(roleRelMenuExample);
				//再重新添加角色
				if(!BaseUtil.isEmpty(menuIds)){
					String[] menuIdArray = menuIds.split(",");
					for (String menuId : menuIdArray) {
						RoleRelMenu roleRelMenu = new RoleRelMenu();
						roleRelMenu.setMenuId(Integer.parseInt(menuId));
						roleRelMenu.setRoleId(roleId);
						roleRelMenuDao.insertSelective(roleRelMenu);
					}
				}
			}
			return AjaxJson.returnJsonObj(true);
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
	}
    
}