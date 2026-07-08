package com.kodnest.PracticeProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Transaction trans = session.beginTransaction();

        System.out.println("Enter your ID: ");
        int id = sc.nextInt();

        Customers c1 = session.get(Customers.class, id);
        int i = 1;
        while (i < 6) {
            Products p = session.get(Products.class, i);
            System.out.println(p);
            i++;
        }
        System.out.println("How many products do you want to buy?");
        int n  = sc.nextInt();

        ArrayList<Products> alp = new ArrayList<>();
        ArrayList<Customers> alc = new ArrayList<>();

        alc.add(c1);
        while (n > 0) {
            System.out.println("Enter the product ID that you want to purchase: ");
            int pid = sc.nextInt();
            Products p  = session.get(Products.class, pid);

            System.out.println(c1.getName() + ": purchased " + p.getName() + " and the product value is " + p.getPrice());
            alp.add(p);
            c1.setProducts(alp);
            p.setCustomers(alc);
            session.persist(p);
            session.persist(c1);
            n--;
        }
        trans.commit();
        session.close();
        factory.close();
    }
}
