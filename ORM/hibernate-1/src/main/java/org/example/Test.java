package org.example;

import org.example.entity.Item;
import org.example.entity.Passport;
import org.example.entity.Person;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Person person = session.get(Person.class, 6L);
            Passport passport = new Passport();
            passport.setPerson(person);
            passport.setPassportNumber(123456789);
            person.setPassport(passport);

            session.persist(person);

            transaction.commit();
        }
    }
}
