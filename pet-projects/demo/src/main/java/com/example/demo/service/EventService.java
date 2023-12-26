package com.example.demo.service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void save(Event event) {
        eventRepository.save(event);
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public void delete(Long id) {
        eventRepository.deleteById(id);
    }

    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    public void update(Event event) {
        Event eventFromDB = eventRepository.findById(event.getId()).orElseThrow();
        eventFromDB.setTown(event.getTown());
        eventFromDB.setDate(event.getDate());
        eventFromDB.setHotel(event.getHotel());
        eventFromDB.setHotelAddress(event.getHotelAddress());
        eventFromDB.setConferenceHall(event.getConferenceHall());
        eventFromDB.setHotelImageUrl(event.getHotelImageUrl());
        eventRepository.save(eventFromDB);
    }
}
