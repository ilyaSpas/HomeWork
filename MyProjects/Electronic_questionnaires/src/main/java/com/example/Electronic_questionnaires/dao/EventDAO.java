package com.example.Electronic_questionnaires.dao;

import com.example.Electronic_questionnaires.entity.Event;

import java.util.List;

public interface EventDAO {
    void save(Event event);
    void update(Event event);
    void delete(Event event);
    Event get(Long id);
    List<Event> findAll();
}
