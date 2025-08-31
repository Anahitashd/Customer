package com.example.customer.service;

import com.example.customer.model.Account;
import com.example.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import com.example.customer.repository.AccountRepository;

import java.util.Optional;

@Service
public class AccountService {
    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;

    public AccountService(AccountRepository accountRepository, CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    public Optional<Account> getAccountById(Long accountId) {
        return accountRepository.findById(accountId);
    }

    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}
