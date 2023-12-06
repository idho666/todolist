package com.todolist.app.todolist.todolistapp.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@Entity
@Data
public class TodoList {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String tittle;
    private String todolist;
    @CreationTimestamp
    private java.util.Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    @ManyToOne
    private User user;

}
//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