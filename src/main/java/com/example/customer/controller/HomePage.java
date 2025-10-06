package com.example.customer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomePage {

    @GetMapping("/login")   // mapping for home page
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("title", "Login");
        return mav;
    }
}
