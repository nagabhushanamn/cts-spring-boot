package com.cts.app;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.todo.model.Todo;
import com.cts.todo.service.TodoService;

public class App {

	private static Logger logger = Logger.getLogger("TODO");

	public static void main(String[] args) {

		// init phase
		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("classpath:appln-layer.xml","infra-layer.xml");

		logger.info("=====================================================");

		// use phase

		TodoService todoService = applicationContext.getBean("todoService", TodoService.class);

		Todo todo = new Todo(23123, "Learn Spring", false);
		todoService.createNewTodo(todo);

		logger.info("=====================================================");
		
		// destroy - phase
		applicationContext.close();

	}

}
