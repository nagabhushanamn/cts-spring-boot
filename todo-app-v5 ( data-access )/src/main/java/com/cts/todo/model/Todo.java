package com.cts.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TODOS",schema="todos")
public class Todo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String text;
	private boolean completed;

	public Todo(String text, boolean completed) {
		super();
		this.text = text;
		this.completed = completed;
	}

	public Todo() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", text=" + text + ", completed=" + completed + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
