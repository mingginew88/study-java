package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	
	@GetMapping("/todo")
	public TodoDTO todo() {
		
		TodoDTO todoDTO = new TodoDTO("java", "java study", "2021-03-15", false);
		
		return todoDTO;
	}
	
	
	
	
}
