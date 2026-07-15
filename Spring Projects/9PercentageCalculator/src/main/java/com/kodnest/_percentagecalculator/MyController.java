package com.kodnest._percentagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/percentage")
    public String displayForm() {
        return "index";
    }

    public void calculatePercentage() {
    }

}
