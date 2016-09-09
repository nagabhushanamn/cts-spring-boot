package com.example.service;


import com.example.model.Todo;


public interface TodoService {

	void createNewTodo(Todo todo);
	void deleteTodo(int id);
	void update(Todo todo);
	void completeTodo(Todo todo);
	void completeAll();
	Iterable<Todo> loadAll();
	void clearCompleted();
	
	

}
