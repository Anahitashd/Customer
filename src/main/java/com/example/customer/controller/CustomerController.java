package com.example.customer.controller;

import com.example.customer.config.CustomerMapper;
import com.example.customer.dto.CustomerDto;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    public CustomerController(CustomerMapper customerMapper, CustomerService customerService) {
        this.customerMapper = customerMapper;
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDto> getAccounts() {
        return customerService.getAllCustomer()
                .stream()
                .map(customerMapper::toDTO)
                .toList();
    }

    @GetMapping("{customerId}")
    public ResponseEntity<CustomerDto> getAccountById(@PathVariable("customerId") long customerId) {
        return customerService.getCustomerById(customerId)
                .map(customerMapper::toDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

    @PostMapping
    public ResponseEntity<CustomerDto> createAccount(@RequestBody CustomerDto customerDto) {
        Customer entity = customerMapper.toEntity(customerDto);
        Customer save =customerService.createCustomer(entity);
        CustomerDto dto = customerMapper.toDTO(save);
        return ResponseEntity.ok(dto);
    }
}
