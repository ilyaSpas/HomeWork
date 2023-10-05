package com.example.web_app1.service;

import com.example.web_app1.models.Event;
import com.example.web_app1.repo.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepository eventRepository;
    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void addEvent(Event event){
        eventRepository.save(event);
    }

    public Iterable<Event> findAll() {
        Iterable<Event> books = eventRepository.findAll();
        return books;
    }

    public Event findByID(long id) {
        Event event = eventRepository.findById(id).orElseThrow();
        return event;
    }
}
