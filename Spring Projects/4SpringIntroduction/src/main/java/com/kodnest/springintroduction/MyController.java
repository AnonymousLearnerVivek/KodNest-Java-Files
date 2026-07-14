package com.kodnest.springintroduction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @RequestMapping("/greeting") // it means whenever some says /greeting, this method will be called
    @ResponseBody
    public String greet() {
        return "Hello and welcome";
    }

    @RequestMapping("/thanks")
    @ResponseBody
    public String thank() {
        return "Thank you for your time";
    }
}
