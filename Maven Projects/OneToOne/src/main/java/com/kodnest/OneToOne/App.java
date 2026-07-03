package com.kodnest.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Transaction trans = session.beginTransaction();

        Address addr = new Address();
        addr.setStreat("11th main road");
        addr.setArea("BTM Layout");

        StudentTable std = new StudentTable(102, "Vivek", "vivek@gmail.com", 23345, addr);

        session.persist(std);
        System.out.println("Added Successfully");

        trans.commit();
        session.close();
        factory.close();

    }
}
