package service;

import org.springframework.stereotype.Service;
import repository.AccountRepository;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;


    }
}
