package com.InnerClasses;
/*
Q1. What Are Local Classes?
    A Local Class is a class defined inside a method of the outer class. Unlike other inner classes, a Local Class exists
    only during the execution of the method in which it is defined. Once the method finishes executing, the local class
    is no longer available. It’s like having a helper who comes in to do a specific job and leaves when the job is done.

Q2. How to Create a Local Class?
    To create a Local Class, you define the class inside a method of the outer class. Here’s the basic structure:
        1. Outer Class: The main class where the method resides.
        2. Local Class: The class defined inside a method of the outer class.
 */
/*
Q3. Why Use Local Classes?
    1. Temporary Use: Local classes are useful when you need a class only within a specific method. They don’t stick around
                      after the method finishes, so they help keep the code clean and focused on a particular task.

    2. Encapsulation: Since the class is local to the method, it can only be used inside the method, ensuring
                      that it doesn't interfere with the rest of the code.

    3. Access to Method Variables: Local classes can access final or effectively final variables from the enclosing method.
                                   This is helpful when you need a class to perform tasks using data from the method.

# Key Points to Remember:
    1. A Local Class is defined inside a method of the outer class.
    2. It is temporary and only exists during the method’s execution.
    3. Local classes can access final or effectively final variables from the outer method.
    4. They are useful for short-term tasks within a method, keeping the code cleaner and more organized.
 */
class OuterClass3 {
    int a = 10;
    static int b = 20;

    void outerDisplay() {
        System.out.println("outer class display method");
        System.out.println(a);
        System.out.println(b);

        class InnerClass {    // This is Local inner class
            int c = 30;
            static int d = 40;

            void innerDisplay() {
                System.out.println("Inner class display method");
                System.out.println(c);
                System.out.println(d);
                System.out.println(a); // a and b are accessible inside the local inner class
                System.out.println(b);
            }
        }

        System.out.println(InnerClass.d); // static variable
        InnerClass ic= new InnerClass(); // you are only allowed to create the object of the local inner class is inside the method
        ic.innerDisplay();
        System.out.println(ic.c);

    }
}
public class _3LocalInnerClass {
    public static void main(String[] args) {
        OuterClass3 oc = new OuterClass3();
        oc.outerDisplay();
        // You cannot be able to create the object of Local inner class outside the method
    }
}
/*
# Common Interview Questions:

    Q1. What is a Local Class in Java?
    Answer: A Local Class is a class defined inside a method of the outer class. It is used to perform a task within that specific method
            and is not accessible outside the method. Once the method finishes execution, the local class is no longer available.

    Q2. Can a Local Class access variables from the outer method?
    Answer: Yes, a Local Class can access variables from the outer method, but the variables must be final or effectively final.
            This means the value of the variable should not change after it’s assigned.

    Q3. What is the scope of a Local Class in Java?
    Answer: The scope of a Local Class is limited to the method in which it is defined. It can only be used within that
            method and is destroyed once the method finishes executing.

    Q4. When should you use a Local Class?
    Answer: You should use a Local Class when you need a class for temporary purposes inside a method. It’s useful when the class
            is only needed for a short time and should not be accessible outside that method.
 */