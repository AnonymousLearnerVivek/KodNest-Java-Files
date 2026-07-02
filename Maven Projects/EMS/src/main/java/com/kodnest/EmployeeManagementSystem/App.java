package com.kodnest.EmployeeManagementSystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static SessionFactory factory = null;
    static Session session = null;
    static Scanner sc = null;
    static Transaction trans = null;
    public static void main(String[] args) {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        session = factory.openSession();
        trans = session.beginTransaction();
        sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Management System");
        System.out.println("Choose your option");
        System.out.println("Press 1 to add new Employee data");
        System.out.println("Press 2 to fetch a Employee data");
        System.out.println("Press 3 to update Employee data");
        System.out.println("Press 4 to remove Employee data");
        System.out.println("Press any key to quit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> addData();
            case 2 -> fetchData();
            case 3 -> updateData();
            case 4 -> removeData();
            default -> {
                System.out.println("Thank you for using this EMS");
                return;
            }
        }

        session.close();
        factory.close();
        sc.close();
    }

    public static void addData() {
        System.out.println("Enter the name. salary, phone number, department");
        Employee employee = new Employee(sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
        session.persist(employee);
        trans.commit();
        System.out.println("Employee data has been added successfully");
    }

    public static void fetchData() {
        System.out.println("Enter the employee id whose details you want to fetch");
        int id = sc.nextInt();
        Employee emp = session.get(Employee.class, id);

        if(emp != null) {
            System.out.println("The Employee details are: ");
            System.out.println(emp);
            System.out.println("Employee data has been fetched successfully");
        } else {
            System.out.println("Employee with id " + id + " not found");
        }
    }

    public static void updateData() {
        System.out.println("Enter the employee id whose details you want to update");
        int id = sc.nextInt();

        Employee emp = session.get(Employee.class, id);
        if (emp != null) {
            System.out.println("Choose what you want to update");
            System.out.println("Press 1 to update employee name");
            System.out.println("Press 2 to update employee Salary");
            System.out.println("Press 3 to update employee phone number");
            System.out.println("Press 4 to update employee department");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the new name");
                    emp.setName(sc.next());
                }
                case 2 -> {
                    System.out.println("Enter the new salary");
                    emp.setSalary(sc.nextInt());
                }
                case 3 -> {
                    System.out.println("Enter the new phone number");
                    emp.setPhone(sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Enter the new department name");
                    emp.setDepartment(sc.next());
                }
            }
        }
        else{
            System.out.println("Employee with id " + id + " not found");
        }
        session.update(emp);
        trans.commit();
    }

    public static void removeData() {
        System.out.println("Enter the employee id whose details you want to delete");
        int id = sc.nextInt();
        Employee emp = session.get(Employee.class, id);
        if(emp != null) {
            session.remove(emp);
            System.out.println("Employee data has been removed successfully");
        }
        else {
            System.out.println("Employee with id " + id + " not found");
        }
        trans.commit();
    }
}
