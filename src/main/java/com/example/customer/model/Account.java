package com.example.customer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;


@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NonNull
    private String accountNumber;
    @NonNull
    private Integer balance;
    @NonNull
    private String customerNumber;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(@NonNull String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @NonNull
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(@NonNull Integer balance) {
        this.balance = balance;
    }

    @NonNull
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(@NonNull String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
