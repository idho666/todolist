package com.todolist.app.todolist.todolistapp;

import com.todolist.app.todolist.todolistapp.model.User;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@Data
public class TodolistDto implements Serializable{

    private Integer id;
    private String tittle;
    private String todolist;

}
