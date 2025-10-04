package com.example.customer.service;

import com.example.customer.config.AccountMapper;
import com.example.customer.dto.AccountDto;
import com.example.customer.model.Account;
import org.springframework.stereotype.Service;
import com.example.customer.repository.AccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
   private final AccountMapper accountMapper;

    public AccountService(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(Long accountId) {
        return accountRepository.findById(accountId);
    }

    public AccountDto createAccount(AccountDto accountDto) {
        Account account =accountMapper.toEntity(accountDto);
        Account savedAccount = accountRepository.save(account);
        return accountMapper.toDTO(savedAccount);
    }
    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}
