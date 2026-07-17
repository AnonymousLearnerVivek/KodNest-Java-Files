package com.kodnest._0calculatorapp;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public int add (int a, int b) {
        return a + b;
    }
    public int sub (int a, int b) {
        return a - b;
    }

    public int mul (int a, int b) {
        return a * b;
    }

    public int div (int a, int b) {
        return a / b;
    }
}
