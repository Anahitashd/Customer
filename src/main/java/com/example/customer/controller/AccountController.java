package com.example.customer.controller;

import com.example.customer.model.Account;
import com.example.customer.repository.AccountRepository;
import com.example.customer.service.AccountService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    private AccountRepository accountRepository;
    private AccountService accountService;

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        return new ResponseEntity<>(accountService.findAllAccounts() , HttpStatus.OK);
    }
}
