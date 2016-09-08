package com.app.resolvers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		// TODO Auto-generated method stub

		System.out.println("Handling with MyExceptionResolver...");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", arg3);
		mav.setViewName("error");
		return mav;

	}

}
