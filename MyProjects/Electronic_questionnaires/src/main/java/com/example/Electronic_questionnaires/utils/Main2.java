package com.example.Electronic_questionnaires.utils;

import com.example.Electronic_questionnaires.entity.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Event.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Event event = new Event("ds","dsa");
            session.save(event);


            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
