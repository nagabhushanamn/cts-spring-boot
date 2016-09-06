package com.cts.todo.repository;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.todo.model.Todo;

public class JdbcTodoRepository implements TodoRepository {
	
	private static Logger logger=Logger.getLogger("TODO");

	private DataSource dataSource;

	public JdbcTodoRepository(DataSource dataSource) {
		this.dataSource = dataSource;
		logger.info("JdbcTodoRepository instace created  with dataSource");
	}

	public void add(Todo todo) {
	}

	public void update(Todo todo) {
	}

	public void delete(int id) {
	}

	public List<Todo> findAll() {
		return null;
	}

}
