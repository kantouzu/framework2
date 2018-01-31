package com.cisdi.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cisdi.base.controller.BaseController;
import com.cisdi.business.entity.SessionToken;
import com.cisdi.business.example.SessionTokenExample;
import com.cisdi.business.service.SessionTokenService;

import com.cisdi.base.common.json.AjaxJson;

@Controller
@RequestMapping(value="sessionTokenController")
public class SessionTokenController extends BaseController {

    @Autowired
    private SessionTokenService sessionTokenService;
    
    @RequestMapping(value = "pageList")
    public ModelAndView list(SessionToken sessionToken, SessionTokenExample sessionTokenExample) {
        
        ModelAndView mv = new ModelAndView();
        List<SessionToken> dataList = sessionTokenService.selectByExample(sessionTokenExample);
        mv.setViewName("SessionToken/SessionTokenList");
        mv.addObject("dataList", dataList);
        return mv;
    }
    
    @RequestMapping(value = "add", method=RequestMethod.POST)
    @ResponseBody
    public AjaxJson add(SessionToken sessionToken) {
        
        return sessionTokenService.insertSelective(sessionToken);
    }    
    
    @RequestMapping(value = "update", method=RequestMethod.POST)
    @ResponseBody
    public AjaxJson update(SessionToken sessionToken) {
        
        return sessionTokenService.updateByPrimaryKeySelective(sessionToken);
    }
    
    @RequestMapping(value = "delete", method=RequestMethod.POST)
    @ResponseBody
    public AjaxJson delete(Integer id) {
        
        return sessionTokenService.deleteByPrimaryKey(id);
    }    
}