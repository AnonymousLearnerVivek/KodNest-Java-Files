package com.kodnest._urldatademo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyConroller {

    @GetMapping("/api/{year}")
    @ResponseBody
    public int displayYear(@PathVariable int year){
        year += 5;
        return year;
    }

}
