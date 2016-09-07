package com.cts.todo.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.todo.model.Todo;

@Repository("hibTodoRepository")
@Qualifier("hibernate")
public class HibTodoRepository implements TodoRepository {

	private static Logger logger = Logger.getLogger("TODO");

	public HibTodoRepository() {
		logger.info("HibTodoRepository instace created ");
	}

	public void save(Todo todo) {
		//throw new RuntimeException("oops");
	}

	public void update(Todo todo) {
	}

	public void delete(int id) {
	}

	public List<Todo> findAll() {
		return null;
	}

}
