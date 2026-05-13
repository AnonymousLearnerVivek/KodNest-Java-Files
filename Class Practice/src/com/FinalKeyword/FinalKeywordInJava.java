package com.FinalKeyword;

/*
    1. Final Variables
    Definition:
        A final variable is a constant. Once it is given a value, that value cannot be changed.

    2. Final Methods
    Definition:
        A final method is a method that cannot be overridden by a child class. It is like saying:
        “This method is very important. Don’t change how it works.”

    3. Final Classes
    Definition:
        A final class cannot be extended. This means no other class can inherit from it.
 */
/*
    FINAL KEYWORD
    1. final variable - remains constant, cannot be assigned, must be initialized during declaration
    2. final method - will be inherited but cannot be able to override
    3. final class - final class cannot be inherited, but you can create the object of final class and access its data member & member functions
 */
/*
    final keyword in java
    Sometimes in programming, you write something that you never want to change. It might be a value like 100 marks in an exam,
    or a rule like “no one can change this method.” But what if someone changes it by mistake? That can cause errors in your program.

    In real life, think of the rules written on an exam paper — “Do not use a mobile phone” or “You cannot leave the exam room in the first 30 minutes.”
    These rules cannot be changed by students or teachers. They are final.

    Java gives us a special word to make things fixed and unchangeable — the word is final. It tells Java, “This cannot be changed anymore.”

    What Exactly is the final Keyword?
    Standard Definition:
    In Java, the final keyword is used to declare something that cannot be changed. It can be used with:
    1. Variables
    2. Methods
    3. Classes

    Simple Explanation:
    When we use final, we are locking that variable, method, or class.
    You are telling Java:
    1. "This value should not change." (final variable)
    2. "This method should not be changed by child classes." (final method)
    3. "This class should not be extended or inherited." (final class)

    It’s like putting a lock on something in your code to protect it.
*/
class Parent{
    // for final variable naming convention, final variable must be always completely CAPITAL
    final float PI = 3.14f;
    // when you make an variable or method as FINAL you must have to Initialized
    // during the declaration time only and you cannot assign it any time

    final void display(){
//        PI = 4; // this will show an error U cannot change it will be constant because of FINAL keyword
        System.out.println(PI);
    }
}
class Child extends Parent{
    // when parent class is FINAL method it will be inherited to child class
    // but you will not be able to override the final method
}
public class FinalKeywordInJava {
    public static void main(String[] args) {

    }
}
