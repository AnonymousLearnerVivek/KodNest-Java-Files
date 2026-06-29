package com.InnerClasses;

// interface Program // it will work same for interface also
abstract class Program {

    abstract void display1();
    abstract void display2();

}
//class Child extends Program {
//    @Override
//    void display1() {
//        System.out.println("Display1 Method");
//    }
//    @Override
//    void display2() {
//        System.out.println("Display2 Method");
//    }
//}
public class _4AnonymousInnerClass {
    public static void main(String[] args) {
        // We know that you cannot create the object of abstract class, but you can create the Anonymous inner class type like this
        Program p = new Program() {            // This is known as Anonymous inner class - when you have an object but doesn't have reference
          @Override                           // and this method body extends to Program Class
          public void display1() {                  // We use Anonymous inner class when you want to give the implementation of a particular abstract class
              System.out.println("Display1 Method"); // but for that one specific implementation, you don't need to create the separate class again
            }
            @Override
            public void display2() {
                System.out.println("Display2 Method");
            }
        };
        p.display1();
        p.display2();
    }
}
/*
Q1. What Are Anonymous Classes?
    An Anonymous Class is a class without a name, defined on-the-fly for one-time use. It is a quick and convenient way
    to create a class when you don’t need to reuse it. You define it in place and immediately use it. Once the task is completed,
    the anonymous class disappears, and there’s no need to worry about it after that.

Q2. How to Create an Anonymous Class?
    To create an Anonymous Class, you define the class at the point where it’s needed.
    You don’t provide a name for the class; instead, you create it as part of an object creation.
    Here’s the basic structure:
        1. Interface or Class: First, you need to have an interface or an abstract class.
        2. Anonymous Class: Create the class while creating an object, and provide the method implementation directly.
 */

/*
# Key Points to Remember:
    1. An Anonymous Class is a class without a name, created on the spot for one-time use.
    2. It is defined and used immediately, without needing to create a separate class.
    3. Anonymous classes are used to implement interfaces or extend abstract classes with a one-time implementation.

# Common Interview Questions:

    Q1. What is an Anonymous Class in Java?
    Answer: An Anonymous Class is a class without a name, defined and used at the moment it is needed.
            It is typically used to implement an interface or extend a class for a one-time purpose.

    Q2. How do you create an Anonymous Class in Java?
    Answer: You create an anonymous class by defining it at the point where it is used, like this:
        SomeClass obj = new SomeClass() {
            // Override methods here
        };
    The class is defined without a name and used immediately.

    Q3. When should you use an Anonymous Class?
    Answer: Use an Anonymous Class when:
        1. You need a class for a specific, one-time task.
        2. You don’t need to reuse the class.
        3. You want to implement an interface or extend an abstract class without creating a separate named class.

    Q4. Can an Anonymous Class access final variables from the enclosing method?
    Answer: Yes, an Anonymous Class can access final or effectively final variables from the enclosing method.
            This is because these variables are treated as constants within the method.

    Q5. What is the advantage of using an Anonymous Class?
    Answer: The advantage of using an Anonymous Class is that it allows you to define a class on the fly for short-term use,
            saving you the need to create a separate class file. This makes the code more concise and focused on the task at hand.
*/