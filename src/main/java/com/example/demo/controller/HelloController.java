package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String emptyRequest() {
        return "index";
    }

    @GetMapping("/parameter")
    @ResponseBody
    public String requestWithParam(@RequestParam String name) {
        return "Request with parameter created by " + name;
    }
}