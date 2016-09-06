package com.cts.bean.scope;

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
		applicationContext = new ClassPathXmlApplicationContext("classpath:com/cts/ques/sample.xml");

		logger.info("=====================================================");

		// use phase
		
		Human human=applicationContext.getBean("human",Human.class);
		
		human.eat();
		
		human.eat();
		

		logger.info("=====================================================");
		
		// destroy - phase
		applicationContext.close();

	}

}
