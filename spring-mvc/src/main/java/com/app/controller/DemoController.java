package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
//@SessionAttributes(names={"todo"})
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
	
	
	//--------------------------------------------------------------------------
	
	
	// Possible args to request-mapping methods
	
	
	//	@RequestMapping("/some-req")
	//	public String name(Model model) {
	//		model.addAttribute("attr1", "Value");
	//		return "view";
	//	}
	
	
	//	@RequestMapping("/some-req")
	//	public String name(Map<String,Object> model) {
	//		model.put("attr1", "Value");
	//		return "view";
	//	}
	//	
	
	
	//	@RequestMapping("/some-req")
	//	public String name(HttpServletRequest req,HttpServletResponse response,HttpSession session) {
	//		
	//		return "view";
	//	}
	
	
	//	@RequestMapping("/some-req")
	//	public @ResponseBody String name(Locale locale) {
	//		System.out.println(locale.toString());
	//		return "resp: DemoController";
	//	}
	
	
	//	@RequestMapping("/some-req")
	//	public @ResponseBody String name(Principal principal) {
	//		return "resp: DemoController";
	//	}
	
	
	/*
	 * @RequestParam
	 * @PathVariable
	 * @CookieParam
	 * @HeaderParam
	 * 
	 */
	
	
	//	@RequestMapping("/some-req")
	//	public @ResponseBody String name(@RequestParam(required=true,defaultValue=null,name="param1") String param1) {
	//		System.out.println(param1);
	//		return "resp: DemoController";
	//	}	
	//	
	
	
	//	@RequestMapping("/customers/{custId}/accounts/{accNum}")
	//	public @ResponseBody String name(@PathVariable("custId") String customerId,@PathVariable("accNum") String accpuntNum) {
	//		System.out.println(customerId+"\t"+accpuntNum);
	//		return "resp: DemoController";
	//	}
	//	
	//	
	
	
	//	@RequestMapping("/some-req")
	//	public @ResponseBody String name(@CookieValue(name="some-cookie")String cv) {
	//		return "resp: DemoController";
	//	}
	//	
	
	//	
	//	@RequestMapping("/some-req")
	//	public @ResponseBody String name(@RequestHeader(name="Accept") String acceptHeader) {
	//		System.out.println(acceptHeader);
	//		return "resp: DemoController";
	//	}
	
	
	//---------------------------------------------------------------------------------
	
	
	//	@ModelAttribute
	//	BindingResult
	
	//---------------------------------------------------------------------------------
	
	//
	//		@ModelAttribute
	//		public void createModel(Model model) {
	//			System.out.println("Creating Default-Todo Model");
	//			Todo todo=new Todo();
	//			todo.setId(24345345);
	//			todo.setText("Learn Spring MVC");
	//			model.addAttribute("todo", todo);
	//		}
	
	
	//----------------------------------------------------------------------------------
	
	

	//	@RequestMapping(value="/todos",method=RequestMethod.POST)
	//	public @ResponseBody String name(@ModelAttribute("todo") Todo todo,BindingResult result) {
	//		
	//		if(result.hasErrors()){
	//			List<ObjectError> errors=result.getAllErrors();
	//			for(ObjectError error:errors){
	//				System.out.println(error.toString());
	//			}
	//			return "Invalid Form Input..";
	//		}
	//		System.out.println(todo);
	//		return "resp: DemoController";
	//	}
	
	
	//----------------------------------------------------------------------------------
	
	
	// @RequestBody
	// @ReponseBody
		
	//	
	//	@RequestMapping(value="/todos",method=RequestMethod.POST,consumes={"application/xml","application/json"})
	//	public @ResponseBody String createNewTodo(@RequestBody Todo todo) {
	//		System.out.println(todo);
	//		return "New todo saved...";
	//	}
	
	
	//---------------------------------------------------------------------------------------
	
	
	//	@RequestMapping(value="/todos",method=RequestMethod.GET,produces={"application/xml"})
	//	public @ResponseBody Todo getXML() {
	//		System.out.println("producing XML");
	//		Todo todo=new Todo();
	//		todo.setId(232434);
	//		todo.setText("Live Life");
	//		
	//		return todo;
	//	}
	//	
	//
	//	@RequestMapping(value="/todos",method=RequestMethod.GET,produces={"application/json"})
	//	public @ResponseBody Todo getJSON() {
	//		System.out.println("producing JSON");
	//		Todo todo=new Todo();
	//		todo.setId(232434);
	//		todo.setText("Live Life");
	//		
	//		return todo;
	//	}
	//	
	
	//---------------------------------------------------------------------------------------
	
	
	// @MatrixVariable
	//	
	//	@GetMapping("/owners/{ownerId}/pets/{petId}")
	//	public void findPet(
	//	        @MatrixVariable(name="q", pathVar="ownerId") int q1,
	//	        @MatrixVariable(name="q", pathVar="petId") int q2) {
	//
	//	    	System.out.println(q1);
	//	    	System.out.println(q2);
	//
	//	}
	
	
	//---------------------------------------------------------------------------------------
	
	
}
