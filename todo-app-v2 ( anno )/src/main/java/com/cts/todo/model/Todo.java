package com.cts.todo.model;

public class Todo {

	private int id;
	private String text;
	private boolean completed;

	public Todo(int id, String text, boolean completed) {
		super();
		this.id = id;
		this.text = text;
		this.completed = completed;
	}

	public Todo() {
		// TODO Auto-generated constructor stub
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
