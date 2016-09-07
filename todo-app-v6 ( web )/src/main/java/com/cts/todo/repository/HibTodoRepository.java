package com.cts.todo.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cts.todo.model.Todo;

@Repository("hibTodoRepository")
@Qualifier("hibernate")
public class HibTodoRepository implements TodoRepository {

	private static Logger logger = Logger.getLogger("TODO");

	private SessionFactory sessionFactory;

	@Autowired
	public HibTodoRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Todo todo) {
		sessionFactory.getCurrentSession().save(todo);
	}

	public void update(Todo todo) {
		sessionFactory.getCurrentSession().update(todo);
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(session.load(Todo.class, id));
	}

	public List<Todo> findAll() {
		List todos = sessionFactory.getCurrentSession().createQuery("from Todo").list();
		return todos;
	}

}
