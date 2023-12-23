package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.Cat;
import org.example.entity.Role;
import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

@Slf4j
public class HibernateRunner2 {

    public static void main(String[] args) {

        User user = User.builder()
                .userName("vanya7@Mail.ru")
                .firstName("IVAN")
                .lastName("IVANOV")
                .birthday(LocalDate.of(2000, 12, 10))
                .age(18)
                .role(Role.USER)
                .build();

        log.info("User entity is in transient state, object: {}", user);

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            log.trace("Transaction is created, {}", transaction);
            session.persist(user);
            log.warn("User is in persistent state {}", session);

            transaction.commit();
        } catch (Exception e) {
            log.error("Exception ERROR - {}", e);
            throw e;
        }
    }
}
