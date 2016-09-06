package com.cts.todo.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.spring.TodoRepoQualifier;
import com.cts.todo.model.Todo;

//@Component("hibTodoRepository")
@Repository("hibTodoRepository")
//@Qualifier("hibernate")
@TodoRepoQualifier(db="db1",tech="hibernate")
public class HibTodoRepository implements TodoRepository {
	
	private static Logger logger=Logger.getLogger("TODO");


	public HibTodoRepository() {
		logger.info("HibTodoRepository instace created ");
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
