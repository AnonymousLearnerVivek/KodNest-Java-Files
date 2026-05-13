package com.Abstraction;
/*
    # Not Abstraction-Introduction To Abstraction
    In the world of programming, especially when using object-oriented programming (OOP), we often come across powerful
    concepts like inheritance and polymorphism. These concepts help make our code easier to work with and more efficient.
    However, before we jump into the idea of abstraction, it’s important to first understand what happens when we don’t use
    abstraction. This helps us see why abstraction becomes such a powerful tool later on.

    # The Need for Abstraction
    Now that we’ve identified the problems with not using abstraction, let's talk about why abstraction is helpful.
    In object-oriented programming, abstraction helps to hide unnecessary details. It allows us to create general
    templates (or blueprints) for classes and define the behaviors that all subclasses should have,
    while allowing each subclass to define its own specific details.

    Standard Definition:
    Abstraction in Java is the concept of hiding the internal details of a system and showing only the essential features.
    It allows you to simplify complex systems by focusing only on what is important, without worrying about how things work behind the scenes.

    Q) Why is Abstraction Important?
    1. Simplifies Complexity:
        Abstraction helps you focus on important parts, hiding the complicated details. It's like using an app without needing to know how it works.

    2. Hides Unnecessary Details:
        Just like driving a car without knowing how the engine works, abstraction hides the complexity and shows only what’s necessary.

    3. Reusability:
        It allows you to create general templates that can be used in different places, saving time and effort.

    4. Easy Updates:
        Abstraction makes it easy to update parts of the system without breaking other parts. It’s like updating an app on your phone without affecting how you use it.
 */

/*
    Key Points to Remember
    1. Simplifies Complex Systems: Focuses only on what is important, hiding the unnecessary details.
    2. Encapsulation: Keeps the internal workings hidden and exposes only necessary features.
    3. Reusability: Promotes reusable code components.
    4. Maintainability: Makes code easier to modify and maintain.
    5. Real-Life Analogy: Abstraction is like using a TV remote — you control the TV without knowing how the remote's circuits work.

    Common Interview Questions and Answers:

    Q1: What is abstraction in Java?
    Answer: Abstraction in Java is the concept of hiding the complex implementation details of a system and exposing only the
            essential features to the user. It’s achieved using abstract classes and interfaces.

    Q2: Why is abstraction important in object-oriented programming?
    Answer: Abstraction is important because it simplifies the design of systems by hiding unnecessary complexities.
            It promotes code reuse, reduces errors, and allows for easier maintenance and scalability.

    Conclusion:
    Abstraction is a powerful concept in object-oriented programming that allows you to design cleaner,
    more manageable systems by focusing on what is essential and hiding complex details. By using abstract classes,
    we can define common behavior in a single place, making our code easier to maintain and extend. As we move forward,
    we’ll dive deeper into abstract classes, which are the key tool in implementing abstraction.
 */

/*
    What Exactly is an Abstract Class?
    Standard Definition:
    An abstract class is a class that cannot be instantiated (you cannot create objects directly from it). It is used as a base class
    for other classes. It allows you to define common features and behaviors that must be shared by all classes that extend it.

    # Key Points to Remember
    1. Abstract classes cannot be instantiated: You cannot create objects directly from an abstract class.
    2. They have abstract methods: These are methods that do not have a body and must be implemented by subclasses.
    3. They can have concrete methods: In addition to abstract methods, abstract classes can also have fully implemented methods.
    4. They are inherited by other classes: Subclasses must provide implementations for the abstract methods, or they must also be declared as abstract.
 */
/*
    What Exactly are Abstract Methods?
    Standard Definition:
    An abstract method is a method that is declared in an abstract class but does not have a body or implementation.
    It’s like a promise that any class extending the abstract class must provide an implementation for that method.

    Key Points to Remember:
    1. Abstract methods don’t have an implementation in the parent class.
    2. The subclasses must provide their own version of the method.
    3. Abstract methods help you define common behavior across different parts of your program while allowing each part to fill in the details.

    Common Interview Questions:
    Q1: What is an abstract method?
    Answer: An abstract method is a method declared in an abstract class without any implementation. It must be implemented by subclasses.

    Q2: Why can’t we create an object of an abstract class?
    Answer: An abstract class is incomplete, so it cannot be instantiated directly. It is meant to be used as a blueprint for subclasses.

    Q3: Can an abstract class have non-abstract methods?
    Answer: Yes, an abstract class can have both abstract methods (without implementation) and non-abstract methods (with implementation).

    Q4: What happens if a subclass does not implement an abstract method?
    Answer: If a subclass does not implement an abstract method, it will also have to be declared as abstract, or the program will throw a compile-time error.

    Conclusion:
    In simple terms, abstract methods act as placeholders in your program. They set up a task that needs to be performed but leave
    the details to be filled in by the subclasses. This approach helps in organizing your code structure, making it more flexible and adaptable to different needs.

    By using abstract methods, you can build programs where common behaviors are defined in one place, but the specific implementations can vary

    according to the subclass. This approach makes the code easier to extend and maintain, and it encourages better organization and reuse of code.
 */
abstract class Animal{
    abstract void eat();
    void sleep(){        // This is also known as Concrete Method
        System.out.println("Animal is sleeping");
    }
    abstract void walk();
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eat");
    }
    @Override
    void walk() {
        System.out.println("Deer is running");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger is eating meat");
    }
    @Override
    void walk() {
        System.out.println("Tiger is walking");
    }
}

class Monkey extends Animal {
    @Override
    void eat() {
        System.out.println("Monkey eating fruits");
    }
    @Override
    void walk() {
        System.out.println("Monkey is running");
    }
}

public class Abstraction {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // You cannot create the object of abstract class, you can create the reference of abstract class
        // You can inherit the abstract class
        Animal animal; // You can create the Reference type of abstract class
        forest(new Deer());
        forest(new Tiger());
        forest(new Monkey());
    }
    static void forest(Animal a) {
        a.eat();
        a.sleep();
        a.walk();
    }
}
/*
    Common Interview Questions and Answers:
    Q1: What is an abstract class in Java?
    Answer: An abstract class is a class that cannot be instantiated. It provides a template for other classes to inherit from and implement specific details.

    Q2: Can an abstract class have constructors?
    Answer: Yes, an abstract class can have a constructor. This constructor can be used to initialize fields in the abstract class.

    Q3: Can we create an object of an abstract class in Java?
    Answer: No, we cannot create an object of an abstract class directly. Abstract classes are meant to be extended by other classes,
            which provide implementations for the abstract methods.

    Conclusion:
    Abstract classes are powerful tools in Java that help keep your code clean, organized, and easy to extend.
    They allow you to define common behavior for related classes while leaving room for flexibility and customization.
    Understanding abstract classes will help you create better software that is easy to maintain and extend in the future.
 */
