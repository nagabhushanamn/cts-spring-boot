package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Todo;
import com.example.service.TodoService;

@RestController
@RequestMapping(value = "/api/todos")
public class TodosControler {

	private static final Logger log = LoggerFactory.getLogger(TodosControler.class);

	@Autowired
	private TodoService todoService;

	@GetMapping
	public Iterable<Todo> get() {
		return todoService.loadAll();
	}

	@PostMapping(consumes = { "application/json" })
	public void post(@RequestBody Todo todo) {
		todoService.createNewTodo(todo);
	}

	@PutMapping(value = "/{id}")
	public void put(@PathVariable int id, @RequestBody Todo todo) {
		todoService.update(todo);
	}

	@PutMapping
	public void put(@RequestBody Todo todo) {
		todoService.update(todo);
	}

	@DeleteMapping
	public void clearCompleted() {
		todoService.clearCompleted();
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable int id) {
		todoService.deleteTodo(id);
	}

}
