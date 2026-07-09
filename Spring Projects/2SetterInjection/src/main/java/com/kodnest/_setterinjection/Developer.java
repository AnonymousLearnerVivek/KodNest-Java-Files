package com.kodnest._setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    Laptop laptop;

    public void develop() {
        laptop.build();
        System.out.println("Developer completed the work");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}