package com.example.demo.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TodoServiceImplTest {
	
	@Autowired
	TodoServiceImpl todoServiceImpl;

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@After
	public void cleanup() {
		todoServiceImpl.deleteAll();
	}

	@Test
	void todo() {
        // Given
		int todo_no = 1;
        String title = "테스트 게시글";
        String content = "테스트 본문";
        boolean completed = false;

        todoServiceImpl.save(
                Todo.builder()
                		.todo_no(todo_no)
                        .title(title)
                        .content(content)
                        .completed(completed)
                        .build()
        );

        // When
        List<Todo> todoList = todoServiceImpl.findAll();

        // Then
        Todo todo = todoList.get(0);
        assertThat(todo.getTitle()).isEqualTo(title);
        assertThat(todo.getContent()).isEqualTo(content);
	}

}
