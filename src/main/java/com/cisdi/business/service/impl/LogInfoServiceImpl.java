package com.cisdi.business.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.service.impl.BaseServiceImpl;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.dao.LogInfoDao;
import com.cisdi.business.entity.LogInfo;
import com.cisdi.business.example.LogInfoExample;
import com.cisdi.business.service.LogInfoService;

@Service
public class LogInfoServiceImpl extends BaseServiceImpl implements LogInfoService {

    @Autowired
    private LogInfoDao logInfoDao;
    
    @Override
    public LogInfo selectByPrimaryKey(Integer id) {
        LogInfo result = logInfoDao.selectByPrimaryKey(id);
        return result;
    }
    
    @Override
    public List<Map<String, Object>> selectByExample(LogInfoExample  record) {
        List<Map<String, Object>> result = logInfoDao.selectByExample(record);
        return result;
    }    

    @Override
    @Transactional
    public AjaxJson insertSelective(LogInfo record) {
         int resultKey = logInfoDao.insertSelective(record);
         return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }   
    
    @Override
    @Transactional
    public AjaxJson deleteByExample(LogInfoExample  record) {
        int resultKey = logInfoDao.deleteByExample(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    @Transactional
    public AjaxJson deleteByExampleInLogic(LogInfoExample  record) {
        int resultKey = logInfoDao.deleteByExampleInLogic(record);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }

    @Override
    @Transactional
    public AjaxJson deleteByPrimaryKey(Integer id) {
        int resultKey = logInfoDao.deleteByPrimaryKey(id);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
    public AjaxJson countByExample(LogInfoExample example){
        Integer count = logInfoDao.countByExample(example);
        return AjaxJson.returnJsonObj(true, count);
    }
    
    @Override
    @Transactional
    public AjaxJson updateByPrimaryKeySelective(LogInfo entity){
        int resultKey = logInfoDao.updateByPrimaryKeySelective(entity);
        return AjaxJson.returnJsonObj(resultKey != 0?true:false);
    }
    
    @Override
	public LayGridReturn selectDataGridByExample(LogInfoExample record) {
		return new LayGridReturn(0, "", logInfoDao.selectByExample(record), logInfoDao.countByExample(record));
	}
	
	@Override
    @Transactional
    public AjaxJson saveOrUpdate(LogInfo entity){
		Integer id = entity.getId();
		if(BaseUtil.isEmpty(id)){
			logInfoDao.insertSelective(entity);
		}else{
			logInfoDao.updateByPrimaryKeySelective(entity);
		}
        return AjaxJson.returnJsonObj(true);
    }
    
}