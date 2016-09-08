package com.app.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.Todo;


@Component
public class TodoValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return arg0.getName().equals(Todo.class);
	}

	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "text", "todo.text.required", "text is required");
		Todo todo=(Todo)obj;
		if(todo.getId()>100){
			errors.rejectValue("id", "todo.id.invalid", "ID must be > 100");
		}
	}

}
