package org.example;

import org.example.entity.Role;
import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class HibernateRunner1 {
    public static void main(String[] args) {
        User user = User.builder()
                .userName("vanya5@Mail.ru")
                .firstName("IVAN")
                .lastName("IVANOV")
                .birthday(LocalDate.of(2000, 12, 10))
                .age(18)
                .role(Role.USER)
                .build();

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {

            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                user.setFirstName("Sveta");
                //Обновляет значения для обекта из db
                session.refresh(user);
                transaction.commit();
                System.out.println(user);
            }

            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                user.setFirstName("Sveta");
                //Обновляет значения для db по объекту
                session.merge(user);
                transaction.commit();
            }
        }

    }
}

