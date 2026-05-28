package com.DataStructures.Collections_Frameworks.hasCodeMethod_EqualsMethod_toStringMethod;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Objects;

/*
Q. Implement hashCode() and equals() Methods
    You are tasked with implementing the hashCode() and equals() methods for a custom class called Person.
    This class will store a person's name and age. Two Person objects should be considered equal if both
    their names and ages are the same. You will also ensure that these objects behave correctly when added
    to a HashSet or LinkedHashSet.

Your Task:
    Write a program that:
        1. Defines a class Person with name and age attributes.
        2. Overrides the hashCode() and equals() methods in the Person class.
        3. Demonstrates the correct behavior of a HashSet by adding Person objects
           to it and checking if duplicates are correctly identified.

Steps to Follow:
    Input:
        1. First, read an integer n, representing the number of people.
        2. Next, read n lines, each containing a person's name and age.

    Output:
        1. Print the contents of the HashSet to show that no duplicates were added.
 */
/*
    Sample Input:
        1. 3
        2. Alice 25
        3. Bob 30
        4. Alice 25
    Sample Output:
        1. Unique people in the HashSet:
        2. Person{name='Alice', age=25}
        3. Person{name='Bob', age=30}
 */
public class _2PracticeOnHashCodeConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of people (n)
        int n = sc.nextInt();
        // TODO: Create a HashSet to store unique Person objects
        HashSet<Person> list = new HashSet<Person>();
        // TODO: Add Person objects to the HashSet and demonstrate correct behavior
        for(int i = 0; i < n; i++) {
            list.add(new Person(sc.next(), sc.nextInt()));
        }

        System.out.println("Unique people in the HashSet:");
        for(Person p : list) {
            System.out.println(p);
        }
        sc.close();
    }
}

class Person {
    private String name;
    private int age;

    // TODO: Implement constructor, hashCode, and equals methods
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person)obj;
        return name.equals(other.name) && age == other.age;
    }

    @Override
    public String toString(){
        return "Person{name='" + name + "', age=" + age +"}";
    }
}