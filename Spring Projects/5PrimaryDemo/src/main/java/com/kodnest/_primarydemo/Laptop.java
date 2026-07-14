package com.kodnest._primarydemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    @Override
    public void build() {
        System.out.println("Developer is using Laptop to build the app");
    }
}
