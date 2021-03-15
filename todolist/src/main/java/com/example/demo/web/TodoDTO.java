package com.example.demo.web;

public class TodoDTO {

	String title = "";
	
	String content = "";
	
	String selected_date = "";
	
	boolean completed = false;
	
	// 생성자
	public TodoDTO(String title, String content, String selected_date, boolean completed) {
		super();
		this.title = title;
		this.content = content;
		this.selected_date = selected_date;
		this.completed = completed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSelected_date() {
		return selected_date;
	}

	public void setSelected_date(String selected_date) {
		this.selected_date = selected_date;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "TodoDTO [title=" + title + ", content=" + content + ", selected_date=" + selected_date + ", completed="
				+ completed + "]";
	}
	
}
