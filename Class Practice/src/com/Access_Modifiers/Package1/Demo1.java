package com.Access_Modifiers.Package1;

/*
    we have 4 access modifiers or access specifiers also called
    known as accessibility or visibility
    visibility order:  public > protected > default > private
    accessibility order: public > protected > default > private

    1. public
    2. protected
    3. Default  or package access
    4. Private
 */
/*
    1. public Access Modifier
     The public access modifier allows the class, method, or variable
     to be accessed from anywhere in the program — even from different
     packages. This is the most open level of access.

     2. protected Access Modifier
    The protected access modifier allows access to a method or variable from:
        i) The same package, and
       ii) Subclasses (even if they are in a different package)
    This is more restricted than public but more open than private.

    3. Default Access Modifier (No Keyword)
        If no access modifier is written, Java applies default access
        (also called package-private). This means the member can only
        be accessed within the same package.

    4. private Access Modifier
    The private access modifier is the most restrictive.
    It allows access only inside the same class.
    Even classes in the same package cannot access it.
 */


public class Demo1 {
    //    int a; // if nothing is mentioned then it is implicitly have default access modifier not public
    public int a;
    protected int b;
    int c; // it will be default modifier
    private int d;
    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
/*
    1. public – open to all
    2. protected – open to related classes and same package
    3. default (no keyword) – open only in the same package
    4. private – open only inside the same class
 */
/*
What Exactly Are Access Specifiers?

Standard Definition:

Access specifiers in Java are keywords used to define the visibility or accessibility
of classes, methods, and variables. They help in protecting the code by controlling
where it can be accessed from.

Simple Explanation:
Access specifiers tell us who is allowed to use what in your code. They help
you protect your data and avoid mistakes. With access specifiers, you decide
if something is public for everyone, private for your class only, or protected
for child classes, and so on.
 */

/*
Common Interview Questions:

    Q1. What are access specifiers in Java?
    Answer: Access specifiers are keywords used to define who can access classes, methods, or variables in a Java program. They help protect data and organize the code.

    Q2. How many types of access specifiers are there in Java?
    Answer: There are four access specifiers:
            1. public
            2. protected
            3. default (no keyword)
            4. private

    Q3. What is the difference between public and private?
    Answer: public means the code can be accessed from anywhere.
            private means the code can be accessed only inside the same class.

    Q4. What happens if no access modifier is written?
    Answer: Then Java uses default access. This means the class, method, or variable can be accessed only within the same package.

    Q5. Can a protected method be accessed in another package?
    Answer: Yes, but only through inheritance. If a class in another package extends the class with the protected method, it can access it.

    Q6. Why is private used in Java?
    Answer: private is used to hide important data or methods that should not be accessed by other classes. It helps keep data safe and secure.
 */
