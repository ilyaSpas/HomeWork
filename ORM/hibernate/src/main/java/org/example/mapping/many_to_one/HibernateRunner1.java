package org.example.mapping.many_to_one;

import org.example.entity.Person;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateRunner1 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Person person = new Person();
            person.setName("Ivan");

            session.save(person);

            transaction.commit();
        }
    }
}
