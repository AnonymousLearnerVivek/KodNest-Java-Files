package com.Inheritance;/*
    Introduction to Inheritance
    What Exactly is Inheritance? 💡

    Inheritance is a way to write code once and reuse it wherever needed. Instead of repeating the same code in different classes,
    we put that common code into one general class. Then, other classes can inherit from that general class and use its features
    without rewriting them. Inheritance is often termed as Is-A relationship and can be achieved in java with the help of extends keyword.
    You can think of it as “copying” the behavior from one class to another — but in a clean, built-in way.

    Standard Definition:

    Inheritance is a fundamental concept in object-oriented programming where one class (called the subclass or child class) acquires
    the properties and behaviors (fields and methods) of another class (called the superclass or parent class).

    Why Is It Important? 🎯
    When your program starts to grow, repeated code becomes hard to manage. Inheritance helps avoid that. It makes your code cleaner and easier to maintain.
    If something common changes (like a hobby), you only need to update it in one place.
 */

    /*
    What’s Next? 📘 — Types of Inheritance in Java
    Now that you understand what inheritance is and why it’s useful, here’s something exciting: Java supports different types of inheritance,
    depending on how classes are connected.

    Here’s a quick overview of the main types:

    1. Single Inheritance
        One class inherits from another. This is the most basic and commonly used type.
    2. Multilevel Inheritance
        A class inherits from a class, which itself inherits from another class — like a chain.
    3. Hierarchical Inheritance
        Multiple classes inherit from the same parent class.
    4. Hybrid Inheritance
        A combination of two or more types of inheritance
    5. Multiple Inheritance (through interfaces)
        Java doesn’t support multiple inheritance with classes directly (to avoid confusion), but it does allow it using interfaces.

    Key Points to Remember 📝

    1. Inheritance means one class can use code from another class.
    2. It helps reduce repeated code and makes maintenance easier.
    3. The extends keyword is used to inherit from a class.
    4. The class giving the code is called the parent or superclass.
    5. The class receiving the code is called the child or subclass.
    */

// Parent class
class Player {
    String hobby = "sports";
    public void play() {
        System.out.println("Play sports!");
    }
}

// Child class
class Cricketer extends Player {
    // Inherits everything from com.Inheritance.Player
}

// Child class
class Footballer extends Player {
    // Inherits everything from com.Inheritance.Player
}

public class IntroductionToInheritance {
    public static void main(String[] args) {
        Cricketer c = new Cricketer();
        System.out.println("com.Inheritance.Cricketer's hobby: " + c.hobby);
        c.play();

        Footballer f = new Footballer();
        System.out.println("com.Inheritance.Footballer's hobby: " + f.hobby);
        f.play();
    }
}

