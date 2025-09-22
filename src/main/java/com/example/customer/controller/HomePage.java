package com.example.customer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

    @GetMapping("/customer")   // mapping for home page
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Bank Project!");
        return "index"; // matches templates/index.html
    }
}
