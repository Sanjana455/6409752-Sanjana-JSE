package com.example.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
        session.save(new Student("Harshitha"));
        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
