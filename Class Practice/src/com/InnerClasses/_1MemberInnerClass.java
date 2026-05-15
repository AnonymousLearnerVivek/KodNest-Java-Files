package com.InnerClasses;
/*
Q1. What Are Member Inner Classes?
    A Member Inner Class is a class that is defined inside another class. It is like a helper class that works
    closely with the outer class and has access to all the variables and methods of the outer class, even private ones.
    You can think of a Member Inner Class as a younger sibling who always helps you with tasks and knows all your secrets.
 */
class OuterClass {
    int a = 10;

    class InnerClass {    // also knows as non-static inner class and Member inner Class
        int b = 20;

        void innerDisplay() {
            System.out.println("Inner class display method is called");
            System.out.println(b);
            System.out.println(a); // You can access 'a' inside the inner class
        }
    }

    void outerDisplay() {
        System.out.println("Outer class display method is called");
        System.out.println(a);
//        System.out.println(b); // You can not access the 'b' outside the inner class
    }
}
public class _1MemberInnerClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.outerDisplay();

        OuterClass.InnerClass ic = oc.new InnerClass(); // whenever you want to create the object of inner class you first need to create
                                                        // the object of outer class
        ic.innerDisplay();
    }
}
/*
# Common Interview Questions:

    Q1. What is a Member Inner Class in Java?
    Answer: A Member Inner Class is a class defined inside another class. It can access all the members (including private ones)
            of the outer class. It is called a "member" inner class because it behaves like a member of the outer class.
            This means it can access the data of the outer class directly.

    Q2. Can a Member Inner Class access the private members of its outer class?
    Answer: Yes, a Member Inner Class can access all the private members (fields and methods) of the outer class.
            This is because the inner class is considered a part of the outer class, so it has full access to its private data.

    Q3. What is the difference between a Member Inner Class and a Static Nested Class?
    Answer:
        1. A Member Inner Class is associated with an instance of the outer class, meaning it requires an object of the outer class
           to be created in order to instantiate the inner class.
        2. A Static Nested Class, on the other hand, is not associated with an instance of the outer class. It can be instantiated
            without creating an object of the outer class and cannot access the instance variables or methods of the outer class.

 */