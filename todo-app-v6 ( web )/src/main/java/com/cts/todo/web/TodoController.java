package com.cts.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.todo.model.Todo;
import com.cts.todo.service.TodoService;

@Controller
@RequestMapping("/todos")
public class TodoController {

	@Autowired
	private TodoService todoService;

	// create New-Todo
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView newTodo(@RequestParam String text) {
		Todo todo = new Todo();
		todo.setText(text);

		todoService.createNewTodo(todo);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("status");
		mav.addObject("message", "New todo created");

		return mav;

	}

}
