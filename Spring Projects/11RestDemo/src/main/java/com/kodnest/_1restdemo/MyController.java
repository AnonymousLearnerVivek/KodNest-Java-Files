package com.kodnest._1restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/greet")
    public String greeting() {
        return "Welcome!";
    }
}
