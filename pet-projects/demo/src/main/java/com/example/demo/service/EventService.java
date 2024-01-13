package com.example.demo.service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void save(Event event) {
        if (event.getHotelImageUrl().isEmpty()){
            event.setHotelImageUrl("https://images.divisare.com/images/c_limit,f_auto,h_2000,q_auto,w_3000/" +
                                   "v1490958815/kkofaeofhmpw57956lq6/morris-adjmi-architects-mark-mahaney-matthew-williams-" +
                                   "jimi-billingsley-wythe-hotel.jpg");
        }
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

    public List<Event> findByTown(String town){
        return eventRepository.findByTown(town);
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

    public Page<Event> findWithPagination(Integer page ,Integer bookPerPage) {
        return  eventRepository.findAll(PageRequest.of(page, bookPerPage));
    }
}
