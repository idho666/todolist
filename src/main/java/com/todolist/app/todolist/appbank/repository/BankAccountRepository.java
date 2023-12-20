package com.todolist.app.todolist.appbank.repository;

import com.todolist.app.todolist.appbank.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
