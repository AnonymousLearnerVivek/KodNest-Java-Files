package com.kodnest._urldatademo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyController {
    @GetMapping("/api/{year}")
    public String display(@PathVariable int year, Model model) {
        year += 5;
        model.addAttribute("data", year);
        return "index";
    }
}
