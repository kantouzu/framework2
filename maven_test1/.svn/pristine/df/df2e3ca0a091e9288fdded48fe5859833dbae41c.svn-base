package com.cisdi.business.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.cisdi.business.entity.UserRelDepart;
import com.cisdi.business.example.UserRelDepartExample;
import com.cisdi.business.service.UserRelDepartService;
import com.cisdi.business.util.BusinessUtil;
import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.requestBean.DataGrid;
import com.cisdi.business.common.annotation.SystemLog;

@Controller
@RequestMapping(value="userRelDepartController")
public class UserRelDepartController extends BaseController {

    @Autowired
    private UserRelDepartService userRelDepartService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(HttpServletRequest req, UserRelDepart userRelDepart, UserRelDepartExample userRelDepartExample) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("UserRelDepart/UserRelDepartList");
        return mv;
    }
    
    @RequestMapping(value = "dataList")
    @ResponseBody
    public LayGridReturn dataList(HttpServletRequest req, UserRelDepart userRelDepart, UserRelDepartExample userRelDepartExample, DataGrid datagrid) {
    	userRelDepartExample.setLimitStart(datagrid.getStartRow());
    	userRelDepartExample.setLimitEnd(datagrid.getLimit());
    	userRelDepartExample.setOrderByClause("order by id desc");
    	userRelDepartExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue());
    	return userRelDepartService.selectDataGridByExample(userRelDepartExample);
    }
    
    @RequestMapping(value = "totalList")
    @ResponseBody
    public AjaxJson totalGridList(HttpServletRequest req, UserRelDepart userRelDepart, UserRelDepartExample userRelDepartExample, DataGrid datagrid) {
    	userRelDepartExample.setOrderByClause("order by id desc");
    	userRelDepartExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue())
		 						 .andUserIdEqualTo(userRelDepart.getUserId());
    	return AjaxJson.returnJsonObj(true, userRelDepartService.selectTotalGridByExample(userRelDepartExample));
    }
    
    @RequestMapping(value = "goAddOrEdit")
    public ModelAndView goAddOrEdit(HttpServletRequest req, UserRelDepart userRelDepart, UserRelDepartExample userRelDepartExample, boolean isCheckOnly) {
        
        ModelAndView mv = new ModelAndView();
        UserRelDepart entity = userRelDepartService.selectByPrimaryKey(userRelDepart.getId());
        mv.setViewName("UserRelDepart/UserRelDepartEdit");
        mv.addObject("userRelDepart", entity);
        mv.addObject("isCheckOnly", isCheckOnly);
        return mv;
    }
    
    @RequestMapping(value = "doSaveOrUpdate", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USER_REL_DEPART,description = "user_rel_depart",businessType=CommonConstant.BUSINESS_ADDOREDIT)
    public AjaxJson doSaveOrUpdate(HttpServletRequest req, UserRelDepart userRelDepart) {
    	AjaxJson j = null;
        try {
        	j = userRelDepartService.saveOrUpdate(userRelDepart);
        	return j;
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    } 
    
    @RequestMapping(value = "batchDelete", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USER_REL_DEPART,description = "user_rel_depart",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson batchDelete(HttpServletRequest req, @RequestParam List<Integer> ids) {
        UserRelDepartExample userRelDepartExample = new UserRelDepartExample();
        userRelDepartExample.or().andIdIn(ids);
        return userRelDepartService.deleteByExample(userRelDepartExample);
    }    
    
    @RequestMapping(value = "batchDeleteInLogic", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USER_REL_DEPART,description = "user_rel_depart",businessType=CommonConstant.BUSINESS_DELINLOGIC)
    public AjaxJson batchDeleteInLogic(HttpServletRequest req, @RequestParam List<Integer> ids) {
        UserRelDepartExample userRelDepartExample = new UserRelDepartExample();
        userRelDepartExample.or().andIdIn(ids);
        return userRelDepartService.deleteByExampleInLogic(userRelDepartExample);
    }  
    
    @RequestMapping(value = "unBind", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USER_REL_DEPART,description = "解绑用户的组织机构(带权限)",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson unBind(HttpServletRequest req, @RequestParam List<Integer> ids) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("ids", ids);
        param.put("sessionUser", BusinessUtil.convertSessionUser(getSessionUser(req)));
        return userRelDepartService.unBind(param);
    }  
}