package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.Todo;
import com.app.validator.TodoValidator;

@Controller
@RequestMapping("/todos")
public class TodoController {
	
	@Autowired
	private TodoValidator todoValidator;

	@PostMapping
	public @ResponseBody String createNewTodo(@Valid Todo todo, BindingResult result) {
		
		//todoValidator.validate(todo, result);
		
		if (result.hasErrors()) {
			List<ObjectError> errors=result.getAllErrors();
			for(ObjectError error:errors){
				System.out.println(error);
			}
			return "Invalid Input";
		}
		
		System.out.println(todo);
		return "Valid Input";
	}

}
