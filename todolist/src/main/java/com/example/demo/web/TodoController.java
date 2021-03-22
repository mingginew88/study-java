package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@GetMapping("/todo")
	public TodoDTO todo() {
		return TodoDTO.builder()
				.title("java")
				.content("java study")
				.selected_date("2021-03-22")
				.completed(false)
				.build();
	}
	
	
	
	
}
