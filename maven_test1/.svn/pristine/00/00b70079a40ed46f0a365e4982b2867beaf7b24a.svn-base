package com.cisdi.business.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cisdi.base.common.constant.CommonConstant;
import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.enums.CommonEnumType.RoleType;
import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.controller.BaseController;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.common.annotation.SystemLog;
import com.cisdi.business.entity.UserdepartRelRole;
import com.cisdi.business.example.RoleInfoExample;
import com.cisdi.business.example.UserdepartRelRoleExample;
import com.cisdi.business.requestBean.DataGrid;
import com.cisdi.business.service.RoleInfoService;
import com.cisdi.business.service.UserdepartRelRoleService;

@Controller
@RequestMapping(value="userdepartRelRoleController")
public class UserdepartRelRoleController extends BaseController {

    @Autowired
    private UserdepartRelRoleService userdepartRelRoleService;
    @Autowired
    private RoleInfoService roleInfoService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(HttpServletRequest req, UserdepartRelRole userdepartRelRole, UserdepartRelRoleExample userdepartRelRoleExample) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("UserdepartRelRole/UserdepartRelRoleList");
        return mv;
    }
    
    @RequestMapping(value = "dataList")
    @ResponseBody
    public LayGridReturn dataList(HttpServletRequest req, UserdepartRelRole userdepartRelRole, UserdepartRelRoleExample userdepartRelRoleExample, DataGrid datagrid) {
    	userdepartRelRoleExample.setLimitStart(datagrid.getStartRow());
    	userdepartRelRoleExample.setLimitEnd(datagrid.getLimit());
    	userdepartRelRoleExample.setOrderByClause("order by id desc");
    	userdepartRelRoleExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue());
    	return userdepartRelRoleService.selectDataGridByExample(userdepartRelRoleExample);
    	
    }
    
    @RequestMapping(value = "goAddOrEdit")
    public ModelAndView goAddOrEdit(HttpServletRequest req, UserdepartRelRole userdepartRelRole, UserdepartRelRoleExample userdepartRelRoleExample, boolean isCheckOnly) {
        
        ModelAndView mv = new ModelAndView();
        UserdepartRelRole entity = userdepartRelRoleService.selectByPrimaryKey(userdepartRelRole.getId());
        mv.setViewName("UserdepartRelRole/UserdepartRelRoleEdit");
        mv.addObject("userdepartRelRole", entity);
        mv.addObject("isCheckOnly", isCheckOnly);
        return mv;
    }
    
    @RequestMapping(value = "doSaveOrUpdate", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USERDEPART_REL_ROLE,description = "userdepart_rel_role",businessType=CommonConstant.BUSINESS_ADDOREDIT)
    public AjaxJson doSaveOrUpdate(HttpServletRequest req, UserdepartRelRole userdepartRelRole) {
    	AjaxJson j = null;
        try {
        	j = userdepartRelRoleService.saveOrUpdate(userdepartRelRole);
        	return j;
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    } 
    
    @RequestMapping(value = "batchDelete", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USERDEPART_REL_ROLE,description = "userdepart_rel_role",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson batchDelete(HttpServletRequest req, @RequestParam List<Integer> ids) {
        UserdepartRelRoleExample userdepartRelRoleExample = new UserdepartRelRoleExample();
        userdepartRelRoleExample.or().andIdIn(ids);
        return userdepartRelRoleService.deleteByExample(userdepartRelRoleExample);
    }    
    
    @RequestMapping(value = "batchDeleteInLogic", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USERDEPART_REL_ROLE,description = "userdepart_rel_role",businessType=CommonConstant.BUSINESS_DELINLOGIC)
    public AjaxJson batchDeleteInLogic(HttpServletRequest req, @RequestParam List<Integer> ids) {
        UserdepartRelRoleExample userdepartRelRoleExample = new UserdepartRelRoleExample();
        userdepartRelRoleExample.or().andIdIn(ids);
        return userdepartRelRoleService.deleteByExampleInLogic(userdepartRelRoleExample);
    }  
    
    /**
     * 刷新用户业务角色权限，先删除对应userdepartId的所有关联数据，再重新添加
     * @param req
     * @param roleCode
     * @param userId
     * @return
     */
    @RequestMapping(value = "flushUserdepartRelRoles", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_USERDEPART_REL_ROLE,description = "刷新用户业务角色权限",businessType=CommonConstant.BUSINESS_OTHER)
    public AjaxJson flushUserRelRoles(HttpServletRequest req, @RequestParam List<Integer> roleId, String userdepartId) {
    	AjaxJson j = null;
        try {
        	Map<String, Object> businessMap = new HashMap<String, Object>();
        	businessMap.put("userdepartId", userdepartId);
        	businessMap.put("roleId", roleId);
        	return userdepartRelRoleService.flushUserdepartRelRoles(businessMap);
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    }
    
    /**
     * 根据userdepart_id获取所有角色权限，并对每个角色权限找到对应枚举值
     * @param req
     * @param userId
     * @return
     */
    @RequestMapping(value = "loadUserDepartRoles", method=RequestMethod.POST)
    @ResponseBody
    public AjaxJson loadUserDepartRoles(HttpServletRequest req, Integer userdepartId) {
    	AjaxJson j = null;
        try {
        	UserdepartRelRoleExample userdepartRelRoleExample = new UserdepartRelRoleExample();
        	userdepartRelRoleExample.or().andUserdepartIdEqualTo(userdepartId);
        	List<Map<String, Object>> userDepartRelRoles = 
        			userdepartRelRoleService.selectByExample(userdepartRelRoleExample);
        	//先获取所有业务角色list
        	RoleInfoExample roleInfoExample = new RoleInfoExample();
        	roleInfoExample.or().andRoleTypeEqualTo(RoleType.业务型.getValue())
        						.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
        	List<Map<String, Object>> allRoles = roleInfoService.selectByExample(roleInfoExample);
        	String userRelRolesStr = "";
        	if(!BaseUtil.isEmpty(userDepartRelRoles)){
				for (Map<String, Object> userRelRole : userDepartRelRoles) {
					userRelRolesStr += BaseUtil.retStr(userRelRole.get("roleId"))+",";
				}
        	}
        	Map<String, Object> resultMap = new HashMap<String, Object>();
        	resultMap.put("allRoles", allRoles);
        	resultMap.put("userRelRolesStr", userRelRolesStr);
        	return AjaxJson.returnJsonObj(true, resultMap);
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    }
}