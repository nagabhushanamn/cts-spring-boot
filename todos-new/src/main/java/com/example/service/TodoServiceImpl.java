package com.example.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Todo;
import com.example.repository.TodoRepository;

@Transactional
@Service("todoService")
public class TodoServiceImpl implements TodoService {

	private static Logger logger = Logger.getLogger("TODO");

	private TodoRepository todoRepository;

	public TodoServiceImpl() {
		logger.info("TodoService instance created...");
	}

	@Autowired(required = true)
	public void setTodoRepository(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public void createNewTodo(Todo todo) {
		todoRepository.save(todo);
	}

	public void deleteTodo(int id) {
		todoRepository.delete(id);
	}

	public void update(Todo todo) {
		todoRepository.save(todo);
	}

	public void completeTodo(Todo todo) {
		todoRepository.save(todo);
	}

	public void completeAll() {
		// ..
	}

	public Iterable<Todo> loadAll() {
		return todoRepository.findAll();
	}

	@Override
	public void clearCompleted() {
		todoRepository.deleteByCompleted(true);
	}

}
