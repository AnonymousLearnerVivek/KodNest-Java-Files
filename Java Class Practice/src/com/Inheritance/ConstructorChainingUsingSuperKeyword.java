package com.Inheritance;// super() method will call the parent class constructor
/*
    What Exactly is Constructor Chaining ? 💡
    Simple Explanation:
    Constructor chaining means calling one constructor from another — either within the same class or from the parent class.
    When you're dealing with inheritance, and you want to call the parent class's constructor from the child class, you use the keyword super().
    It helps pass values and run initialization logic from the parent class, so you don’t have to repeat code in the child class.

    Standard Definition:
    Constructor chaining is a process where a child class constructor explicitly calls the constructor of its parent class using the super() keyword.
    This ensures that the parent part of the object is properly initialized before the child-specific details are set.

    Why Is It Important? 🎯
    1. Promotes code reuse
    2. Helps in initializing parent class fields from child class
    3. Avoids writing the same initialization logic again
    4. Ensures that the object is built correctly, from top (parent) to bottom (child)
 */

/*
    Key Takeaways 📝
    1. super() method is used to call the constructor of the immediate parent class.
    2. It must be the first statement in the child constructor.
    3. Helps avoid repeating code and keeps object construction organized.
    4. Useful in inheritance, where child classes need to initialize parent class fields.
 */

/*
    Common Interview Questions:

    Q1: What is constructor chaining in Java?
Answer:
    Constructor chaining is the process where one constructor calls another to reuse initialization logic.
    If the call is within the same class, you use this()
    If it’s calling a constructor from the parent class, you use super()
    This helps reduce code duplication and keeps constructors organized.

    Q2: What does the super() keyword do?
Answer:
    The super() keyword is used to call the constructor of the parent class.
    It allows the child class to initialize fields or behavior inherited from the parent, ensuring proper construction of the entire object hierarchy.

    Q3: Can we use super() anywhere in the constructor?
Answer:
    No super() must be the very first line in the constructor.
    If you try to place it elsewhere, Java will throw a compile-time error.

    Q4: What happens if you don’t use super() explicitly?
Answer:
    If the parent class has a no-argument (default) constructor, Java will insert super() automatically.
    However, if the parent class only has parameterized constructors, you must call one of them explicitly using super(args) — or the code won’t compile.

    Q5: Can you use both super() and this() in a constructor?
Answer:
    No. You can use either super() or this(), but not both in the same constructor — and whichever one you use, it must be the first line.
 */
//class Person1 {
//    String name;
//    int age;
//
//    public Person1(String name, int age) {
//        super();
//        this.name = name;
//        this.age = age;
//    }
//    public Person1() {
//        System.out.println("Default constructor");
//    }
//}
//
//class Student2 extends Person1 {
//
//    int marks;
//
//    public Student2(String name, int age, int marks) {
////        this.name = name;
////        this.age = age;
//        super(name, age);
//        this.marks = marks;
//    }
//    public Student2(int marks) {
//        super(); // it will be default whather you write it or not, inside every constructor it will be there
//        this.marks = marks;
//    }
//    public Student2() {
//        super(); // it will be always there inside a constructor whether we write it or not
//        System.out.println("Default constructor");
//    }
//}

class Vehicle {
    int wheels;

    // Constructor of the com.Inheritance.Vehicle class
    public Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("com.Inheritance.Vehicle with " + wheels + " wheels created.");
    }
}

class Car extends Vehicle {
    String model;

    // Constructor of the com.Inheritance.Car class
    public Car(String model) {
        super(4);  // Explicit call to the superclass constructor
        this.model = model;
        System.out.println("com.Inheritance.Car model " + model + " created.");
    }
}

public class ConstructorChainingUsingSuperKeyword {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S");  // This will invoke the com.Inheritance.Car constructor
    }
}

// Implicit super() function call
/*
    What Exactly is Implicit super()? 💡
    When you create an object from a child class, Java automatically calls the parent class’s constructor —
    even if you don’t write super() yourself. This is called an implicit call to super().
    It helps set up the parent part of the object before moving on to the child.

    If the parent class has a simple constructor with no inputs, Java adds this call for you. But if the parent needs some input,
    then you have to write super() yourself and pass the values — otherwise, Java won’t know what to do.

    Standard Definition:
    In Java, implicit super() refers to the automatic call to the no-argument constructor of the parent class
    that the compiler inserts at the beginning of a subclass constructor if no super() or this() is explicitly written.
    This ensures that the parent class is properly initialized before the child class.
 */
