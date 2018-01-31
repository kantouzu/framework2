package com.cisdi.base.common.listener;

import java.util.HashSet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener
{

    @Override
    public void sessionCreated(HttpSessionEvent se)
    {
       
    }

    @SuppressWarnings("unchecked")
    @Override
    public void sessionDestroyed(HttpSessionEvent se)
    {
        // session销毁、移除或失效时调用
        HttpSession session = se.getSession();
        ServletContext application = session.getServletContext();
        HashSet<String> sessions = (HashSet<String>) application.getAttribute("sessions");
        if (sessions != null) {
            // 销毁的用户均从HashSet集中移除
            if(session.getAttribute("userId") != null){
                sessions.remove(session.getAttribute("userId").toString());
            }
        }
        
    }

}
