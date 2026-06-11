package com.Advance_Java.SerializationAndDeserialization;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    int age;
    transient int marks;  // ❌ This will NOT be saved during serialization
    /*
    Q1. What Does transient Mean?
        In simple terms, The transient keyword tells Java: “Do NOT save this field when you serialize the object.”
     */
    public Student() {

    }
    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id  + ", name=" + name + ", age=" + age + ", marks=" + marks + '}';
    }
}
