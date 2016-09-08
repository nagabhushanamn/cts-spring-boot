package com.app.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@XmlRootElement(name="todo")
public class Todo {
	
	private int id;
	@NotEmpty(message="todo text required")
	private String text;
	private boolean completed;
	
	
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
