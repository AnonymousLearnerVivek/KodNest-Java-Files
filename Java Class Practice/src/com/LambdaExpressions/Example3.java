package com.LambdaExpressions;

@FunctionalInterface
interface StringTransformer {
    String transform(String s);
}

public class Example3 {
    public static void main(String[] args) {

        // Traditional way
        StringTransformer traditionalUppercase = new StringTransformer() {
            @Override
            public String transform(String s) {
                return s.toUpperCase();
            }
        };

        // Lambda way
        StringTransformer lambdaUppercase = s -> s.toUpperCase();

        // Using both transformers
        String name = "rajesh";
        System.out.println("Traditional uppercase: " + traditionalUppercase.transform(name));
        System.out.println("Lambda uppercase: " + lambdaUppercase.transform(name));
    }
}

