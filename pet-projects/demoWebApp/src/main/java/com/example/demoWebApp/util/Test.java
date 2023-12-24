package com.example.demoWebApp.util;

import com.example.demoWebApp.model.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.checkHibernate();
        test.checkHibernate();
        test.checkHibernate();
    }

    public void checkHibernate() {
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();

                Event event = Event.builder()
                        .town("Moscow")
                        .hotel("AMAX")
                        .hotelAddress("Lenina street 54")
                        .conferenceHall("Big hall")
                        .date("12.12.24")
                        .build();

                session.persist(event);

                transaction.commit();
            }
        }
    }
}
