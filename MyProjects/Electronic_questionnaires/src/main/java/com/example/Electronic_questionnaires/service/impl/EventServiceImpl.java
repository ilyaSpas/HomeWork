package com.example.Electronic_questionnaires.service.impl;

import com.example.Electronic_questionnaires.dao.EventDAO;
import com.example.Electronic_questionnaires.dao.impl.EventDAOImpl;
import com.example.Electronic_questionnaires.entity.Event;
import com.example.Electronic_questionnaires.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventServiceImpl implements EventService {

    private EventDAO eventDAO = new EventDAOImpl();

    @Override
    public void save(Event event) {
        eventDAO.save(event);
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
