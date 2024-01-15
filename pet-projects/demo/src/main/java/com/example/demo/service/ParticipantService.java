package com.example.demo.service;

import com.example.demo.model.Event;
import com.example.demo.model.Participant;
import com.example.demo.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
    @Autowired
    private ParticipantRepository participantRepository;

    @Autowired
    private EventService eventService;

    public void save(Participant participant, Long eventId){
        Event event = eventService.findById(eventId).get();
        participant.setEvent(event);
        participantRepository.save(participant);
    }
}
