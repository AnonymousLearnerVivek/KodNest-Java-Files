package com.kodnest._constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    Laptop laptop;

    @Autowired
    public Developer(Laptop laptop) {
        this.laptop = laptop;
    }
    public void develop() {
        laptop.build();
        System.out.println("Developer completed the work");
    }
}
