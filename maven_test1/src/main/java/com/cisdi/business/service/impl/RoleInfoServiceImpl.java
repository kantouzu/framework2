package com.cisdi.business.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.impl.BaseServiceImpl;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.dao.RoleInfoDao;
import com.cisdi.business.entity.RoleInfo;
import com.cisdi.business.example.DepartInfoExample;
import com.cisdi.business.example.RoleInfoExample;
import com.cisdi.business.service.RoleInfoService;

@Service
public class RoleInfoServiceImpl extends BaseServiceImpl implements RoleInfoService {

    @Autowired
    private RoleInfoDao roleInfoDao;
    
    @Override
    public RoleInfo selectByPrimaryKey(Integer id) {
        RoleInfo result = roleInfoDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<Map<String, Object>> selectByExample(RoleInfoExample  record) {
        List<Map<String, Object>> result = roleInfoDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(RoleInfo record) {
         int resultKey = roleInfoDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(RoleInfoExample  record) {
        int resultKey = roleInfoDao.deleteByExample(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    @Transactional
    public AjaxJson deleteByExampleInLogic(RoleInfoExample  record) {
        int resultKey = roleInfoDao.deleteByExampleInLogic(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = roleInfoDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(RoleInfoExample example){
        Integer count = roleInfoDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(RoleInfo entity){
        int resultKey = roleInfoDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
	public LayGridReturn selectDataGridByExample(RoleInfoExample record) {
		return new LayGridReturn(0, "", roleInfoDao.selectByExample(record), roleInfoDao.countByExample(record));
	}
	
	@Override
    @Transactional
    public AjaxJson saveOrUpdate(RoleInfo entity){
		Integer id = entity.getId();
		if(BaseUtil.isEmpty(id)){
			//而后验证是否角色重复
			RoleInfoExample roleInfoExample = new RoleInfoExample();
			roleInfoExample.or().andRoleNameEqualTo(entity.getRoleName())
									.andRoleTypeEqualTo(entity.getRoleType())
									.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
			if(!BaseUtil.isEmpty(roleInfoDao.selectByExample(roleInfoExample)))
				return AjaxJson.fail("角色不可重复");
			roleInfoDao.insertSelective(entity);
		}else{
			//而后验证是否角色重复
			RoleInfoExample roleInfoExample = new RoleInfoExample();
			roleInfoExample.or().andRoleNameEqualTo(entity.getRoleName())
									.andRoleTypeEqualTo(entity.getRoleType())
									.andIdNotEqualTo(entity.getId())
									.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
			if(!BaseUtil.isEmpty(roleInfoDao.selectByExample(roleInfoExample)))
				return AjaxJson.fail("角色不可重复");
			roleInfoDao.updateByPrimaryKeySelective(entity);
		}
        return AjaxJson.returnJsonObj(true);
    }
    
}