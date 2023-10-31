package com.todolist.app.todolist.todolistapp.controller;

import com.todolist.app.todolist.todolistapp.TodolistDto;
import com.todolist.app.todolist.todolistapp.model.TodoList;
import com.todolist.app.todolist.todolistapp.repository.TodolistRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class TodolistController {
private final TodolistRepository todolistRepository;

    @GetMapping("hallo")
    public String hallo() {
        return "sdfdsfs";

    }

    @GetMapping("todolist")
    public ResponseEntity<?> todolist(){

      List<TodoList> todoLists = todolistRepository.findAll();

        ModelMapper modelMapper = new ModelMapper();
        TodolistDto todoListsDto = modelMapper.map(todoLists, TodolistDto.class);



        return new ResponseEntity<>(todoListsDto,HttpStatus.OK);
    }
}
