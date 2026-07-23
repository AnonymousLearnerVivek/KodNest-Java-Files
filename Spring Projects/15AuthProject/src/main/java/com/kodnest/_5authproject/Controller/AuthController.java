package com.kodnest._5authproject.Controller;

import com.kodnest._5authproject.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

//    @GetMapping("/username={name}/password={pwd}")
//    public String verify(@PathVariable("name") String name, @PathVariable("pwd") String pwd) {
//        return authService.verify(name, pwd);
//    }

    @GetMapping("/verify")
    public String verify(@RequestParam String name, @RequestParam String pwd) {
        return authService.verify(name, pwd);
    }
}
