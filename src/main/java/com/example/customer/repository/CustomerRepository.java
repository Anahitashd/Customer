package com.example.customer.repository;

import com.example.customer.model.Customer;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CustomerRepository extends JpaRepositoryImplementation<Customer, Long> {
}
