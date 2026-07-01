package com.kodnest.UpdateObject;

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

        System.out.println("Enter the course id to be updated:");
        int id = sc.nextInt();
        Course courseObject = session.get(Course.class, id);

        if(courseObject != null) {
            System.out.println("Enter the updated course name, duration, fees");
            courseObject.setName(sc.next());
            courseObject.setDuration(sc.next());
            courseObject.setFees(sc.nextInt());

            session.update(courseObject);
            System.out.println("Course with id " + id + " updated successfully");
        } else {
            System.out.println("There is no course with id " + id + " to update");
        }

        trans.commit();
        session.close();
        factory.close();
        sc.close();
    }
}
