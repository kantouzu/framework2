package com.cisdi.business.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cisdi.base.common.constant.CommonConstant;
import com.cisdi.base.controller.BaseController;
import com.cisdi.business.entity.LogInfo;
import com.cisdi.business.example.LogInfoExample;
import com.cisdi.business.service.LogInfoService;

import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.business.requestBean.DataGrid;
import com.cisdi.business.common.annotation.SystemLog;

@Controller
@RequestMapping(value="logInfoController")
public class LogInfoController extends BaseController {

    @Autowired
    private LogInfoService logInfoService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(HttpServletRequest req, LogInfo logInfo, LogInfoExample logInfoExample) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LogInfo/LogInfoList");
        return mv;
    }
    
    @RequestMapping(value = "dataList")
    @ResponseBody
    public LayGridReturn dataList(HttpServletRequest req, LogInfo logInfo, LogInfoExample logInfoExample, DataGrid datagrid) {
    	logInfoExample.setLimitStart(datagrid.getStartRow());
    	logInfoExample.setLimitEnd(datagrid.getLimit());
    	logInfoExample.setOrderByClause("order by id desc");
    	logInfoExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue());
    	return logInfoService.selectDataGridByExample(logInfoExample);
    	
    }
    
    @RequestMapping(value = "goAddOrEdit")
    public ModelAndView goAddOrEdit(HttpServletRequest req, LogInfo logInfo, LogInfoExample logInfoExample, boolean isCheckOnly) {
        
        ModelAndView mv = new ModelAndView();
        LogInfo entity = logInfoService.selectByPrimaryKey(logInfo.getId());
        mv.setViewName("LogInfo/LogInfoEdit");
        mv.addObject("logInfo", entity);
        mv.addObject("isCheckOnly", isCheckOnly);
        return mv;
    }
    
    @RequestMapping(value = "doSaveOrUpdate", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_LOG_INFO,description = "log_info",businessType=CommonConstant.BUSINESS_ADDOREDIT)
    public AjaxJson doSaveOrUpdate(HttpServletRequest req, LogInfo logInfo) {
    	AjaxJson j = null;
        try {
        	j = logInfoService.saveOrUpdate(logInfo);
        	return j;
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    } 
    
    @RequestMapping(value = "batchDelete", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_LOG_INFO,description = "log_info",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson batchDelete(HttpServletRequest req, @RequestParam List<Integer> ids) {
        LogInfoExample logInfoExample = new LogInfoExample();
        logInfoExample.or().andIdIn(ids);
        return logInfoService.deleteByExample(logInfoExample);
    }    
    
    @RequestMapping(value = "batchDeleteInLogic", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_LOG_INFO,description = "log_info",businessType=CommonConstant.BUSINESS_DELINLOGIC)
    public AjaxJson batchDeleteInLogic(HttpServletRequest req, @RequestParam List<Integer> ids) {
        LogInfoExample logInfoExample = new LogInfoExample();
        logInfoExample.or().andIdIn(ids);
        return logInfoService.deleteByExampleInLogic(logInfoExample);
    }  
}