package com.DataStructures.Collections_Frameworks.hasCodeMethod_EqualsMethod_toStringMethod;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Objects;
/*
Q. Implement hashCode() and equals() for a Car Class
    You are building a system for managing a fleet of cars for a car rental service.
    The cars are identified by their model and year. The fleet system should not allow
    duplicate entries (i.e., the same car should not be added more than once). To ensure this,
    you need to properly implement the hashCode() and equals() methods in a Car class.

    Two cars are considered the same if both their model and year are identical. By overriding
    the hashCode() and equals() methods in the Car class, you can ensure that duplicate cars
    are not added to a HashSet.

Your Task:
    Write a program that:
        1. Defines a class Car with attributes model and year.
        2. Overrides the hashCode() and equals() methods in the Car class.
        3. Demonstrates the correct behaviour by adding Car objects to a HashSet
           and checking if duplicates are correctly identified.

Steps to Follow:
    1. Input:
        1. First, read an integer n, representing the number of cars.
        2. Next, read n lines, each containing a car's model (string) and year (integer).

    2. Output:
        1. Print the contents of the HashSet to show that no duplicate cars were added.
 */
/*
    Sample Input:
        1. 3
        2. Honda 2019
        3. Toyota 2018
        4. Honda 2019
    Sample Output:
        1. Unique cars in the HashSet:
        2. Car{model='Toyota', year=2018}
        3. Car{model='Honda', year=2019}
 */
public class _1PracticeOnHashCodeConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of cars (n)
        int n = sc.nextInt();
        // TODO: Create a HashSet to store unique Car objects
        HashSet<Car> list = new HashSet<>();
        // TODO: Add Car objects to the HashSet and demonstrate correct behavior
        for(int i = 0; i < n; i++) {
            list.add(new Car(sc.next(), sc.nextInt()));
        }
        System.out.println("Unique cars in the HashSet:");
        for(Car c : list) {
            System.out.println(c);
        }
        sc.close();
    }
}

class Car {
    private String model;
    private int year;

    // TODO: Implement constructor, hashCode, and equals methods
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public int hashCode(){
        return Objects.hash(model, year);
    }
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car c = (Car)obj;
        return model.equals(c.model) && Objects.equals(year, c.year);
    }

    public String toString() {
        return "Car{model='" + model + "', year=" + year + "}";
    }
}