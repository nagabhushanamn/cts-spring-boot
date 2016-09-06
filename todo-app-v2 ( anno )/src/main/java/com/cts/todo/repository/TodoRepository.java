package com.cts.todo.repository;

import java.util.List;

import com.cts.todo.model.Todo;

public interface TodoRepository {

	void add(Todo todo);
	void update(Todo todo);
	void delete(int id);
	List<Todo> findAll();
	
}
