package com.kodnest.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
// Saving or Inserting Data Using Hibernate and session.persist()
public class App {
    public static void main(String[] args) {

        try {
            // Loading the configuration
            Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");

            // Create a session factory
            SessionFactory factory = config.buildSessionFactory();

            // Open a Session
            Session session = factory.openSession();

            // Begin a Transaction
            Transaction trans = session.beginTransaction(); // The beginTransaction() method starts a transaction

            Student s = new Student();
            s.setId(106);
            s.setName("Anjali");
            s.setAge(24);
            s.setEmailid("anjali@gmail.com");
            s.setGender("Female");

            // Operation
//            session.save(s); // .save(Object) method is deprecated since version 6.0, use persist(Object)
            session.persist(s);

            // Commit the transaction
            trans.commit(); // commit() finalizes all changes made during the transaction.

            // close the session
            session.close();

            // Close the session Factory
            factory.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
# Common Interview Questions and Answers:
    Q1. What is the primary purpose of the hibernate.cfg.xml file in Hibernate?
     A: 1. To configure Hibernate and database connection details.
        2. The hibernate.cfg.xml file specifies the database connection settings, Hibernate dialect,
           and the mapping of entity classes.

    Q2. What is the role of the SessionFactory in Hibernate?
     A: 1. To create and manage sessions for interacting with the database
        2. The SessionFactory is responsible for creating sessions, which are used to perform CRUD operations
           and manage database interactions.

    Q3. Why is it important to begin a transaction before performing database operations in Hibernate?
     A: 1. To ensure all operations succeed together or roll back if any operation fails
        2. Transactions in Hibernate guarantee that a group of operations is executed as a single atomic unit,
           ensuring data consistency in case of failures.
 */
