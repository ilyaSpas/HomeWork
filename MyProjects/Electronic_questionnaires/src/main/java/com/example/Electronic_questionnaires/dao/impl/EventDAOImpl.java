package com.example.Electronic_questionnaires.dao.impl;

import com.example.Electronic_questionnaires.dao.EventDAO;
import com.example.Electronic_questionnaires.entity.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EventDAOImpl implements EventDAO {

    private Session session;

    public void save(Event event) {
        Configuration configuration = new Configuration().addAnnotatedClass(Event.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        this.session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(event);
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
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
