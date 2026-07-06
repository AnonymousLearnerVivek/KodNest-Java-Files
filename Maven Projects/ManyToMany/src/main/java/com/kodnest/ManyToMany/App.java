package com.kodnest.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Transaction trans = session.beginTransaction();

        Course c1 = new Course();
        c1.setName("Java");

        Course c2 = new Course();
        c2.setName("Python");

        Student s1 = new Student();
        s1.setName("John");
        Student s2 = new Student();
        s2.setName("Sam");

        List<Course> alc = new ArrayList<Course>();
        alc.add(c1);
        alc.add(c2);

        List<Student> als = new ArrayList<Student>();
        als.add(s1);
        als.add(s2);

        c1.setStudents(als);
        c2.setStudents(als);

        s1.setCourses(alc);
        s2.setCourses(alc);

        session.persist(s1);
        session.persist(s2);
        session.persist(c1);
        session.persist(c2);
        System.out.println("Courses saved");

        trans.commit();
        session.close();
        factory.close();
    }
}
