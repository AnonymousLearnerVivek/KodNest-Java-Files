package com.MethodOverriding;
/*
    Method overriding feat. access modifiers
    In Java, when a child class wants to change the way a method works from the parent class,
    it can do that using something called method overriding. This means the child class writes
    the same method again but with its own steps. For example, the parent class may have a method
    that says "make sound," and the child class like Dog can change it to "Dog barks." To do this in Java,
    we use a special word called @Override before the method in the child class. This tells Java that
    we are changing the method from the parent. But the name of the method and the input should be the same
    as in the parent class. Also, the child class should not make the method less visible — for example,
    if the method in the parent is public, it should stay public in the child too. This helps each class do
    the same work in its own way without writing completely new code from the beginning.

    What Exactly is Method Overriding?
    Standard Definition:
    Method overriding is when a subclass provides its own implementation of a method that is already defined in its superclass.
    The method in the subclass must have the same name, return type, and parameters as the method in the parent class.
 */

/*
   # To correctly use method overriding, there are certain rules you need to follow. These rules ensure
     that the child class correctly overrides the method from the parent class without causing any confusion or errors.

    Here are the important rules of method overriding:
    1. Same Method Name: The method in the child class must have the same name as the method in the parent class.

    2. Same Parameters: The child class method must have the same parameters as the parent class method.

    3. Access Modifiers: The visibility of the overridden method in the child class must be the same or more visible than in the parent class.

    # Access Modifiers in Method Overriding
    In Java, access modifiers control who can access a method. There are four types of access modifiers:
    public, protected, default (package-private or package-access), and private.

    Here’s what they mean:
    1. Public: Anyone can access the method.
    2. Protected: Only the same class, subclasses (child classes), and classes in the same package can access the method.
    3. Default (Package-Private): Only classes in the same package can access the method.
    4. Private: Only the same class can access the method.

    When you override a method, the child class cannot make the method less visible than it was in the parent class.
 */

/*
    Let's Understand through Examples:

    Example 1: Public to Public
       If the parent class method is public, the child class method must also be public.

    Example 2: Protected to Public
        If the parent class method is protected, the child class method can be either protected or public (more visible).

    Example 3: Default (Package-Private) to Protected
        If the parent class method has default access (no modifier),
        the child class can make it default, protected, or public (same or more visible).

    Example 4: Default to Private? NO!
        If the parent class method has default access, the child class cannot make it private.
 */
class Parent {
     protected void display() { // it will be either same or increasing the visibility
         // You cannot decrease the visibility of accessibility from parent to child
        System.out.println("Hi");
    }
}

class Child extends Parent {

    @Override
    public void display() {
        System.out.println("Hello");
    }
}
public class MethodOverridingwithAccessModifier {
    public static void main(String[] args) {

    }
}
/*
    Key Points to Remember:
    1. Method Overriding: A child class provides its own implementation of a parent class method with the same name, parameters, and return type.

    2. Same Method Name: The method in the child class must have the same name as in the parent class.

    3. Same Parameters: The method must have the same parameters (inputs) in both the parent and child classes.

    4. Access Modifiers: The visibility of the overridden method in the child class must be the same or more visible than in the parent class.

    5. @Override Annotation: Used to indicate method overriding and ensure the method signature is correct.

    6. Flexibility and Reusability: Method overriding allows child classes to customize parent class behavior while reusing the same method structure.
 */

/*
Common Interview Questions:

    Q1: What is method overriding in Java?
    Answer:
        Method overriding in Java is when a child class provides its own implementation of a method that is already defined in its parent class.
        The method must have the same name, return type, and parameters as the method in the parent class. Method overriding helps the child class
        to change or extend the behavior of the parent class method.

    Q2: Can we override a static method?
    Answer:
        No, static methods cannot be overridden in Java. Static methods are class methods, not instance methods. Therefore, they belong to the class
        and are not associated with an object, so they cannot be overridden. However, you can hide a static method by defining a method with the
        same name in the child class, but it is not considered method overriding.

    Q3: What is the purpose of the @Override annotation?
    Answer:
        The @Override annotation in Java is used to indicate that the method is intended to override a method in the parent class.
        It helps the compiler check that the method is actually overriding a method from the parent class. If the method signature is incorrect,
        the compiler will throw an error.

    Q4: Can the child class reduce the visibility of the overridden method?
    Answer:
        No, the child class cannot reduce the visibility of the overridden method. The overridden method in the child class must have
        the same or more visible access modifier than the method in the parent class. For example, if a parent method is public,
        the child class must also make it public.
 */