package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.Dog;
import org.example.entity.DogInfo;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Slf4j
public class HibernateRunner3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Бобик3");
        dog.setDogInfo(new DogInfo(10, 10, "10"));

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            session.persist(dog);
            log.warn("___СОЗДАН ОБЪЕКТ {}___", dog);

            transaction.commit();
        }
    }
}
