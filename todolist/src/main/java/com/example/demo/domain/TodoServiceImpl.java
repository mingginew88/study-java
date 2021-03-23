package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoServiceImpl extends JpaRepository<Todo, Integer>{

}
