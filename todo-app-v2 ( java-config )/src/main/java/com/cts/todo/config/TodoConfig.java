package com.cts.todo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.todo.repository.HibTodoRepository;
import com.cts.todo.repository.TodoRepository;
import com.cts.todo.service.TodoService;
import com.cts.todo.service.TodoServiceImpl;

@Configuration
public class TodoConfig {

	@Bean(name = "todoRepository")
	public TodoRepository todoRepository() {
		// decisions
		TodoRepository repository = new HibTodoRepository();
		return repository;

	}

	@Bean
	public TodoService todoService() {
		TodoServiceImpl todoService = new TodoServiceImpl();
		todoService.setTodoRepository(todoRepository());
		return todoService;
	}

}
