package com.example.customer.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountDto {

    private String customerNumber;
    private String accountNumber;
    private Integer balance;

}
