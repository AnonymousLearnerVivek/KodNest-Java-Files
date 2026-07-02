package com.kodnest.EmployeeManagementSystem;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    int salary;

    @Column
    int phone;

    @Column
    String department;

    public Employee() {
    }
    public Employee(String name, int salary, int phone, String department) {
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.department = department;
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
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", salary=" + salary + ", phone=" + phone +  ", department=" + department;
    }

}
