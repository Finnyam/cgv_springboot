package com.springboot.mycgv.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springboot.mycgv.dto.SessionDto;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionAuthInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		    throws Exception {
		HttpSession session = request.getSession();
		SessionDto svo = (SessionDto) session.getAttribute("svo");
		if(svo == null) {
			response.sendRedirect("/login");
			return false;
		}
			return true;
		}
	
	
	
}
