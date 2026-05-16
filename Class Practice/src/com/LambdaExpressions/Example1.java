package com.LambdaExpressions;

@FunctionalInterface
interface Greeter {
    void greet();
}
public class Example1 {
    public static void main(String[] args) {
        // Traditional way
        Greeter traditionalGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Namaste from traditional way!");
            }
        };

        // Lambda way
        Greeter lambdaGreeter = () -> System.out.println("Namaste from lambda!");

        // Using both greeters
        traditionalGreeter.greet();
        lambdaGreeter.greet();
    }
}


