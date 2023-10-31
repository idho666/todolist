package com.todolist.app.todolist.todolistapp.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@Entity
@Data
public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String name;
    @CreationTimestamp
    private java.util.Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
