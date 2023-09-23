package com.example.Electronic_questionnaires.service;

import com.example.Electronic_questionnaires.entity.Event;

import java.util.List;

public interface EventService {
    void save(Event event);
    void update(Event event);
    void delete(Event event);
    Event get(Long id);
    List<Event> findAll();
}
