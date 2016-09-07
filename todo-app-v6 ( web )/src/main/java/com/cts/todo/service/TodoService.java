package com.cts.todo.service;

import java.util.List;

import com.cts.todo.model.Todo;

public interface TodoService {

	void createNewTodo(Todo todo);

	void deleteTodo(int id);

	void update(Todo todo);

	void completeTodo(Todo todo);

	void completeAll();

	List<Todo> loadAll();

}
