package com.example.Electronic_questionnaires.dao.impl;

import com.example.Electronic_questionnaires.dao.EventDAO;
import com.example.Electronic_questionnaires.entity.Event;
import com.example.Electronic_questionnaires.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;

import java.util.List;

public class EventDAOImpl implements EventDAO {

    public void save(Event event) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        try (session) {
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
