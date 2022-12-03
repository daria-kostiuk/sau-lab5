package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String emptyRequest() {
        return "index";
    }

    @GetMapping("/portfolio")
    public String requestWithParam(@RequestParam String name) {

        return "portfolio";
    }
}
