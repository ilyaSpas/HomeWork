package com.example.Electronic_questionnaires.dao.impl;

import com.example.Electronic_questionnaires.dao.EventDAO;
import com.example.Electronic_questionnaires.entity.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class EventDAOImpl implements EventDAO {


    public void save(Event event) {

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
