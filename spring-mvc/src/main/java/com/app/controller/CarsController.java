package com.app.controller;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cars")
public class CarsController {

	@GetMapping
	// @RequestMapping(method=RequestMethod.GET)
	public String get(Model model) {

		String[] cars = {"car1"};

		//
		if (cars.length == 0) {
			throw new RuntimeException("failed to load cars");
		}

		model.addAttribute("cars", cars);
		return "cars";
	}

	//	@ExceptionHandler(value = { RuntimeException.class })
	//	public ModelAndView handleAnyRuntimeException(RuntimeException ex) {
	//		ModelAndView mav=new ModelAndView();
	//		mav.addObject("exception", ex);
	//		mav.setViewName("error");
	//		return mav;
	//	}

}
