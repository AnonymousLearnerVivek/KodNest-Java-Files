package com.kodnest._fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    @Autowired
    Laptop laptop;

    public void develop() {
        laptop.build();
        System.out.println("Developer completed the work");
    }
}