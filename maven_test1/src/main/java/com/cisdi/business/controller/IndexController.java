package com.cisdi.business.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.controller.BaseController;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.UserRelDepartExample;
import com.cisdi.business.example.UserRelRoleExample;
import com.cisdi.business.service.UserInfoService;
import com.cisdi.business.service.UserRelDepartService;
import com.cisdi.business.service.UserRelRoleService;
import com.cisdi.business.service.UserdepartRelRoleService;
import com.cisdi.business.util.BusinessUtil;


@Controller
public class IndexController extends BaseController{
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private UserRelRoleService userRelRoleService;
	@Autowired
	private UserRelDepartService userRelDepartService;
	@Autowired
	private UserdepartRelRoleService userdepartRelRoleService;
	
	@RequestMapping("home")
	public ModelAndView index(HttpServletRequest req) {
		ModelAndView view = createTreeLayoutView("layout/layout", req);
		
		/**
         * 设置菜单的时候
         * 先查询该用户是否用非业务角色或者业务角色
         */
		UserInfo user = BusinessUtil.convertSessionUser(getSessionUser(req));
		Integer userId = user.getId();
		//先查看session中保存的当前业务角色种类，没有的话先塞进去
		if(BaseUtil.isEmpty(req.getSession().getAttribute("roleMap"))){
			boolean hasRole = false;
			boolean hasBusinessRole = false;
			//查询是否有非业务角色
			UserRelRoleExample userRelRoleExample = new UserRelRoleExample();
			userRelRoleExample.or().andUserIdEqualTo(userId);
			Integer userRelRoleCount = (Integer) userRelRoleService.countByExample(userRelRoleExample).getObj();
			hasRole = userRelRoleCount <= 0?false:true;
			//查询是否有业务角色
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("userId", userId);
			paramMap.put("deleteflag", DeleteFlag.未删除.getValue());
			Integer userdepartRelRoleCount = (Integer) userdepartRelRoleService.countRoleByExample(paramMap).getObj();
			hasBusinessRole = userdepartRelRoleCount <= 0?false:true;
			Map<String, Object> roleMap = new HashMap<String, Object>();
			roleMap.put("hasRole", hasRole);
			roleMap.put("hasBusinessRole", hasBusinessRole);
			//塞入角色种类的数量
			Integer roleTypeCount = 0;
			Map<String, Object> roleTypeMap = new HashMap<String, Object>();
			List<Map<String, Object>> roleTypeList = new ArrayList<Map<String,Object>>();
			if(hasBusinessRole){
				Map<String, Object> role = new HashMap<String, Object>();
				role.put("value", "business");
				role.put("name", "业务型角色");
				roleTypeList.add(role);
				roleTypeCount ++;
				//再查询一下当前用户绑定的单位信息
				UserRelDepartExample userRelDepartExample = new UserRelDepartExample();
				userRelDepartExample.or().andUserIdEqualTo(userId)
				.andDeleteflagEqualTo(DeleteFlag.未删除.getValue());
				List<Map<String, Object>> userDepartList =
						userRelDepartService.selectTotalGridByExample(userRelDepartExample);
				roleMap.put("userDepartList", userDepartList);
				if(!BaseUtil.isEmpty(userDepartList)){
					user.setDepartId(Integer.parseInt(BaseUtil.retStr(userDepartList.get(0).get("departId"))));
					req.getSession().setAttribute("user", user);
				}
			}
			if(hasRole){
				Map<String, Object> role = new HashMap<String, Object>();
				role.put("value", "notBusiness");
				role.put("name", "非业务型角色");
				roleTypeList.add(role);
				roleTypeCount ++;
			}
			roleTypeMap.put("roleTypeCount", roleTypeCount);
			roleTypeMap.put("roleTypeList", roleTypeList);
			roleMap.put("roleTypeMap", roleTypeMap);
			req.getSession().setAttribute("roleMap", roleMap);
			view.addObject("roleMap", roleMap);
		}else{
			view.addObject("roleMap", req.getSession().getAttribute("roleMap"));
		}
		view.addObject("user", user);
		return view;
	}
}
