package com.Interface;
// Interface is a collection of pure abstract class and interface is not a class
// by default methods inside interface are abstract methods
// in the UML diagram interface represent with rectangular sign <> which indicate that it is an interface not a class


//abstract class Robot {
//    abstract void work();
//    abstract void charge();
//}

interface Robot {
    void work();  // They are By-Default abstract and By-Default they are having an access-Modifier as PUBLIC
    void charge();
}

// since interface is not a class so u cannot extends interface
// that's why to inherit interface u need to use the keyword 'implements' to inherit
class TeacherRobot implements Robot {  // here we will call TeacherRobot as implementing class insist of child class
//    @Override
    public void work() {
        System.out.println("Teacher robot is teaching");
    }
    @Override
    public void charge() {
        System.out.println("Teacher Robot is charging");
    }
}
class DoctorRobot implements Robot {  // here we will call DoctorRobot as implementing class insist of child class
    @Override
    public void work() {
        System.out.println("Doctor robot is doing surgery");
    }
    @Override
    public void charge() {
        System.out.println("Doctor Robot is charging");
    }
}
public class InterfaceInJava {
    public static void main(String[] args) {
        accessRobot(new TeacherRobot());
        accessRobot(new DoctorRobot());
    }
    // we can create the reference of interface, but we cannot create the Object of Interface
    static void accessRobot(Robot r) {
        r.work();
        r.charge();
    }
}
/*
    What is an interface?
    Previously, we explored how abstract classes serve as blueprints for other classes, providing a structure with some
    shared functionality. However, we also noted that abstract classes can sometimes be restrictive because
    they dictate both what needs to be done and how to do it. Now, let's understand how interfaces work, and
    see how they solve the issues we faced with abstract classes.

    What actually Interface is ?
    Standard definition:
    An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
    An interface in Java is a blueprint of a behaviour(method). A Java interface contains static constants and abstract methods.
 */
/*
    Why are Interfaces Important? 🎯
    1. Flexibility: Interfaces allow each class to follow the same rules but implement them in their own way.
    2. Multiple Implementations: A class can follow multiple interfaces, giving it more freedom.
    3. No Restrictions: Unlike abstract classes, interfaces don’t tell you how to do things; they just tell you what to do.

    Key Points to remember:
    1. An interface defines what should be done, but doesn’t specify how to do it.
    2. Interfaces make code more flexible and organized.
    3. Classes can implement multiple interfaces, unlike abstract classes that can only be extended once.
    4. Interfaces help us achieve pure abstraction where we only care about the what, not the how.

    Real-Life Applications of Interface 🌏

    1. Payment Systems:
        Different payment methods like credit cards, UPI, or PayPal can implement a PaymentMethod interface.
        This way, all payment methods follow the same rules but process payments in their own way.

    2. Social Media:
        Different notification methods (like email, SMS, or push notifications) can implement a Notification interface
        to send notifications in their own way.
*/
/*
    Common Interview Questions and Answers:

    Q1) What is an interface in Java?
    Answer:
    An interface in Java is a set of rules that defines what methods a class should have, but it doesn't define
    how those methods are implemented. A class that implements the interface must provide the code for these methods.

    Q2) What is the difference between an abstract class and an interface?
    Answer:
    An abstract class can have both abstract methods (without code) and concrete methods (with code). A class can only extend one abstract class.
    An interface can only have abstract methods (no code), and a class can implement multiple interfaces.
    The interface defines what should be done, but doesn’t provide any implementation details.

    Q3) Can a class implement multiple interfaces?
    Answer:
    Yes, a class can implement multiple interfaces. This is helpful when you want a class to follow multiple sets of rules without being limited to just one blueprint.

    Q4) Can an interface have a constructor?
    Answer:
    No, an interface cannot have a constructor. Interfaces are not meant to create objects but to define a set of methods that classes must implement.

    Q5) What happens if a class implements multiple interfaces with the same method signature?
    Answer:
    If a class implements multiple interfaces with the same method signature, the class must provide its own implementation for that method.
    Java will not get confused as long as the method signature is the same across both interfaces.

    Conclusion:
    To sum it up, interfaces in Java are a powerful way to tell classes what they need to do, but leave the decision of how to do it up to them.
    This makes your code more flexible and organized, allowing different classes to follow the same rules but do things in their own way.
 */
