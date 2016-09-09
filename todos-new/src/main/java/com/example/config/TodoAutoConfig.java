package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repository.TodoRepository;
import com.example.service.TodoService;
import com.example.service.TodoServiceImpl;

@Configuration
@ConfigurationProperties(prefix = "todo")
public class TodoAutoConfig {

	@Autowired
	private TodoRepository todoRepository;

	private String prop;

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
		System.out.println(this.prop);
	}

	@Bean
	@ConditionalOnClass(value = TodoServiceImpl.class)
	public TodoService todoService() {

		TodoServiceImpl todoService = new TodoServiceImpl();
		todoService.setTodoRepository(todoRepository);

		return todoService;

	}

}
