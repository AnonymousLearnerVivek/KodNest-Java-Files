package com.kodnest.ManyToOne;

/**
 * Hello world!
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Set up Hibernate session
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Create a village
        Village village = new Village();
        village.setName("Greenfield");
        village.setDistrict("Bengaluru Urban");

        // Create houses in the village
        House house1 = new House();
        house1.setHouseNumber("H-101");
        house1.setOwnerName("Ravi Kumar");
        house1.setVillage(village); // Link house to village

        House house2 = new House();
        house2.setHouseNumber("H-102");
        house2.setOwnerName("Priya Sharma");
        house2.setVillage(village); // Link house to village

        // Open Hibernate session
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Save village and houses
        session.persist(village); // Save village first
        session.persist(house1);
        session.persist(house2);

        // Commit changes
        transaction.commit();
        System.out.println("Village and houses saved successfully!");

        // Close session
        session.close();
        sessionFactory.close();
    }
}
