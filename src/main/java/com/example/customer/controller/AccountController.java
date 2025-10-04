package com.example.customer.controller;

import com.example.customer.config.AccountMapper;
import com.example.customer.dto.AccountDto;
import com.example.customer.model.Account;
import com.example.customer.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/account")
public class AccountController {
    private final AccountService accountService;
    private final AccountMapper accountMapper;

    public AccountController(AccountService accountService, AccountMapper accountMapper) {
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        List<Account> all= accountService.findAllAccounts();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @GetMapping("{accountId}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable("accountId") Long accountId) {
        return accountService.getAccountById(accountId)
                .map(accountMapper::toDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {
        AccountDto saveAccount =accountService.createAccount(accountDto);
        return ResponseEntity.ok(saveAccount);

    }
}
