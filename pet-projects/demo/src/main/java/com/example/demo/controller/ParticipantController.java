package com.example.demo.controller;

import com.example.demo.model.Participant;
import com.example.demo.model.Position;
import com.example.demo.service.EventService;
import com.example.demo.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping("/event")
public class ParticipantController {
    @Autowired
    private ParticipantService participantService;

    @Autowired
    private EventService eventService;

    @GetMapping("/{id}/registration")
    public String registrationForm(@ModelAttribute("participant") Participant participant,
                                   @PathVariable("id") Long id, Model model) {
        model.addAttribute("participants", eventService.findById(id).get().getParticipants());
        model.addAttribute("positions", Arrays.asList(Position.values()));
        return "person/registrationPage";
    }

    @PostMapping("/{event_id}/registration")
    public String registration(@ModelAttribute("participant") Participant participant,
                               @PathVariable("event_id") Long eventId){
        participantService.save(participant, eventId);
        return "redirect:/";
    }
}
