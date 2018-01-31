package com.cisdi.base.common.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cisdi.base.util.BaseUtil;

/**
 * * @author 作者 jinl: * @date 创建时间：2016年11月10日 下午4:57:39 * @version 1.0 * @parameter
 * * @since * @return
 */
public class VisitorFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.addHeader("Access-Control-Allow-Origin", "*"); //解决跨域的server请求头
		resp.addHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
		resp.addHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String URL = req.getRequestURI().toString();
		if(!URL.endsWith("/"))URL += "/";
		int l = URL.split("/").length;
		//单点登录标记
//        String  visitCen=req.getParameter("visitCen");
//		if(!URL.contains("/login") && !URL.contains("/Login") && !URL.contains("resources")&&!URL.contains("/personUserController")
//				&&!"2".equals(visitCen)&&!URL.contains("/contentMs")
//				&&!URL.contains("/releaseInfo/viewImage")
//				&&!URL.contains("/common/viewImage")
//				&&!URL.contains("/common/viewLogoImage")
//				&&!URL.contains("/auditMobile")&&!URL.contains("/sys/login")&&!URL.contains("/sys/checkLogin")
//				&&!URL.contains("mobile_trainInfo")&&!URL.contains("visitorController")){
//         	HttpSession session = req.getSession();
//         	UserInfo users = (UserInfo) session.getAttribute("user");
//			if (BaseUtil.isEmpty(users)) {
//				resp.sendRedirect(req.getContextPath() + "/login");
//				return;
//			} else if (l==1 || l==0){
//				resp.sendRedirect(req.getContextPath() + "/userMain");
//				return;
//			} 
//		}
		chain.doFilter(req, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
