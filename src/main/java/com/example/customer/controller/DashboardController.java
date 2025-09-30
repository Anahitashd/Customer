package com.example.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // you can add attributes if needed
        model.addAttribute("message", "Welcome to your dashboard!");
        return "dashboard"; // resolves to dashboard.html (Thymeleaf) or dashboard.jsp
    }
}
