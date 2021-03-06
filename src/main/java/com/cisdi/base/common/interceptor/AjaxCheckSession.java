package com.cisdi.base.common.interceptor;  
  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.UrlPathHelper;

import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.entity.UserInfo;
  
  
  
public class AjaxCheckSession  extends HandlerInterceptorAdapter{  
     // URL辅助工具类  
    private UrlPathHelper urlPathHelper = new UrlPathHelper();  
  
    @Override  
    public void afterCompletion(HttpServletRequest request,  
            HttpServletResponse response, Object handler, Exception ex)  
            throws Exception {  
        // TODO Auto-generated method stub  
        super.afterCompletion(request, response, handler, ex);  
    }  
  
    @Override  
    public void postHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler,  
            ModelAndView modelAndView) throws Exception {  
        // TODO Auto-generated method stub  
        super.postHandle(request, response, handler, modelAndView);  
    }  
  
    @Override  
    public boolean preHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler) throws Exception {  
          
         UserInfo user = (UserInfo) request.getSession().getAttribute("user");
          
        String requestCTX = urlPathHelper.getContextPath(request);  
        String requestUri = request.getRequestURI(); //请求完整路径，可用于登陆后跳转  
        String contextPath = request.getContextPath();  //项目下完整路径  
        String url = requestUri.substring(contextPath.length()); //请求页面  
        //throw new Exception("登录超时!");  
        String urls[] = requestUri.split("/");
        if(BaseUtil.isEmpty(user) && !"pcLogin".equals(urls[urls.length - 1])){//如果获取不到登录的session  
            //如果是ajax请求  
            if (request.getHeader("x-requested-with") != null   
                    && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){   
                response.setHeader("sessionstatus", "timeout"); // 响应头设置session状态   
                return false;  //session超时，ajax访问返回false  
            }  
        }  
          
        return super.preHandle(request, response, handler);  
    }  
      
}  