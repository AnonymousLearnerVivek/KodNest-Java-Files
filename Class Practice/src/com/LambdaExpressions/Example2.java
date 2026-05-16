package com.LambdaExpressions;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}


public class Example2 {
    public static void main(String[] args) {
        // Traditional way
        Calculator traditionalAdd = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        // Lambda way
        Calculator lambdaAdd = (a, b) -> a + b;

        // Using both calculators
        System.out.println("Traditional sum of 5 and 3: " + traditionalAdd.operate(5, 3));
        System.out.println("Lambda sum of 5 and 3: " + lambdaAdd.operate(5, 3));
    }
}

