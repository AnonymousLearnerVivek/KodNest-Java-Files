package com.InnerClasses;
/*
Q1. What Are Static Nested Classes?
    A Static Nested Class is a class defined inside another class with the static keyword. Unlike Member Inner Classes,
    which are tied to the outer class’s instance, a Static Nested Class doesn’t need an instance of the outer class to exist.
    It's like your cousin who’s part of the family but doesn’t need to live with you to be involved in family events.

Q2. How to Create a Static Nested Class?
    To create a Static Nested Class, you simply define the inner class inside the outer class and use the static keyword.
    Here’s the basic structure:
        1. Outer Class: This is the main class.
        2. Static Nested Class: Inside the outer class, use the static keyword to define the nested class
 */
/*
Q3. Why Use Static Nested Classes?
    1. Independence from Outer Class: Static Nested Classes don’t depend on an instance of the outer class. This makes them useful
                                      when the inner class needs to be part of the outer class but doesn’t need access to the
                                      outer class’s instance data.

    2. Memory Efficiency: Since Static Nested Classes don’t hold a reference to the outer class’s instance, they are more memory-efficient.

    3. Organization: Static Nested Classes help group related functionality inside the outer class while maintaining the independence of the nested class.

# Key Points to Remember:
    1. A Static Nested Class is a class inside another class defined using the static keyword.
    2. No instance of the outer class is needed to create an instance of a Static Nested Class.
    3. It is memory efficient because it does not hold a reference to the outer class instance.
    4. Static Nested Classes can be used when the class is related to the outer class but doesn’t need to access the instance data of the outer class.

 */
class OuterClass1 {
    static int a = 10;

    static class InnerClass1 {
        static int b = 20;
        int c = 30;

        static void innerDisplay() {
            System.out.println("Inner class static display method is called");
            System.out.println(b);
//            System.out.println(c); // it will show an error you cannot access the non-static variable inside an static method
        }

        void disp() {
            System.out.println("Inner class non static display method is called");
            System.out.println(b);
            System.out.println(c);
        }
    }

    static void outerDisplay() {
        System.out.println("Outer class static display method is called");
        System.out.println(a);
        System.out.println(InnerClass1.b); // you can access the static variable b here outside the innerclass
        InnerClass1.innerDisplay();
        InnerClass1 ic = new InnerClass1();
        System.out.println(ic.c); // creating object to access non-static variable from static inner class

    }
}

public class _2StaticNestedClasses {
    public static void main(String[] args) {

        OuterClass1.outerDisplay();

        OuterClass1.InnerClass1.innerDisplay();
        // To create the object of static inner class you don't need to create the object of outer class
        OuterClass1.InnerClass1 ic= new OuterClass1.InnerClass1();
        ic.disp();

    }
}
/*
Common Interview Questions:

    1. What is a Static Nested Class in Java?
    Answer: A Static Nested Class is a class defined inside another class using the static keyword. Unlike a member inner class,
            it does not require an instance of the outer class to exist. It can be instantiated independently, making it useful
            for situations where the inner class is related to the outer class but does not need access to its instance variables.

    Q2. Can a Static Nested Class access the instance variables of the outer class?
    Answer: No, a Static Nested Class cannot access the instance variables or methods of the outer class directly.
            Since it is independent of the outer class instance, it can only access static members of the outer class.

    Q3. What is the difference between a Static Nested Class and a Member Inner Class?
    Answer:
        1. A Member Inner Class is tied to an instance of the outer class. It can access both static and instance variables of the outer class.
        2. A Static Nested Class is not tied to an instance of the outer class and can only access static members of the outer class.
           It can be instantiated without creating an instance of the outer class.

    Q4. When should you use a Static Nested Class?
    Answer: You should use a Static Nested Class when:
            1. The inner class is related to the outer class but does not need access to instance variables of the outer class.
            2. The inner class should be able to function independently of the outer class.
            3. You want to group related functionality together, but the class does not need to rely on instance data.
 */