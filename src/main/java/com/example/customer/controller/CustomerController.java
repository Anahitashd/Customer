package com.example.customer.controller;


import com.example.customer.config.CustomerMapper;
import com.example.customer.dto.CustomerDto;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    public CustomerController(CustomerService customerService, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllAccounts() {
        List <Customer> all = customerService.getAllCustomer();
        return new ResponseEntity<>(all,HttpStatus.OK);
    }

    @GetMapping("{customerId}")
    public ResponseEntity<Optional<Customer>> getAccountById(@PathVariable("customerId") long customerId) {
        return ResponseEntity.ok(this.customerService.getCustomerById(customerId));
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.saveCustomer(customerDto);
        return ResponseEntity.ok(savedCustomer);
    }
}
