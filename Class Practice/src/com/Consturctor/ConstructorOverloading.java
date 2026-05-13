package com.Consturctor;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(){
        id = 1;
        name = "KodNest";
        age = 20;
    }

    public Student(int id){
        this.id = id;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = 23;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

public class ConstructorOverloading {
    public static  void main(){
        Student s1 = new Student(101, "Vivek", 22);
        s1.display();
        Student s2 = new Student();
        s2.display();
        Student s3 = new Student(102);
        s3.display();
        Student s4 = new Student("Vivek", 18);
        s4.display();
    }
}
/*
    What Exactly Is Constructor Overloading? 💡

    Standard Definition: Constructor overloading in Java means having more than one constructor
    in the same class — but each constructor has a different set of parameters.

    Key Takeaways 📝
        Constructor overloading allows you to create multiple constructors in one class
        Each constructor has a different parameter list
        Java picks the right constructor based on the arguments you pass when creating the object
        It makes your code easier to use, more flexible, and cleaner
        You can offer both simple and detailed ways to create objects without repeating code.
 */