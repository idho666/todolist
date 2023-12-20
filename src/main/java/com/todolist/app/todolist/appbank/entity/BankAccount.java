package com.todolist.app.todolist.appbank.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    private String accountHolderName;

    private double balance;
}
