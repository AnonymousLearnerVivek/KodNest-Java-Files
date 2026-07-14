package com.kodnest._primarydemo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void build() {
        System.out.println("Developer is using Desktop to build the app");
    }
}
