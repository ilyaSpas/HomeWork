package com.example.demoWebApp.service;

import com.example.demoWebApp.model.Event;
import com.example.demoWebApp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public void save(Event event){
        eventRepository.save(event);
    }
}
