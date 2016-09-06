package com.cts.todo.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.spring.TodoRepoQualifier;
import com.cts.todo.model.Todo;
import com.cts.todo.repository.TodoRepository;

//@Component("todoService")
@Service("todoService")
public class TodoServiceImpl implements TodoService {

	private static Logger logger = Logger.getLogger("TODO");

	private TodoRepository todoRepository;

	public TodoServiceImpl() {
		logger.info("TodoService instance created...");
	}

	// @Required
	@Autowired(required = true)
	//@Qualifier("hibernate")
	@TodoRepoQualifier(db = "db1", tech = "hibernate")
	public void setTodoRepository(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
		logger.info("TodoRepository injected to TodoService");
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
