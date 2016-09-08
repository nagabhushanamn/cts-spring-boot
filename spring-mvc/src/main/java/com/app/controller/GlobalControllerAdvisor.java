package com.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalControllerAdvisor {

	// @ModelAttribute
	
	@ModelAttribute
	public void createModelAttribute(Model model) {
		
	}
	
	@InitBinder
	public void customBinding() {
		
	}

	// @ExceptionHandler
	//	
	//	@ExceptionHandler(value = { RuntimeException.class })
	//	public ModelAndView handleAnyRuntimeException(RuntimeException ex) {
	//		ModelAndView mav = new ModelAndView();
	//		mav.addObject("exception", ex);
	//		mav.setViewName("error");
	//		return mav;
	//	}
	//	
	//	@ExceptionHandler(value = { Exception.class })
	//	public ModelAndView handleAnyException(RuntimeException ex) {
	//		ModelAndView mav = new ModelAndView();
	//		mav.addObject("exception", ex);
	//		mav.setViewName("error");
	//		return mav;
	//	}
	//	
	

}
