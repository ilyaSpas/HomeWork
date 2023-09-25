package com.example.web_app1.service;

import com.example.web_app1.models.Event;
import com.example.web_app1.repo.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {
    @Autowired
    private final EventRepository eventRepository;
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
