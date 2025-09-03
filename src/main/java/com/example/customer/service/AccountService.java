package com.example.customer.service;

import com.example.customer.dto.AccountDto;
import com.example.customer.model.Account;
import com.example.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import com.example.customer.repository.AccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(Long accountId) {
        return accountRepository.findById(accountId);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}
