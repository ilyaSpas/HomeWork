package ru.ilsy.hibernate.util;

import org.hibernate.cfg.Configuration;
import ru.ilsy.hibernate.entity.*;

public class SessionFactoryUtil {
    private final org.hibernate.SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .addAnnotatedClass(Details.class)
            .addAnnotatedClass(Department.class)
            .addAnnotatedClass(Child.class)
            .addAnnotatedClass(Section.class)
            .buildSessionFactory();

    public org.hibernate.SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
