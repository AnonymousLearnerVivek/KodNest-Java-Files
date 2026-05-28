package com.DataStructures.Collections_Frameworks.hasCodeMethod_EqualsMethod_toStringMethod;

import java.util.HashSet;
import java.util.Objects;

class Employee{
	int id;
	String name;

    public  Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void  display(){
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + id + ", name=" + name + '}';
//    }
}

class Student{
	int id;
	String name;
   public  Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
//    @Override
//    public String toString() {
//        return "Student {" + "id=" + id + ", name=" + name + '}';
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id && Objects.equals(name, student.name);
//    }
}
public class HashCodes {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "KodNest");
        e1.display();
        System.out.println(e1);
        Employee e2 = new Employee(101, "KodNest");
        e2.display();
        System.out.println(e2);


        HashSet<Employee> hs = new HashSet<Employee>();
        hs.add(e1);
        hs.add(e2); //  it will store 2 object for of now because both have different addresses
        System.out.println(hs);






        Student s = new Student(101, "KodNest");

        int[] arr = new int[5];

        String str = "Java";

//        System.out.println(e1);   // output: com.DataStructures.Collections_Frameworks.hasCodeMethod_EqualsMethod_toStringMethod.Employee@2a84aee7
//        System.out.println(s);   // output: com.DataStructures.Collections_Frameworks.hasCodeMethod_EqualsMethod_toStringMethod.Student@a09ee92
//        System.out.println(arr); // output: [I@30f39991
//        System.out.println(str); // output: Java

        // You tell or dont tell toString() method is allways there, toString() method return the Address
//        System.out.println(e.toString());   // output: com.DataStructures.Collections_Frameworks.hasCodeMethod_EqualsMethod_toStringMethod.Employee@2a84aee7
//        System.out.println(s.toString());   // output: com.DataStructures.Collections_Frameworks.hasCodeMethod_EqualsMethod_toStringMethod.Student@a09ee92
//        System.out.println(arr.toString()); // output: [I@30f39991
//        System.out.println(str.toString()); // output: Java // it print value not address because String class Override the toString() method and rest all only inherit it

        // .toString() function is a function in Object Class which all the classes extends automatically
        // Object class have 12 methods and 1 constructor like .equals() , .hashCode(), .toString() etc.

    }
}
