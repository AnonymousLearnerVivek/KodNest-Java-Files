package com.Polymorphism.IntroductionToPolymorphism;
/*
    Polymorphism derived from 2 Greek Words Poly + Morph which means Many Forms
    # Introduction to Polymorphism 📝
    Definition: Polymorphism is a concept where one method behaves differently depending on the object calling it.

    Tight Coupling:- when assigning a child object to a child reference.
    Ex:- Dog dog = new Dog();

    Loose Coupling = when assigning a child object to a parent reference.
    Ex:- Animal dog = new Dog();

    What Exactly is Polymorphism? 💡
    Standard Definition:
    Polymorphism is the ability of one method or object to take many forms.
    It allows a single reference to call different methods depending on the actual object it refers to.

    # Importance:
    1. Efficiency: Reduces code duplication
    2. Optimization: Makes your code flexible
    3. 2Scalability: Easy to extend your program with new features

    Fundamental Concepts:
    1. Method Overriding
    2. Dynamic Method Dispatch
    3. Upcasting
    Real-World Impact: Found in messaging apps, payment systems, gaming logic, and much more.
 */
/*
    Key Points to remember:
    1. One method, many behaviors – Same method works differently for different objects.
    2. Method overriding + upcasting = polymorphism – Java decides at runtime which method to call.
    3. Code is clean and reusable – No need to rewrite logic for every new object.
    4. Easy to scale – Add new robot types without changing existing code.
    5. Fewer bugs, better maintenance – Less repetition means fewer mistakes.
 */

/*
    Let’s Get Clear on a Few Concepts Before We Dive into Polymorphism
    To understand polymorphism deeply, let’s break it down:

    1. Method Overriding:
    You define a method in the parent class and give it a new version in the child class.
    When you call the method using the parent reference and assign a child object to it, Java will run the child’s version.

    2. Dynamic Method Dispatch:
    This means Java decides at runtime which method to execute depending on the actual object assigned to the reference.
    You don’t have to write if-else or switch statements.

    3. Upcasting:
    When a parent class reference is used to refer to a child class object. It is the base for achieving runtime polymorphism.

    Example:
        Message msg = new TextMessage();
        msg.send(); // Will call TextMessage’s version of send()
 */

/*
    Common Interview Questions:
    Q1: What is polymorphism in Java?
Answer:
    Polymorphism in Java is an object-oriented programming concept where a single method or object can perform
    different behaviors based on the object that calls it. It allows one interface to be used for multiple forms of data.

    Q2: How is polymorphism achieved in Java?
Answer:
    Polymorphism in Java is mainly achieved using method overriding and upcasting. A parent class reference variable
    can refer to a child class object, and Java will automatically call the overridden method at runtime. This is called dynamic method dispatch.

    Q3: Can you explain upcasting with an example?
Answer:
    Yes. Upcasting is when a parent class reference holds a child class object. For example:
    Message msg = new TextMessage();
    Even though the reference is of type Message, the object is of type TextMessage, and when we call msg.send(), the TextMessage version of send() is executed.

    Q4: Why is polymorphism useful in real-world applications?
Answer:
    Polymorphism makes the code flexible, scalable, and easy to maintain. It allows developers to write cleaner and reusable code.
    New features can be added without modifying the core logic, which follows the principle of Open for extension, closed for modification.
 */
class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
    void land() {
        System.out.println("Plane is landing");
    }
}
class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo Plane fly at low altitude");
    }
}
class PassengerPlane extends CargoPlane {
    @Override
    void fly() {
        System.out.println("Passenger Plane fly at medium altitude");
    }
}
class FighterPlane extends CargoPlane {
    @Override
    void fly() {
        System.out.println("Fighter Plane fly at high altitude");
    }
}

class Airport {
    void boarding(Plane p) {
        p.takeOff();
        p.fly();
        p.land();
    }
}

public class IntroToPolymorphism {
    public static void main(String[] args) {

        Plane cp = new CargoPlane();  // Upcasting happening here this is implicit UpCasting
        Plane pp = new PassengerPlane();
        Plane fp = new FighterPlane();
        Airport a = new Airport();

        a.boarding(cp);
        a.boarding(pp);
        a.boarding(fp);
    }
}
