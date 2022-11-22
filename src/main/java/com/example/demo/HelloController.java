package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String emptyRequest() {
        return "Empty get request created by Kostiuk Daria 124-19-2";
    }

    @GetMapping("/parameter")
    @ResponseBody
    public String requestWithParam(@RequestParam String name) {
        return "Request with parameter created by " + name;
    }
}
