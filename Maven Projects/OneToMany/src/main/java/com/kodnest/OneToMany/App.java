package com.kodnest.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Transaction trans = session.beginTransaction();

        Department department = new Department();
        department.setName("Development");

        Employee e1 = new Employee();
        e1.setName("Ajay");
        e1.setSalary(50000);
        e1.setDepartment(department);


        Employee e2 = new Employee();
        e2.setName("Bob");
        e2.setSalary(55000);
        e2.setDepartment(department);

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);

        department.setEmployeeList(employeeList);

        session.persist(department);

        trans.commit();
        session.close();
        factory.close();
    }
}
