package com.example.Electronic_questionnaires.utils;

import com.example.Electronic_questionnaires.entity.Event;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    public static SessionFactory getSessionFactory(){
        return new Configuration().addAnnotatedClass(Event.class).buildSessionFactory();
    }
}
