package com.Inheritance;

/*
    What Exactly is Multilevel Inheritance? 💡
    Simple Explanation:
        Multilevel inheritance is when a class inherits from a class, which itself inherits from another class.
        It forms a chain of inheritance.

    So you have:
    Vehicle → Car → ElectricCar

    Here:
    1. Car inherits from Vehicle
    2. ElectricCar inherits from Car

    Which means:
    ElectricCar has access to all features of both Car and Vehicle.
 */
class GrandParent {
    float height = 5.8f;
    String eyeColor = "Brown";

    void readBook(){
        System.out.println("Reads com.Consturctor.Book");
    }

    void swim(){
        System.out.println("Can Swim");
    }
}

class Parent extends GrandParent {
    void ride(){
        System.out.println("Can ride");
    }
}
class Child extends Parent {
    void drive(){
        System.out.println("Can drive");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.height);
        System.out.println(p.eyeColor);
        p.readBook();
        p.swim();
        p.ride();

        Child c = new Child();
        System.out.println(c.height);
        System.out.println(c.eyeColor);
        c.readBook();
        c.swim();
        c.ride();
        c.drive();
    }
}
