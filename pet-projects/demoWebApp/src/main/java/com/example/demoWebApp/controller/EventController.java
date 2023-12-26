package com.example.demoWebApp.controller;

import com.example.demoWebApp.model.Event;
import com.example.demoWebApp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public String allEvents() {
        return "event/events";
    }

    @PostMapping
    public String saveEvent() {
        eventService.save(Event.builder()
                .town("Azov")
                .build());
        return "redirect:/";
    }

    @GetMapping("/new")
    public String createEvent() {
        return "event/new_event";
    }
}
