package com.kodnest.ReadObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Transaction trans = session.beginTransaction();

        System.out.println("Enter the ID:");
        int id = sc.nextInt();
        Student std = session.get(Student.class, id); // .get() method returns persistent instance if found or else returns null

        if(std != null) {
            System.out.println("The student details: ");
            System.out.println("ID: " + std.getId());
            System.out.println("Name: " + std.getName());
            System.out.println("Age: " + std.getAge());
            System.out.println("Gender: " + std.getGender());
            System.out.println("Email: " + std.getEmailid());
        } else {
            System.out.println("There is no student with id: " + id);
        }

        trans.commit();

        session.close();
        factory.close();

    }
}




