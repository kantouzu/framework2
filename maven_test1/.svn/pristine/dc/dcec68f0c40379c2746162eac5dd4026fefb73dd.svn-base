package com.cisdi.business.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.cisdi.base.common.enums.SystemResourceUtil;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.controller.BaseController;


@Controller
@RequestMapping(value="enumJson")
public class EnumJsonController extends BaseController {
	
	/**
	 * 根据条件返回枚举列表
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */
	@RequestMapping(value = "commonEnumReturn")
	public @ResponseBody AjaxJson commonEnumReturn(HttpServletRequest req) {
		String condition = req.getParameter("condition");
		Map<String, Object> enumMap = null;
		List<Map<String, Object>> enumNames = new ArrayList<Map<String, Object>>();
		for (String val : condition.split("\\|")) {
			enumMap = new HashMap<String, Object>();
			enumMap.put("value", JSONArray.toJSON(SystemResourceUtil.getCommonEnumList(val)));
			enumMap.put("name", val);
			enumNames.add(enumMap);
		}
		return AjaxJson.returnJsonObj(true,JSONArray.toJSON(enumNames));
	}
	
	/**
	 * 根据条件返回枚举列表（选中框）
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */
	@RequestMapping(value = "selectedEnumReturn")
	public @ResponseBody AjaxJson selectedEnumReturn(HttpServletRequest req) {
		String condition = req.getParameter("condition");
		Map<String, Object> enumMap = null;
		List<Map<String, Object>> enumNames = new ArrayList<Map<String, Object>>();
		for (String val : condition.split("\\|")) {
			String v[] = val.split("_");
			enumMap = new HashMap<String, Object>();
			enumMap.put("value", JSONArray.toJSON(SystemResourceUtil.getCommonEnumList(v[0])));
			enumMap.put("name", v[0]);
			enumMap.put("selectedValue", v.length>1?v[1]:"null");
			enumNames.add(enumMap);
		}
		return AjaxJson.returnJsonObj(true,JSONArray.toJSON(enumNames));
	}
	
	/**
	 * 根据枚举名称返回对应的列表
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */
	@RequestMapping(value = "selectedEnumReturnByEnumName")
	public @ResponseBody AjaxJson selectedEnumReturnByEnumName(HttpServletRequest req) {
		String enumName = req.getParameter("enumName");
		return AjaxJson.returnJsonObj(true,JSONArray.toJSON(SystemResourceUtil.getCommonEnumList(enumName)));
	}
	
}
