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
import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.controller.BaseController;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.common.annotation.SystemLog;
import com.cisdi.business.entity.LocationInfo;
import com.cisdi.business.example.LocationInfoExample;
import com.cisdi.business.requestBean.DataGrid;
import com.cisdi.business.responseBean.LayerTree;
import com.cisdi.business.service.LocationInfoService;

@Controller
@RequestMapping(value="locationInfoController")
public class LocationInfoController extends BaseController {

    @Autowired
    private LocationInfoService locationInfoService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(HttpServletRequest req, LocationInfo locationInfo, LocationInfoExample locationInfoExample) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LocationInfo/LocationInfoList");
        return mv;
    }
    
    @RequestMapping(value = "dataList")
    @ResponseBody
    public LayGridReturn dataList(HttpServletRequest req, LocationInfo locationInfo, LocationInfoExample locationInfoExample, DataGrid datagrid) {
    	locationInfoExample.setLimitStart(datagrid.getStartRow());
    	locationInfoExample.setLimitEnd(datagrid.getLimit());
    	locationInfoExample.setOrderByClause(" order by id ");
    	locationInfoExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue());
    	return locationInfoService.selectDataGridByExample(locationInfoExample);
    	
    }
    
    @RequestMapping(value = "totalList")
    @ResponseBody
    public AjaxJson totalList(HttpServletRequest req, LocationInfo locationInfo, LocationInfoExample locationInfoExample, DataGrid datagrid) {
    	locationInfoExample.setOrderByClause(" order by id ");
    	try {
    		locationInfoExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue())
    								.andParentIdEqualTo(locationInfo.getParentId())
    								.andNameEqualTo(locationInfo.getName());
    		List<Map<String, Object>> resultList = locationInfoService.selectByExample(locationInfoExample);
    		return AjaxJson.returnJsonObj(true, resultList);
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    	
    }
    
    @RequestMapping(value = "getLocLayerTree")
    @ResponseBody
    public List<LayerTree> getLocLayerTree(HttpServletRequest req, LocationInfo locationInfo) {
    	try {
    		Map<String, Object> param = new HashMap<String, Object>();
    		param.put("rootId", locationInfo.getParentId());
    		if(!BaseUtil.isEmpty(locationInfo.getName()))
    			param.put("name", '%'+locationInfo.getName()+'%');
    		List<LayerTree> ModuleList=locationInfoService.getLocList(param);
    		return ModuleList;
    	} catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    }
    
    @RequestMapping(value = "goAddOrEdit")
    public ModelAndView goAddOrEdit(HttpServletRequest req, LocationInfo locationInfo, LocationInfoExample locationInfoExample, boolean isCheckOnly) {
        
        ModelAndView mv = new ModelAndView();
        LocationInfo entity = locationInfoService.selectByPrimaryKey(locationInfo.getId());
        mv.setViewName("LocationInfo/LocationInfoEdit");
        mv.addObject("locationInfo", entity);
        mv.addObject("isCheckOnly", isCheckOnly);
        mv.addObject("parentId", locationInfo.getParentId());
        return mv;
    }
    
    @RequestMapping(value = "doSaveOrUpdate", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_LOCATION_INFO,description = "location_info",businessType=CommonConstant.BUSINESS_ADDOREDIT)
    public AjaxJson doSaveOrUpdate(HttpServletRequest req, LocationInfo locationInfo) {
    	AjaxJson j = null;
        try {
        	j = locationInfoService.saveOrUpdate(locationInfo);
        	return j;
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    } 
    
    @RequestMapping(value = "batchDelete", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_LOCATION_INFO,description = "location_info",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson batchDelete(HttpServletRequest req, @RequestParam List<Integer> ids) {
        LocationInfoExample locationInfoExample = new LocationInfoExample();
        locationInfoExample.or().andIdIn(ids);
        return locationInfoService.deleteByExample(locationInfoExample);
    }    
    
    @RequestMapping(value = "batchDeleteInLogic", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_LOCATION_INFO,description = "location_info",businessType=CommonConstant.BUSINESS_DELINLOGIC)
    public AjaxJson batchDeleteInLogic(HttpServletRequest req, @RequestParam List<Integer> ids) {
        LocationInfoExample locationInfoExample = new LocationInfoExample();
        locationInfoExample.or().andIdIn(ids);
        return locationInfoService.deleteByExampleInLogic(locationInfoExample);
    }  
}