package com.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {

	//	@RequestMapping(value = "/welcome",
	//			        method=RequestMethod.GET,
	//			        params={"p1=123"},
	//			        headers={"Content-Type=application/json"})
	//	public @ResponseBody String m1() {
	//		return "Welcome";
	//	}

	
	// @RequestMapping("/welcome") // Url path will be used for next View for
	// void return
	// public void welcome(){
	// System.out.println("Welcome..");
	// }
	//
	
	
	
	// @RequestMapping("/showcar")
	// public String show(@RequestParam("id") int id, Model model) {
	// model.addAttribute("car", "BMW"); // request.setAttribute('car','BMW);
	// return "car.jsp";
	// }
	
	// or
	
	// @RequestMapping("/showcar")
	// public String show(@RequestParam("id") int id, Map<String,String> model)
	// {
	// model.put("car", "BMW"); // request.setAttribute('car','BMW);
	// return "car.jsp";
	// }
	//
	
	// or
	
	// @RequestMapping("/showcar")
	// public ModelAndView show(@RequestParam("id") int id) {
	// ModelAndView mav = new ModelAndView();
	// mav.addObject("car", "AUDI"); // request.setAttribute('car','BMW);
	// mav.setViewName("car.jsp");
	// return mav;
	// }
	
	
	
	
	
	
}
