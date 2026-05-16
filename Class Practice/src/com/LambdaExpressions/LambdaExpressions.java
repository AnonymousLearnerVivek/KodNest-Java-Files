package com.LambdaExpressions;
/*
 Functional Interface and Lambda Expression are like Laila and Majnu Means if one is there then other one will also be there

 Lambda Expression:- denoted/ Represented as  () -> { };
 Lambda Expression:- it's an expression which provides the Implementation for the Method of the Functional Interface
 */
/*
Q1. What Exactly is a Lambda Expression? 💡
Standard Definition:
    A Lambda Expression is a short and simple way of writing a small block of code that can be treated like data.
    It allows you to define actions without giving them a name like traditional methods.
 */


@FunctionalInterface  //functional interface is a interface which has only one abstract method in it
interface Demo {
    void display1();

}

@FunctionalInterface
interface Demo2 {
    void display2(int a, int b);
}
@FunctionalInterface
interface Demo3 {
    int display3(int a, int b, int c);
}
//public class LambdaExpressions {
//    public static void main(String[] args) {
//        Demo demo = new Demo() {
//            @Override
//            public void display1() {
/*
  Since we that there is only One method in the functional interface so to give its implementation do we really need to use the name of the function
  that's why Now we will use lambda expression
*/
//                System.out.println("Display1 Method");
//            }
//        };
//        demo.display1();
//    }
//}

public class LambdaExpressions {
    public static void main(String[] args) {
        Demo demo = () -> { System.out.println("Display1 Method"); }; // This is known as Lambda Expression
//        Demo demo2 = () -> System.out.println("Welcome");         // since we have only one statement to print so we can also write this same expression as by removing {};

//        Demo2 demo2 = (int a) -> { System.out.println(a); };

        // OR we can also write parameter like this without data type
//        Demo2 demo2 = (a) -> { System.out.println(a); };

        // and when you have only one parameter then you can also write this as
//        Demo2 demo2 = a -> { System.out.println(a); }; // only for one parameter

//        Demo2 demo2 = (int a, int b) -> { System.out.println(a + b); };

        Demo2 demo2 = (a, b) -> { System.out.println(a + b); };

        Demo3 demo3 = (a, b, c) -> { return a + b + c; };

        // You can't write return statement without curly braces even if it is single statement it will show an error
//        Demo3 demo3 = (a, b, c) -> return  a+b+c; // You cannot write this like this it will show an error

        // But You can write it like this without return keyword
        Demo3 demo4 = (a, b, c) ->  a + b + c; // This is allowed without curly braces and without return keyword


        demo.display1();
        demo2.display2(100, 300);
        System.out.println(demo3.display3(10, 20 ,30));
        System.out.println(demo4.display3(100, 20 ,80));
    }
}
/*
# Key Points to remember 📝
    1. Lambda expressions remove extra words and make code shorter and easier to understand.
    2. Whenever you have a Functional Interface (interface with only one method), you can use a lambda expression.
    3. Inputs are mentioned before the arrow ->, and the task is written after the arrow.

# Conclusion:
    These examples demonstrate the basic syntax and usage of lambda expressions:
        1. For methods with no parameters, we use empty parentheses: () -> ...
        2. For methods with one parameter, we can omit the parentheses: s -> ...
        3. For methods with multiple parameters, we list them in parentheses: (a, b) -> ...
        4. If the method body is a single expression, we can write it directly after the arrow.
        5. If we need multiple statements, we use curly braces: (a, b) -> { ... }

    Lambda expressions make your code shorter and often more readable, especially for simple operations.
    They're particularly useful when working with collections, streams, and functional interfaces in Java.
 */