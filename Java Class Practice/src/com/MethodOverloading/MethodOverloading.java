package com.MethodOverloading;

/*
    i) Method Overloading is also known as Virtual Polymorphism
   ii) Method Overloading is an example of Compile-Time Polymorphism

   Q) What Exactly is Method Overloading? 💡
      Standard Definition:
      Method Overloading means having multiple methods with the same name but different parameters (number or type) in the same class.

    # Real-World Applications of Method Overloading
    Let us look at some simple and real examples of where method overloading is used:
    1. In Java, we often use System.out.println(). You can use it to print a number, a word, a sentence, or even a decimal value.
       All of these use the same method name "println", but Java runs the correct one based on what you give it.

    2. In online apps like Swiggy or Zomato, there is a search bar. You can search by food name, restaurant name, or location.
       Behind the scenes, all these searches are handled by one method that behaves differently depending on what you typed.

    3. In many apps, we log in using a phone number, or an email, or a social media account.
       The login method is overloaded to accept different types of inputs.

    So as you can see, method overloading is not just a theory. It is used in the apps and tools you already know.

    Key Points to remember:
    1. Method overloading means writing more than one method with the same name in the same class.
    2. It works when we change the number of inputs or the type of inputs.
    3. Just changing the output is not enough to overload a method.
    4. This concept helps us write code that is clean, simple, and easy to understand.
    5. It is used in real apps like food delivery, shopping, and even in Java’s basic printing methods.
    6. It works when the program is being written and compiled, not during program execution.
 */

/*
    Common Interview Questions and Answers:

    Q1: What is Method Overloading in Java?
    A: Method Overloading is when we use the same method name but change the number or type of parameters in the same class to perform different tasks.

    Q2: Why do we use Method Overloading?
    A: We use it to make our code cleaner, more flexible, and reusable. It helps us perform similar actions in different ways using the same method name.

    Q3: Can we overload a method just by changing the return type?
    A: No, Java doesn’t allow that. The parameters must be different. Just changing return type is not enough.

    Q4: What is another name for Method Overloading?
    A: It is also called Compile-Time Polymorphism because Java decides which method to run during compilation.

    Q5: Can we overload the main() method in Java?
    A: Yes, you can write multiple main() methods with different parameters. But only the one with String[] args will be called automatically when the program starts.

    Q6: Is it necessary to overload methods in every program?
    A: No, but whenever you need to perform similar actions with different inputs, method overloading is a smart and clean way to do it.
 */
class Calculator {
    int add(int a,int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }
    double add(int a, int b, int c, int d, double e){
        return a+b+c+d+e;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,2,3,4,5.4343));
        System.out.println(c.add(12.21f ,5.43f));
        System.out.println(c.add(1,2,3));
    }
}
