package com.todolist.app.todolist.todolistapp.repository;

import com.todolist.app.todolist.todolistapp.TodolistDto;
import com.todolist.app.todolist.todolistapp.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@Repository
public interface TodolistRepository extends JpaRepository<TodoList,Integer> {



}


