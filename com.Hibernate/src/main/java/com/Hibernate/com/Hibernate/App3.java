package com.Hibernate.com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {
    public static void main(String[] args) {
        // Create a Configuration object and load configuration from hibernate.cfg.xml
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Create a SessionFactory
        SessionFactory factory = config.buildSessionFactory();
        
        // Open a session
        Session session = factory.openSession();
        
        // Begin a transaction
        Transaction transaction = session.beginTransaction();
        
        

        // Commit the transaction
        transaction.commit();
        
        // Close the session
        session.close();

        // Close the SessionFactory when done
        factory.close();
    }
}
