package com.DataStructures.Collections_Frameworks.Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee  {
    /*
        this class employee in which you have variables, parametrized constructor, zero-Parametrized constructor, and setter and getter is known as POJO CLASS
     */
    int id;
    String name;
    int salary;
    String email;
    public Employee(int id, String name, int salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }
//    public Employee() {
//        super();
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getSalary() {
//        return salary;
//    }
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }

    @Override
    public String toString() {
        return "[" + id + " " + name + " " + salary + " " + email + "]";
    }
}
class Demo1 implements Comparator<Employee> {
    @Override
    public int compare(Employee eo1, Employee eo2) {
        return eo1.id - eo2.id;
    }
}
class Demo2 implements Comparator<Employee> {
    @Override
    public int compare(Employee eo1, Employee eo2) {
        return eo1.name.compareTo(eo2.name);
    }
}
class Demo3 implements Comparator<Employee> {
    @Override
    public int compare(Employee eo1, Employee eo2) {
        return eo1.salary - eo2.salary;
    }
}
class Demo4 implements Comparator<Employee> {
    @Override
    public int compare(Employee eo1, Employee eo2) {
        return eo1.email.compareTo(eo2.email);
    }
}
public class UnderstandingComparatorInterface {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(103,  "Vivek", 3000000, "vivek@gmail.com"));
        list.add(new Employee(101, "Dhoni", 2500000, "dhoni@gmail.com"));
        list.add(new Employee(105, "Virat", 100000000, "virat@gmail.com"));
        list.add(new Employee(107, "Abhishek", 12220000, "abhishek@gmail.com"));

        System.out.println(list);
        Collections.sort(list, new Demo1()); // it will sort on the basis of id
        System.out.println("it will sort on the basis of id");
        System.out.println(list);

        Collections.sort(list, new Demo2()); // it will sort on the basis of Name
        System.out.println("it will sort on the basis of name");
        System.out.println(list);

        Collections.sort(list, new Demo3()); // it will sort on the basis of Salary
        System.out.println("it will sort on the basis of Salary");
        System.out.println(list);

        Collections.sort(list, new Demo4()); // it will sort on the basis of email
        System.out.println("it will sort on the basis of email");
        System.out.println(list);
    }
}
