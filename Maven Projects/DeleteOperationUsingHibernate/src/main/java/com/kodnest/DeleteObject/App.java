package com.kodnest.DeleteObject;

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

        System.out.println("Enter the course ID to delete:");
        int id = sc.nextInt();

        Course courseObject = session.get(Course.class, id);

        if(courseObject != null){
//            session.delete(courseObject); // .delete
            session.remove(courseObject);
            System.out.println("Course with id " + id + " deleted successfully");
        }  else {
            System.out.println("There is no course with ID: " + id);
        }

        trans.commit();
        session.close();
        factory.close();
        sc.close();

    }
}
