package com.StaticKeyword;
/*
    What is Static?
    Let’s say you’re building a program to manage student data in a college. Every student has a name, a roll number, and a course.
    That’s easy to store in objects.

    But wait — all students are from the same college: “XYZ University.”

    Do we really need to store the college name separately for every student object? That would be wasteful. Not just in memory,
    but also when we need to update it. If the college name changes, we’d have to update it in every object manually.

    This is exactly the kind of situation where the static keyword in Java is useful. It allows you to declare class-level members,
    so the value is shared across all objects.

    It’s like putting the college name on a whiteboard in the class instead of giving each student a paper. Everyone can see it,
    but you only need to write it once.

    What Exactly is static in Java?
    Standard Definition:
    In Java, the static keyword is used to indicate that a method, variable, block, or nested class belongs to the class itself,
    not to any specific instance of the class.

    This means:
    1. You don’t need to create an object to access it.
    2. The value or method is shared across all instances of the class.
 */
public class StaticKeyword {
    public static void main(String[] args){

        Program.display1(); // to call static members you dont need to create an class object

        Program p = new Program();
        p.display2();
    }
}
/*
    Summary — What You Should Remember

    1. static means the member belongs to the class, not the object.
    2. You can access static members without creating an object.
    3. Static members are shared across all instances of the class.
    4. Non-static members belong to individual objects.
    5. Use static for:
        Common values (like collegeName)
        Utility functions (Math.max())
        Constants (PI, INTEREST_RATE)
    6. You can’t use instance variables inside static methods directly, because no object exists there.
 */

/*
All about static
Summary:
    1. Static variables are shared across all instances of a class and initialize when the class is loaded.
    2. Static methods are tied to the class, not instances, and can be used without creating a class instance, perfect for utility functions that don't need instance data.
    3. Static blocks run once when the class is first loaded, setting up initial conditions before any instances or static methods are used.
    4. Static variables are ideal for common data needed by all instances, like configuration settings or counters.
    5. Static methods are great for tasks that require shared data but don't alter instance-specific details, such as calculations or accessing static variables.
 */
/*
    Common Interview Questions:
    1. What is the purpose of the static keyword in Java?
    Answer:
        The static keyword is used to define class-level members. Static variables and methods belong to the class itself,
        not to any individual object. This means they can be accessed without creating an object. Static is commonly used
        for shared data, constants, and utility methods.

    2. Can you access a static variable using an object?
    Answer:
        Yes, you can access a static variable through an object, but it’s not recommended. The preferred way is to use the
        class name because static members belong to the class, not the object.
            Recommended: ClassName.variableName;
            Not recommended but allowed: objectName.variableName;

    3. Can a static method access non-static data?
    Answer:
        No, a static method cannot directly access non-static (instance) variables or methods. This is because static methods
        can run without any object, and non-static members require an object. You need to create an object to access them inside a static method.

    4. When is the static block executed in Java?
    Answer:
        A static block is executed once, when the class is first loaded into memory. It is used to initialize static variables
        or to perform one-time setup tasks.
 */