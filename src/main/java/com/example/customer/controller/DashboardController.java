package com.example.customer.controller;

import com.example.customer.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    private final CustomerService customerService;

    public DashboardController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/customer")
    public String customer() {
        customerService.getAllCustomer();
        return "customer"; // this will open apiPage.html
    }

    @GetMapping("/addCustomer")
    public String addCustomer() {
        return "addCustomer";
    }

    @GetMapping("/account")
    public String account() {
        return "account";
    }
}
