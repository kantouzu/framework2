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
import com.cisdi.business.entity.RoleInfo;
import com.cisdi.business.example.RoleInfoExample;
import com.cisdi.business.service.RoleInfoService;

import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.business.requestBean.DataGrid;
import com.cisdi.business.common.annotation.SystemLog;

@Controller
@RequestMapping(value="roleInfoController")
public class RoleInfoController extends BaseController {

    @Autowired
    private RoleInfoService roleInfoService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(HttpServletRequest req, RoleInfo roleInfo, RoleInfoExample roleInfoExample) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("RoleInfo/RoleInfoList");
        return mv;
    }
    
    @RequestMapping(value = "dataList")
    @ResponseBody
    public LayGridReturn dataList(HttpServletRequest req, RoleInfo roleInfo, RoleInfoExample roleInfoExample, DataGrid datagrid) {
    	roleInfoExample.setLimitStart(datagrid.getStartRow());
    	roleInfoExample.setLimitEnd(datagrid.getLimit());
    	roleInfoExample.setOrderByClause("order by id desc");
    	roleInfoExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue());
    	return roleInfoService.selectDataGridByExample(roleInfoExample);
    	
    }
    
    @RequestMapping(value = "goAddOrEdit")
    public ModelAndView goAddOrEdit(HttpServletRequest req, RoleInfo roleInfo, RoleInfoExample roleInfoExample, boolean isCheckOnly) {
        
        ModelAndView mv = new ModelAndView();
        RoleInfo entity = roleInfoService.selectByPrimaryKey(roleInfo.getId());
        mv.setViewName("RoleInfo/RoleInfoEdit");
        mv.addObject("roleInfo", entity);
        mv.addObject("isCheckOnly", isCheckOnly);
        return mv;
    }
    
    @RequestMapping(value = "doSaveOrUpdate", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_ROLE_INFO,description = "role_info",businessType=CommonConstant.BUSINESS_ADDOREDIT)
    public AjaxJson doSaveOrUpdate(HttpServletRequest req, RoleInfo roleInfo) {
    	AjaxJson j = null;
        try {
        	j = roleInfoService.saveOrUpdate(roleInfo);
        	return j;
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    } 
    
    @RequestMapping(value = "batchDelete", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_ROLE_INFO,description = "role_info",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson batchDelete(HttpServletRequest req, @RequestParam List<Integer> ids) {
        RoleInfoExample roleInfoExample = new RoleInfoExample();
        roleInfoExample.or().andIdIn(ids);
        return roleInfoService.deleteByExample(roleInfoExample);
    }    
    
    @RequestMapping(value = "batchDeleteInLogic", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_ROLE_INFO,description = "role_info",businessType=CommonConstant.BUSINESS_DELINLOGIC)
    public AjaxJson batchDeleteInLogic(HttpServletRequest req, @RequestParam List<Integer> ids) {
        RoleInfoExample roleInfoExample = new RoleInfoExample();
        roleInfoExample.or().andIdIn(ids);
        return roleInfoService.deleteByExampleInLogic(roleInfoExample);
    }  
}