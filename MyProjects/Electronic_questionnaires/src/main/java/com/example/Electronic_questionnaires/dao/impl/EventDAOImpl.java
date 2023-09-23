package com.example.Electronic_questionnaires.dao.impl;

import com.example.Electronic_questionnaires.dao.EventDAO;
import com.example.Electronic_questionnaires.entity.Event;
import com.example.Electronic_questionnaires.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventDAOImpl implements EventDAO {

    @Override
    public void save(Event event) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Event.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try(sessionFactory) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            session.save(event);

            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Event event) {

    }

    @Override
    public void delete(Event event) {

    }

    @Override
    public Event get(Long id) {
        return null;
    }

    @Override
    public List<Event> findAll() {
        return null;
    }
}
