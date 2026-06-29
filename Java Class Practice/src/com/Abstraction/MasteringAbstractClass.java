package com.Abstraction;
// Actual Meaning of the Abstract word is incomplete
/*
    Q) What is the primary purpose of abstract classes in Java?
    The primary purpose of abstract classes is to serve as a superclass in inheritance hierarchies,
    providing a template that enforces certain structure while allowing flexibility in the implementation
    of specific details through abstract methods. This design supports polymorphism and code reuse.


    Key Points About Abstract Classes
    1. Creating References, Not Objects:
        One key feature of abstract classes is that you can't create an object directly from an abstract class.
        But you can create references of an abstract class type, which will refer to objects of its subclasses.
        This allows you to leverage polymorphism — one reference type pointing to different objects,
        enabling you to perform different tasks based on the actual type of the object.

    2. Abstract vs. Concrete Classes:
        In Java, classes that are not abstract are known as concrete classes. Concrete classes are fully defined
        and can be instantiated directly. On the other hand, abstract classes cannot be instantiated, and
        they often contain abstract methods — methods without a body — which must be implemented by the subclasses.

    3. Implementing Abstract Methods:
        When a class extends an abstract class, it must implement all the abstract methods of the parent class,
        unless the subclass is also abstract. This ensures that every subclass has the specific behavior
        that was declared in the parent abstract class.

    4. Pure and Impure Abstract Classes:
        i) Pure Abstract Classes: These are abstract classes that only contain abstract methods (no concrete methods).
                                  They provide a strict framework for subclasses to implement the required behaviors.

       ii) Impure Abstract Classes: These classes contain both abstract methods (methods without implementations) and
                                    concrete methods (methods with implementations). They provide some default functionality
                                    while enforcing that subclasses implement specific abstract methods.

    5. Inheritance Works Similarly with Abstract Classes:
        Just like concrete classes, abstract classes can be extended. You can extend an abstract class in another
        abstract class to build a hierarchy of abstract classes. Each level of abstraction can add more methods that need to be implemented by subclasses.

    6. Layered Abstraction:
        In Java, you can have layered abstraction, where one abstract class extends another. This is helpful
        when you need a multi-level hierarchy, and each level can define more abstract methods for subclasses to implement.
 */

/*
    Key Points to Remember:
    1. Abstract Classes Can't Be Instantiated: You cannot create objects of an abstract class. They serve as blueprints for subclasses.

    2. Abstract Methods: Abstract classes can contain abstract methods, which do not have implementation in the abstract class itself.
                         These methods must be implemented by any subclass that extends the abstract class.

    3. Concrete Methods in Abstract Classes: An abstract class can also have concrete methods, which are fully implemented methods that can be inherited by subclasses.

    4. Inheritance: Abstract classes are extended by concrete subclasses, and the subclasses must provide implementations
                    for the abstract methods unless the subclass is also abstract.

    5. Polymorphism with Abstract Classes: Abstract classes allow polymorphism, where a reference of the abstract class can point to an object of any subclass.

    Common Interview Questions and Answers:
    Q1: Can an abstract class have concrete methods?
    Answer:
    Yes, an abstract class can have concrete methods. These methods are fully implemented and can be inherited by the subclasses without needing to be overridden.

    Q2: Can an abstract class have multiple constructors?
    Answer:
    Yes, an abstract class can have multiple constructors, just like any other class. These constructors can be called by subclasses using the super keyword.

    Q3: What happens if a subclass doesn’t implement the abstract methods?
    Answer:
    If a subclass does not implement all the abstract methods of the parent abstract class, the subclass must be declared abstract as well.
    Otherwise, the code will result in a compile-time error.
 */

// Example of Layered Abstraction
abstract class Calci1 {
    public abstract void add();
    public void sub() {
        System.out.println("Subtraction method in Calci1");
    }
}

abstract class Calci2 extends Calci1 {
    public abstract void multiply();
    public abstract void divide();
}

class Calculator extends Calci2 {
    public void add() {
        System.out.println("Addition functionality");
    }

    public void subtract() {
        super.sub();
        System.out.println("Subtraction functionality");
    }

    public void multiply() {
        System.out.println("Multiplication functionality");
    }

    public void divide() {
        System.out.println("Division functionality");
    }
}
public class MasteringAbstractClass {
    public static void main(String[] args) {
        Calci2 cal = new Calculator();
        cal.add();
        cal.sub();
        ((Calculator)(cal)).subtract(); // because subtract() is child-specific method and sub() is inherited method
        cal.multiply();
        cal.divide();
    }
}
