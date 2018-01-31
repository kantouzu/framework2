package com.cisdi.business.controller;

import java.util.ArrayList;
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
import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.controller.BaseController;
import com.cisdi.business.common.annotation.SystemLog;
import com.cisdi.business.entity.Menu;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.MenuExample;
import com.cisdi.business.requestBean.DataGrid;
import com.cisdi.business.responseBean.LayerTree;
import com.cisdi.business.service.MenuService;
import com.cisdi.business.service.UserInfoService;
import com.cisdi.business.util.BusinessUtil;

@Controller
@RequestMapping(value="menuController")
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private UserInfoService userInfoService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(HttpServletRequest req, Menu menu, MenuExample menuExample) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Menu/MenuList");
        return mv;
    }
    
    @RequestMapping(value = "dataList")
    @ResponseBody
    public LayGridReturn dataList(Menu menu, MenuExample menuExample, DataGrid datagrid) {
    	menuExample.setLimitStart(datagrid.getStartRow());
    	menuExample.setLimitEnd(datagrid.getLimit());
    	menuExample.setOrderByClause("order by id desc");
    	menuExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue());
    	return menuService.selectDataGridByExample(menuExample);
    }
    
    @RequestMapping(value = "getAllMenuTree")
    @ResponseBody
    public AjaxJson getAllMenuTree(HttpServletRequest req, Menu menu, MenuExample menuExample, Integer departId, boolean hasRole, boolean hasBusinessRole) {
    	try {
    		List<LayerTree> ModuleList = new ArrayList<LayerTree>();
    		if(YesOrNo.是.getValue().equals(BusinessUtil.convertSessionUser(getSessionUser(req)).getIsSuperAdmin())){
    			ModuleList = userInfoService.getAllMenus(null);
    		}else{
    			UserInfo user = BusinessUtil.convertSessionUser(getSessionUser(req));
    			user.setDepartId(departId);
    			req.getSession().setAttribute("user", user);
    			Integer userId = user.getId();
    			/**
    			 * 如果有且只有一种角色，则直接加载对应的菜单即可
    			 */
    			if(!hasBusinessRole && hasRole){
    				//只有非业务角色
    				ModuleList = userInfoService.getMenus(userId);
    			}else if(hasBusinessRole && !hasRole){
    				//只有业务角色
    				Map<String, Object> param = new HashMap<String, Object>();
    				param.put("userId", userId);
    				param.put("departId", departId);
    				ModuleList = userInfoService.getBusinessMenus(param);
    			}else if(hasBusinessRole && hasRole){
    				//两者都有，则默认加载业务角色的菜单
    				Map<String, Object> param = new HashMap<String, Object>();
    				param.put("userId", userId);
    				param.put("departId", departId);
    				ModuleList = userInfoService.getBusinessMenus(param);
    			}
    		}
    		return AjaxJson.returnJsonObj(true, ModuleList);
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    }
    
    @RequestMapping(value = "getMenuLayerTree")
    @ResponseBody
    public List<LayerTree> getMenuLayerTree(HttpServletRequest req, Menu menu, MenuExample menuExample) {
    	try {
    		List<LayerTree> ModuleList = new ArrayList<LayerTree>();
    		if(YesOrNo.是.getValue().equals(BusinessUtil.convertSessionUser(getSessionUser(req)).getIsSuperAdmin())){
    			ModuleList = userInfoService.getAllMenus(null);
    		}else{
    			ModuleList=userInfoService.getMenus(((UserInfo) getSessionUser(req).getObj()).getId());
    		}
    		return ModuleList;
    	} catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    }
    
    @RequestMapping(value = "goAddOrEdit")
    public ModelAndView goAddOrEdit(Menu menu, MenuExample menuExample, boolean isCheckOnly) {
        
        ModelAndView mv = new ModelAndView();
        Menu entity = menuService.selectByPrimaryKey(menu.getId());
        mv.setViewName("Menu/MenuEdit");
        mv.addObject("menu", entity);
        mv.addObject("isCheckOnly", isCheckOnly);
        return mv;
    }
    
    @RequestMapping(value = "doSaveOrUpdate", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_MENU,description = "menu",businessType=CommonConstant.BUSINESS_ADDOREDIT)
    public AjaxJson doSaveOrUpdate(Menu menu) {
    	AjaxJson j = null;
        try {
        	j = menuService.saveOrUpdate(menu);
        	return j;
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    } 
    
    @RequestMapping(value = "batchDelete", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_MENU,description = "menu",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson batchDelete(@RequestParam List<Integer> ids) {
        MenuExample menuExample = new MenuExample();
        menuExample.or().andIdIn(ids);
        return menuService.deleteByExample(menuExample);
    }    
    
    @RequestMapping(value = "batchDeleteInLogic", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_MENU,description = "menu",businessType=CommonConstant.BUSINESS_DELINLOGIC)
    public AjaxJson batchDeleteInLogic(@RequestParam List<Integer> ids) {
        MenuExample menuExample = new MenuExample();
        menuExample.or().andIdIn(ids);
        return menuService.deleteByExampleInLogic(menuExample, ids);
    }  
}