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
import com.cisdi.business.entity.Dictionary;
import com.cisdi.business.entity.Menu;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.DictionaryExample;
import com.cisdi.business.example.MenuExample;
import com.cisdi.business.service.DictionaryService;
import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.common.responseBean.LayGridReturn;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.requestBean.DataGrid;
import com.cisdi.business.responseBean.LayerTree;
import com.cisdi.business.common.annotation.SystemLog;

@Controller
@RequestMapping(value="dictionaryController")
public class DictionaryController extends BaseController {

    @Autowired
    private DictionaryService dictionaryService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(HttpServletRequest req, Dictionary dictionary, DictionaryExample dictionaryExample) {
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Dictionary/DictionaryList");
        return mv;
    }
    
    @RequestMapping(value = "dataList")
    @ResponseBody
    public LayGridReturn dataList(HttpServletRequest req, Dictionary dictionary, DictionaryExample dictionaryExample, DataGrid datagrid) {
    	dictionaryExample.setLimitStart(datagrid.getStartRow());
    	dictionaryExample.setLimitEnd(datagrid.getLimit());
    	dictionaryExample.setOrderByClause("order by id desc");
    	dictionaryExample.or().andDeleteflagEqualTo(YesOrNo.否.getValue());
    	return dictionaryService.selectDataGridByExample(dictionaryExample);
    	
    }
    
    @RequestMapping(value = "getDicLayerTree")
    @ResponseBody
    public List<LayerTree> getDicLayerTree(HttpServletRequest req, Dictionary dictionary) {
    	try {
    		Map<String, Object> param = new HashMap<String, Object>();
    		if(!BaseUtil.isEmpty(dictionary.getDicType()))
    			param.put("dicType", dictionary.getDicType());
    		param.put("rootId", dictionary.getParentId());
    		if(!BaseUtil.isEmpty(dictionary.getName()))
    			param.put("name", '%'+dictionary.getName()+'%');
    		List<LayerTree> ModuleList=dictionaryService.getMenuList(param);
    		return ModuleList;
    	} catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    }
    
    @RequestMapping(value = "goAddOrEdit")
    public ModelAndView goAddOrEdit(HttpServletRequest req, Dictionary dictionary, DictionaryExample dictionaryExample, boolean isCheckOnly) {
        
        ModelAndView mv = new ModelAndView();
        Dictionary entity = dictionaryService.selectByPrimaryKey(dictionary.getId());
        mv.setViewName("Dictionary/DictionaryEdit");
        mv.addObject("dictionary", entity);
        mv.addObject("isCheckOnly", isCheckOnly);
        mv.addObject("parentId", dictionary.getParentId());
        return mv;
    }
    
    @RequestMapping(value = "doSaveOrUpdate", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_DICTIONARY,description = "dictionary",businessType=CommonConstant.BUSINESS_ADDOREDIT)
    public AjaxJson doSaveOrUpdate(HttpServletRequest req, Dictionary dictionary) {
    	AjaxJson j = null;
        try {
        	j = dictionaryService.saveOrUpdate(dictionary);
        	return j;
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxJson.returnJsonObj(false);
		}
    } 
    
    @RequestMapping(value = "batchDelete", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_DICTIONARY,description = "dictionary",businessType=CommonConstant.BUSINESS_DEL)
    public AjaxJson batchDelete(HttpServletRequest req, @RequestParam List<Integer> ids) {
        DictionaryExample dictionaryExample = new DictionaryExample();
        dictionaryExample.or().andIdIn(ids);
        return dictionaryService.deleteByExample(dictionaryExample);
    }    
    
    @RequestMapping(value = "batchDeleteInLogic", method=RequestMethod.POST)
    @ResponseBody
    @SystemLog(module = CommonConstant.LOG_DICTIONARY,description = "dictionary",businessType=CommonConstant.BUSINESS_DELINLOGIC)
    public AjaxJson batchDeleteInLogic(HttpServletRequest req, @RequestParam List<Integer> ids) {
        DictionaryExample dictionaryExample = new DictionaryExample();
        dictionaryExample.or().andIdIn(ids);
        return dictionaryService.deleteByExampleInLogic(dictionaryExample);
    }  
}