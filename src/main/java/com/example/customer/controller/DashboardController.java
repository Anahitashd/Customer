package com.example.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/customer")
    public String customer() {
        // Do something here — call service, prepare model data, etc.
        return "customer"; // this will open apiPage.html
    }

    @GetMapping("/account")
    public String account() {
        // Do something here — call service, prepare model data, etc.
        return "account"; // this will open apiPage.html
    }
}
