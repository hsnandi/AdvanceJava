package com.Hibernate.com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // For Hibernate configuration
        Configuration config = new Configuration();
        
        // Load configuration from hibernate.cfg.xml
        config.configure("hibernate.cfg.xml");

        // Register entity classes
        config.addAnnotatedClass(Student.class);
        config.addAnnotatedClass(Address.class);

        // Create session factory
        SessionFactory sFactory = config.buildSessionFactory();
        
        // Open session from session factory
        Session session = sFactory.openSession();
        
        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Create an Address object
        Address address = new Address(1, "Thane", "Palava, Gate no.4");

        // Create a Student object with associated Address
        Student student = new Student(1, "Harish");

        // Save the Address object
        session.save(address);

        // Save the Student object 
        session.save(student);

        // Commit transaction
        transaction.commit();
        
        // Close session
        session.close();
        
        // Close session factory
        sFactory.close();
    }
}
