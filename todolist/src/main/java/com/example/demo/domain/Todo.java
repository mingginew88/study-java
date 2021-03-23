package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@Entity
public class Todo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int todo_no;			// key값
	
	@Column(length = 500, nullable = false)
	String title;			// 제목
	
	@Column(length = 2000, nullable = false)
	String content;			// 내용
	
	@Column(length = 1, nullable = false)
	boolean completed;		// 완성여부

	@Builder
	public Todo(int todo_no, String title, String content, boolean completed) {
		this.todo_no = todo_no;
		this.title = title;
		this.content = content;
		this.completed = completed;
	}

}
