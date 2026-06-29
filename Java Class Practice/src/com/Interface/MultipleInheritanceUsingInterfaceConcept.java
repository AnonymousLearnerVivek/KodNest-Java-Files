package com.Interface;
/*
    Achieving Multiple Inheritance Using Interface Concept
 */
interface Calculator1{
    void add();
    void sub();
}
interface Calculator2{
    void mul();
    void div();
}

abstract class MyCalc implements Calculator1,Calculator2{
    @Override
    public void add() {
        System.out.println("MyCalc is adding");
    }
    @Override
    public void sub() {
        System.out.println("MyCalc is subtracting");
    }
}

class Calc extends MyCalc{
    @Override
    public void mul() {
        System.out.println("Cal is multing");
    }
    @Override
    public void div() {
        System.out.println("Cal is divising");
    }
}

public class MultipleInheritanceUsingInterfaceConcept {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
/*
# So, What’s the Solution?
    In Java, there is a tool called an interface to help solve this problem. An interface is like saying,
    “I don’t care how you do it, just make sure you do it.” It tells you what needs to be done,
    but doesn’t explain how to do it. The class that follows the interface can choose how it wants to do it.
    This way, each class can do things in its own way, while still following the same rules.
    It makes everything simple and flexible, so you can write better and more organized code.

# The Role of Interfaces:
    Interfaces address these limitations by offering pure abstraction and more flexible structure designs.

    1. Multiple Inheritance through Interfaces:
        Unlike classes, Java allows a class to implement multiple interfaces. This feature helps
        overcome the single inheritance limitation, enabling a class to adhere to multiple contracts.

        Example: A Smartphone can be both a Camera and a GPS device. In Java, this would be like a
        class Smartphone implementing two interfaces, Camera and GPS, thereby gaining the functionality of both.

    2. Pure Abstraction:
        Interfaces provide a form of pure abstraction without any method implementations.
        This ensures that classes can implement these methods in their own unique ways.

        Example: Consider a Chargeable interface with a method chargeBattery(). Various devices like Smartphone,
        Laptop, and ElectricCar can implement this interface in different ways according to their specific battery requirements.

# Limitation of Abstract Classes:
    1. Single Inheritance: In Java, a class can inherit from only one superclass. This is like having a key
                            that can open only one specific type of lock—it's useful but limiting.

        Analogy: Imagine you are a student who can only attend one type of class—science or arts, but not both.
                  If you want to learn subjects from both streams, this rule becomes a restriction.

    2. Strong Class Coupling: Abstract classes can define concrete methods, which means they can still dictate some behaviors.
                              This tight coupling can make the system less flexible.

        Analogy: Think of a fixed menu in a restaurant. You can choose a meal plan, but you can’t change the dishes.
                 If the restaurant changes a dish, it affects everyone who chooses that plan.

# Key Points to remember:
    1. Abstract classes are useful, but they can restrict flexibility and creativity because they define how to do things, not just what needs to be done.
    2. Interfaces provide pure abstraction, telling us what needs to be done, but allowing each class to decide how to do it.
    3. Interfaces offer more freedom and allow multiple inheritance, which makes the code more flexible and easier to maintain.

# Conclusion:
    In short, abstract classes are great when you want to share some common features among classes but also want to control
    how things are done. However, they can limit flexibility because a class can only extend one abstract class.

    On the other hand, interfaces are more flexible because they allow a class to follow multiple sets of rules without
    being restricted by a single blueprint. Interfaces let classes decide how to do things while still ensuring they follow the same basic rules.

    Now that we understand the differences, let’s move on to interfaces and see how they help us create more flexible and organized code.


 */