package com.Inheritance;

/*
    Single Inheritance is a type of inheritance in which a class (subclass or child class) inherits the properties
    and behaviors (fields and methods) of one parent class (superclass).
    It allows code reusability by enabling the subclass to use and extend the functionality of the superclass.
 */
class Person {
    String name;
    void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }
}
class Professor extends Person {
    String department;
    void conductLecture() {
        System.out.println(name + " is conducting a lecture.");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Harish Pathak";
        professor.department = "Computer Science";
        System.out.println("com.Inheritance.Professor Name: " + professor.name);
        System.out.println("Department: " + professor.department);
        professor.introduce();
        professor.conductLecture();
    }
}