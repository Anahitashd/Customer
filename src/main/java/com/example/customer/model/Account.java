package com.example.customer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Setter
@Getter
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
}
