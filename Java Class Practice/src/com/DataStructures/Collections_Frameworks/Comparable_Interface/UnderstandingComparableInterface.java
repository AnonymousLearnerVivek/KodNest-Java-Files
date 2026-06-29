package com.DataStructures.Collections_Frameworks.Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Student implements Comparable<Student>{
    int id;
    String name;
    int marks;
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;  // Comparing based on id and this will sort into ascending order
//        return student.id - this.id; // This will sort into descending order
    }
//    @Override
//    public int compareTo(Student student) {
//        return this.marks - student.marks;  // Comparing based on marks
//    }

//    @Override
//    public int compareTo(Student student) {
//        return this.name.compareTo(student.name);  // Comparing based on name
//        /*
//            here we use compareTo() method because we are comparing strings and String Class already
//            implemented compareTo() method so this will call compareTo() method of the String Class.
//        */
//    }
}
public class UnderstandingComparableInterface {
    public static void main(String[] args) {
        List<Integer> l1  = new LinkedList<>();
        l1.add(100);
        l1.add(250);
        l1.add(50);
        l1.add(40);
        l1.add(150);
        System.out.println(l1);
        Collections.sort(l1); // it will sort the list in ascending order
        System.out.println(l1);

        List<String> l2  = new LinkedList<>();
        l2.add("Hello");
        l2.add("Vivek");
        l2.add("Purnima");
        l2.add("Shruti");
        l2.add("Lauren");
        System.out.println(l2);
        Collections.sort(l2); // it will sort the list in alphabetical order
        System.out.println(l2);

        // Now how to sort Custom class/Objects
        // like how it should it be sorted like based on id or name or marks ?
        List<Student> l = new LinkedList<>();
        l.add(new Student(10, "E", 10));
        l.add(new Student(5, "D", 20));
        l.add(new Student(3, "C", 30));

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

    }
}
