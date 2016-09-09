package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Todo;

@Repository
public interface TodoRepository  extends CrudRepository<Todo, Integer>{
	Long deleteByCompleted(boolean completed);	
}