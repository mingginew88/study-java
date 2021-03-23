package com.example.demo.web;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoDTO {

	String title;			// 제목
	String content;			// 내용
	String selected_date;	// 선택일자
	boolean completed;		// 완성여부
	
	// 생성자
	@Builder
	public TodoDTO(String title, String content, String selected_date, boolean completed) {
		this.title = title;
		this.content = content;
		this.selected_date = selected_date;
		this.completed = completed;
	}
}
