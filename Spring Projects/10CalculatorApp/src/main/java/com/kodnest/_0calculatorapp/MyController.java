package com.kodnest._0calculatorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/calculator")
    public String display() {
        return "index";
    }

    @PostMapping("/performOperation")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String option, Model model) {
        int res = 0;
        switch (option) {
            case "add" -> res = myService.add(num1, num2);
            case "sub" -> res = myService.sub(num1, num2);
            case "mul" -> res = myService.mul(num1, num2);
            case "div" -> res = myService.div(num1, num2);
        }
        model.addAttribute("result", res);
        model.addAttribute("option", option);


        return "result";
    }
}

















