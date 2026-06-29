package com.Inheritance;/*

    Java does not support multiple inheritance using classes.

    What Exactly is Multiple Inheritance? 💡
    Standard Definition:
    Multiple inheritance is a feature where a class tries to inherit behavior from two or more parent classes.
    This can lead to confusion if the parent classes have methods with the same name. To avoid such conflicts
    and ambiguity, Java does not support multiple inheritance using classes.

    Why Is Multiple Inheritance Not Allowed with Classes in Java? 🛑
    This is because of something called the diamond problem. Sounds new, right?
    Don’t worry — let’s understand what the diamond problem actually means in a simple way.

    Definition:
    The diamond problem happens when a class inherits from two classes that both inherit from the same parent class.
    If both child classes override a method from the parent, the grandchild class won’t know which method to use — this creates ambiguity.

    Visual Structure of Multiple Inheritance:

           A
         /   \
        B     C
         \   /
           D
    1. Class A is the base class. Assume It has a method called display().
    2. Classes B and C both inherit from A, and they might each override the display() method.
    3. Class D then tries to inherit from both B and C.
    4. If class D now calls the method display(), Java gets confused:

    1. Should it use the version from class B?
    2. Or should it use the version from class C?
    This unclear situation is called ambiguity, and Java does not allow this kind of structure with classes because it cannot decide which version of the method to choose.
 */

/*
    Key Takeaways 📝
    1. Multiple inheritance means a class can inherit behavior from more than one source
    2. Java does not allow multiple inheritance with classes to avoid the diamond problem
    3. Java does allow multiple inheritance through interfaces
    4. Interfaces declare methods; classes implementing them define the behavior
    5. This makes Java's inheritance model safe, clear, and powerful
 */
public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Java does not support multiple inheritance using classes.");
    }
}
