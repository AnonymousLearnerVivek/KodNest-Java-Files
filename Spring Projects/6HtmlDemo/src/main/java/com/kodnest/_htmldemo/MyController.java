package com.kodnest._htmldemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/greet")
    public String greeting() {
        return "home";
    }
}
