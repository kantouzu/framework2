package com.cisdi.business.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.cisdi.base.util.DepartUtils;
import com.cisdi.business.dao.DepartInfoDao;
import com.cisdi.business.entity.DepartInfo;
import com.cisdi.business.example.DepartInfoExample;
import com.cisdi.business.example.DictionaryExample;
import com.cisdi.business.responseBean.DepartModule;
import com.cisdi.business.responseBean.DepartTree;
import com.cisdi.business.service.DepartInfoService;

@Service
public class DepartInfoServiceImpl extends BaseServiceImpl implements DepartInfoService {

    @Autowired
    private DepartInfoDao departInfoDao;
    
    @Override
    public DepartInfo selectByPrimaryKey(Integer id) {
        DepartInfo result = departInfoDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<Map<String, Object>> selectByExample(DepartInfoExample  record) {
        List<Map<String, Object>> result = departInfoDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(DepartInfo record) {
         int resultKey = departInfoDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(DepartInfoExample  record, List<Integer> ids) {
        int resultKey = departInfoDao.deleteByExample(record);
        //删除底下所有子单位
        if(resultKey != 0){
        	for (Integer id : ids) {
        		Map<String, Object> param = new HashMap<String, Object>();
        		param.put("rootId", id);
        		List<DepartModule> departModuleList = departInfoDao.selectTreeDepartByCondition(param);
        		if(!BaseUtil.isEmpty(departModuleList)){
        			for (DepartModule departModule : departModuleList) {
        				DepartInfoExample subRecord = new DepartInfoExample();
        				subRecord.or().andIdEqualTo(departModule.getId());
        				departInfoDao.deleteByExample(subRecord);
        			}
        		}
        	}
        }
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    @Transactional
    public AjaxJson deleteByExampleInLogic(DepartInfoExample  record, List<Integer> ids) {
        int resultKey = departInfoDao.deleteByExampleInLogic(record);
        //删除底下所有子单位
        if(resultKey != 0){
        	for (Integer id : ids) {
        		Map<String, Object> param = new HashMap<String, Object>();
        		param.put("rootId", id);
        		List<DepartModule> departModuleList = departInfoDao.selectTreeDepartByCondition(param);
        		if(!BaseUtil.isEmpty(departModuleList)){
        			for (DepartModule departModule : departModuleList) {
        				DepartInfoExample subRecord = new DepartInfoExample();
        				subRecord.or().andIdEqualTo(departModule.getId());
        				departInfoDao.deleteByExampleInLogic(subRecord);
        			}
        		}
        	}
        }
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = departInfoDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(DepartInfoExample example){
        Integer count = departInfoDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(DepartInfo entity){
        int resultKey = departInfoDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
	public LayGridReturn selectDataGridByExample(DepartInfoExample record) {
		return new LayGridReturn(0, "", departInfoDao.selectByExample(record), departInfoDao.countByExample(record));
	}
	
	@Override
    @Transactional
    public AjaxJson saveOrUpdate(DepartInfo entity){
		Integer id = entity.getId();
		if(BaseUtil.isEmpty(id)){
			//而后验证是否名称重复
			DepartInfoExample departInfoExample = new DepartInfoExample();
			departInfoExample.or().andNameEqualTo(entity.getName())
									.andParentIdEqualTo(entity.getParentId())
									.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
			if(!BaseUtil.isEmpty(departInfoDao.selectByExample(departInfoExample)))
				return AjaxJson.fail("名称不可重复");
			departInfoDao.insertSelective(entity);
		}else{
			//而后验证是否名称重复
			DepartInfoExample departInfoExample = new DepartInfoExample();
			departInfoExample.or().andNameEqualTo(entity.getName())
									.andParentIdEqualTo(entity.getParentId())
									.andIdNotEqualTo(entity.getId())
									.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
			if(!BaseUtil.isEmpty(departInfoDao.selectByExample(departInfoExample)))
				return AjaxJson.fail("已有重复名称");
			
			/*//在修改一个组织机构之前，需要判断这个组织机构是否实际改变了级次，如果改变则所有子组织都要改变
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("id", entity.getParentId());
			List<DepartModule> pDptList = departInfoDao.selectParentTreeDepartByCondition(param);
			//查询当前企业在修改之前的位置
			param = new HashMap<String, Object>();
			param.put("id", entity.getId());
			List<DepartModule> dptList = departInfoDao.selectParentTreeDepartByCondition(param);
			if(!BaseUtil.isEmpty(dptList)){
				if((pDptList.size()+1) != dptList.size()){
					//改变了级次之后，根据级次的增量，依次改变当前以及所有子公司的逻辑级次
					Integer reduce = pDptList.size()+1 - dptList.size();
					entity.setLevel(entity.getLevel() + reduce);
					//依次改下级的逻辑级次
					new HashMap<String, Object>();
					param.put("rootId", entity.getId());
					param.put("otherParam", "(level = level + )"+reduce);
					param.put("otherCondition", " and id != "+entity.getId());
					departInfoDao.updateChildrenDepart(param);
				}
			}*/
			departInfoDao.updateByPrimaryKeySelective(entity);
		}
        return AjaxJson.returnJsonObj(true);
    }
	
	@Override
	public List<DepartTree> getDepartList(Map<String, Object> param) {
		List<DepartModule> dicData = departInfoDao.selectTreeDepartByCondition(param);
		List<DepartTree> menus = DepartUtils.drawMenuDepartTree(dicData, BaseUtil.retStr(param.get("rootId")), null);
		if(menus == null){
			menus = new ArrayList<DepartTree>();
		}
		return menus;
	}

	@Override
	@Transactional
	public AjaxJson changeClass(Map<String, Object> param) {
		Integer targetId = Integer.parseInt(BaseUtil.retStr(param.get("targetId"))); //目标机构id
		Integer targetLevel = Integer.parseInt(BaseUtil.retStr(param.get("targetLevel"))); //目标机构level
		Integer sourceId = Integer.parseInt(BaseUtil.retStr(param.get("sourceId"))); //源机构id
		Integer sourceLevel = Integer.parseInt(BaseUtil.retStr(param.get("sourceLevel"))); //源机构level
		
		//先改源机构的层级
		DepartInfo depart = new DepartInfo();
		depart.setId(sourceId);
		depart.setParentId(targetId);
		departInfoDao.updateByPrimaryKeySelective(depart);
		
		//比较前后的逻辑级次，如果有变化，则批量修改
		if(!BaseUtil.isEmpty(sourceLevel) && !BaseUtil.isEmpty(targetLevel)){
			if((targetLevel+1) != sourceLevel){
				//改变了级次之后，根据级次的增量，依次改变当前以及所有子公司的逻辑级次
				Integer reduce = targetLevel+1 - sourceLevel;
				//依次改下级的逻辑级次
				new HashMap<String, Object>();
				param.put("rootId", sourceId);
				param.put("otherParam", "level = level + "+reduce);
				departInfoDao.updateChildrenDepart(param);
			}
		}
		
		return AjaxJson.returnJsonObj(true);
	}
    
}