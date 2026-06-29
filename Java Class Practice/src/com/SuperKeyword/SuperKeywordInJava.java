package com.SuperKeyword;

/*
    The super Keyword
    You’ve just joined a new company and you're asked to build a software system that is already partly developed.
    Instead of rewriting everything from scratch, you want to reuse the existing code and only add what’s new or different.
    Similarly, in object-oriented programming, we often create new classes that are based on existing ones.
    But sometimes, the new class has a variable or method with the same name as the old one. In such cases, how do we access the parent class’s original content?

    When working with inheritance in Java, the super keyword ensures that the child class can still reach into its parent’s resources when needed.

    Standard Definition:
    The super keyword in Java is a reference variable used to refer to the immediate parent class object.
    It allows a subclass to access fields, methods, and constructors of its parent class.

    Clarity in Inheritance: When both parent and child have the same method or variable names,
                            super helps to avoid confusion by clearly pointing to the parent class.

    Let’s understand the different ways super is used in Java:

    1. Accessing Parent Class Variables:
        If the child and parent class both have a variable with the same name, super.variableName is used to refer to the parent’s version.

    2. Accessing Parent Class Methods:
        If the child overrides a method from the parent but still wants to use the parent’s logic, it can do so using super.methodName().
 */

/*
    Key points to remember:

    1. The super keyword refers to the immediate parent class in Java.
    2. It is used to access parent variables, methods, and constructors.
    3. It helps in code reuse, avoiding conflicts, and maintaining clarity in inheritance.
    4. Think of it as a way to respectfully say, “I want to use what my parent class already has.”

    Common Interview Questions:

    Q1. What is the purpose of the super keyword in Java?
    Answer:
    The super keyword is used in a subclass to refer to the immediate parent class. It allows access to parent class variables, methods,
    and constructors, especially when there is a naming conflict or when reusing the parent class’s behavior.

    Q2. Can super be used to access a parent class constructor?
    Answer:
    Yes. super() is used to call a parent class constructor from the child class constructor. If the parent class has a parameterized constructor,
    the child must explicitly call it using super(arguments) as the first statement in the constructor.

    Q3. What happens if a parent and child class both have a variable with the same name? How can we access both?
    Answer:
    If both classes have a variable with the same name, the child class variable hides the parent’s variable.
    You can access the parent class variable using super.variableName and the child’s variable using this.variableName.

    Q4. Can you call a parent class method from the child class if it is overridden?
    Answer:
    Yes. If the child class overrides a method from the parent class, the parent’s version can still be accessed using super.methodName() inside the child class.

    Q5. Can super be used in a static method?
    Answer:
    No. super cannot be used inside a static context because super refers to an object, and static methods belong to the class, not to an object.

    Q6. What happens if you don’t use super() in the child class constructor?
    Answer:
    If you don’t explicitly use super(), Java will automatically insert a no-argument super() call.
    But if the parent class does not have a no-argument constructor, the compiler will throw an error,
    and you must manually call the appropriate parent constructor using super(arguments).
 */

class Parent {
    int i = 10;
    void display() {
        System.out.println("Hii");
        System.out.println(i);
    }
    void demo(){
        System.out.println("Welcome");
    }
}

class Child extends Parent {
    int i = 100;

    @Override
    void display() {
        System.out.println("Hello World");
        System.out.println(i); // it will give preference to local variable and print 100
        // but what we to print the parent class variable i then we will use super keyword
        // to access the parent class members
        System.out.println(super.i);
        demo(); // this will work here perfectly as it is inherited
        // but we can also use super keyword here
        super.demo();
    }
}
public class SuperKeywordInJava {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
