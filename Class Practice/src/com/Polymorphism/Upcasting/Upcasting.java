package com.Polymorphism.Upcasting;
/*
    # Upcasting:- Upcasting means assigning a child object to a parent reference. This is also known as the concept of Loose Coupling.
    What Exactly is Upcasting? 💡
    Standard Definition:
    Upcasting is a feature in Java where a child class object is stored in a parent class reference.
    This happens automatically and is part of Java’s inheritance system.

    Simple Explanation:
    Let’s say your friend went to a restaurant and ordered a pizza, but instead of saying “pizza,”
    he just told the waiter, “Bring me food.” Now, even though he used a general word — food —
    what he actually gets is something specific — a pizza. That’s exactly how Upcasting works in Java.
    You refer to something by its parent type (like food), but behind the scenes, it's really a specific object (like pizza).
    This helps you write flexible and reusable code, without worrying about the exact type every single time.

    You create a Car, but store it as a Vehicle:
    1. Vehicle v = new Car(); // Upcasting
    2. You are calling it “Vehicle” — but behind the scenes, Java knows it’s actually a Car.

    Why Is Upcasting So Important? 🎯
    Upcasting helps us write code that is:
    1. Reusable: We can write one function that works for all types of vehicles.
    2. Clean: No need to write separate logic for Car, Bike, Bus.
    3. Flexible: You can store different objects in the same array or pass them to the same method.
    4. Polymorphic: It’s the foundation for runtime polymorphism in Java.
 */

/*
    📝 Key Points to remember:
    1. Upcasting means assigning a child object to a parent reference.
    2. Java allows upcasting automatically — no special syntax needed.
    3. You can only access parent class methods using the parent reference.
    4. If a method is overridden in the child, the child’s version will run at runtime.

    Summary:
    Definition:
    Upcasting means creating a child object (like Car) but storing it in a parent class reference (like Vehicle).

    Why We Use It:
        1. To treat multiple types as one
        2. To write cleaner and reusable code
        3. To allow Java to decide behavior at runtime

    How It Works:
        1. Car object → stored in Vehicle reference
        2. You can call methods from Vehicle
        3. If method is overridden, Car’s method runs
 */
/*
    Common Interview Questions:
    Q1) What is upcasting in Java?
Answer:
    Upcasting is the process of assigning a subclass (child class) object to a superclass (parent class) reference.
    It allows the program to treat different subclass objects in a uniform way. For example:
        Vehicle v = new Car(); // Car is a subclass of Vehicle
        This enables generalization and is widely used in object-oriented design.

    Q2) Is upcasting done implicitly or explicitly in Java?
Answer:
    Upcasting is done implicitly in Java. Since the subclass object "is a" type of its superclass,
    Java automatically allows this conversion without the need for explicit casting.

    Q3) After upcasting, which method will be executed — the one in the superclass or the subclass?
Answer:
    If a method is overridden in the subclass, the subclass version will be executed at runtime,
    even if the reference type is of the superclass. This is due to runtime polymorphism in Java.

    Q4) Can we access subclass-specific methods using a superclass reference after upcasting?
Answer:
    No, subclass-specific methods (those not defined in the superclass) cannot be accessed directly using
    the superclass reference. To access them, explicit downcasting is required.

    Q5) Why is upcasting useful in real-world applications?
Answer:
    Upcasting simplifies code by allowing polymorphic behavior. It enables handling of multiple object types in a unified way —
    for example, storing various subclass objects in a single collection of superclass type, or passing different child objects to a method that expects a parent reference.
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
public class Upcasting {
    public static void main(String[] args) {
        Plane cp = new CargoPlane();  // Upcasting happening here this is implicit UpCasting

        System.out.println("-----------------");
        cp.takeOff();
        cp.fly();
        cp.land();
        System.out.println("-----------------");

        Plane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.land();

        System.out.println("-----------------");

        Plane fp = new FighterPlane();
        fp.takeOff();
        fp.fly();
        fp.land();

    }
}
