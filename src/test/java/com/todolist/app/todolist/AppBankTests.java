package com.todolist.app.todolist;

import com.todolist.app.todolist.appbank.entity.BankAccount;
import com.todolist.app.todolist.appbank.repository.BankAccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@SpringBootTest
@Slf4j
public class AppBankTests {

    @Autowired
    BankAccountRepository bankAccountRepository;

    @Test
    void GetAccountBalance() {
        List<BankAccount> bankAccounts = bankAccountRepository.findAll();

        bankAccounts.forEach(result -> {
            log.info("{},{},{}", result.getAccountHolderName() ,result.getAccountNumber(),result.getBalance());
        });


    }

}
