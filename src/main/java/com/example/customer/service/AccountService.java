package com.example.customer.service;

import org.springframework.stereotype.Service;
import com.example.customer.repository.AccountRepository;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
