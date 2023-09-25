package com.example.Electronic_questionnaires.dao.impl;

import com.example.Electronic_questionnaires.dao.EventDAO;
import com.example.Electronic_questionnaires.entity.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventDAOImpl implements EventDAO {
    private SessionFactory sessionFactory;


    public void save(Event event) {
        sessionFactory = new Configuration().addAnnotatedClass(Event.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
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
