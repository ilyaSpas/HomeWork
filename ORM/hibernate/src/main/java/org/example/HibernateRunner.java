package org.example;

import org.example.entity.Role;
import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.time.LocalDate;

public class HibernateRunner {

    public static void main(String[] args) {
        User user = User.builder()
                .userName("vanya5@Mail.ru")
                .firstName("IVAN")
                .lastName("IVANOV")
                .birthday(LocalDate.of(2000, 12, 10))
                .age(18)
                .role(Role.USER)
                .build();

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();



            session.persist(user);
//            session.remove(user);
//            session.update(user);
//            User user = session.get(User.class, "vanya3@Mail.ru");
//            user.setRole(Role.ADMIN);

            transaction.commit();
        }
    }
}
