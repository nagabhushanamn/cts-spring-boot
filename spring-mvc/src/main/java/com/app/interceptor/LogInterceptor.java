package com.app.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//public class LogInterceptor implements HandlerInterceptor {
public class LogInterceptor extends HandlerInterceptorAdapter{

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		
		System.out.println("LogInterceptor : preHandle");
		
		// session status
		
		// auth
		
		// change request params/header...
		
		// .......
		
		
		return true;
	}
	
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)throws Exception {

		// can verify model-data and View
		
		// can add additional Model-data
		
		System.out.println("LogInterceptor : postHandle");
		
		
	}
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		// response compression ( gzip )
		
		System.out.println("LogInterceptor : afterCompletion");
		
	}

}
