package com.example.customer.service;

import com.example.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import com.example.customer.repository.AccountRepository;

@Service
public class AccountService {
    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;

    public AccountService(AccountRepository accountRepository, CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }
}
