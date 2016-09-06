package com.cts.todo.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cts.todo.model.Todo;
import com.cts.todo.repository.TodoRepository;

public class TodoServiceImpl implements TodoService {
	
	private static Logger logger=Logger.getLogger("TODO");
	
	private TodoRepository todoRepository;
	
	public TodoServiceImpl() {
		logger.info("TodoService instance created...");
	}
	
	public void setTodoRepository(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
		logger.info("TodoRepository injected to TodoService");
	}
	
	
	//  
	public void init() {
		logger.info("todoService : init()");
	}
	
	public void destroy() {
		logger.info("todoService : destroy()");
	}

	
	
	public void createNewTodo(Todo todo) {
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
