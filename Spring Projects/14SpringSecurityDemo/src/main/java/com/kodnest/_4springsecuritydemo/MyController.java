package com.kodnest._4springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/secure")
    public String loginDemo() {
        return "Login successful!";
    }
}
