package com.kodnest._fieldinjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public Laptop() {
        System.out.println("Laptop Constructor");
        System.out.println("Laptop object is created");
    }

    public void build() {
        System.out.println("Built the application using Laptop");
    }
}
