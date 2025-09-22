package com.example.customer.controller;

import com.example.customer.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard"
)
public class DashboardController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping
    public String dashboard(Model model) {
        String apiUrl = "http://localhost:8080/api/accounts";
        ResponseEntity<Customer[]> response = restTemplate.getForEntity(apiUrl, Customer[].class);
        List<Customer> accounts = Arrays.asList(response.getBody());

        model.addAttribute("accounts", accounts);
        return "dashboard"; // dashboard.html must exist
    }
}
