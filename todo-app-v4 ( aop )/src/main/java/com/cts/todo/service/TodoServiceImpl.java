package com.cts.todo.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.todo.aspects.LoggingAspect;
import com.cts.todo.model.Todo;
import com.cts.todo.repository.TodoRepository;

@Service("todoService")
public class TodoServiceImpl implements TodoService {

	private static Logger logger = Logger.getLogger("TODO");

	private TodoRepository todoRepository;

	public TodoServiceImpl() {
		logger.info("TodoService instance created...");
	}

	@Autowired(required = true)
	@Qualifier("hibernate")
	public void setTodoRepository(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
		logger.info("TodoRepository injected to TodoService");
	}

	// Join Point
	public void createNewTodo(Todo todo) {
		todoRepository.save(todo);
	}
	

	public void deleteTodo(int id) {
	}

	public void update(Todo todo) {
	}

	public void completeTodo(Todo todo) {
	}

	public void completeAll(Todo todo) {
	}

	public List<Todo> loadAll() {
		return null;
	}

}
