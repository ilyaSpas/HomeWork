package com.example.Electronic_questionnaires.controllers;

import com.example.Electronic_questionnaires.entity.Event;
import com.example.Electronic_questionnaires.service.EventService;
import com.example.Electronic_questionnaires.service.impl.EventServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventController {

    private final EventService eventService = new EventServiceImpl();

    @GetMapping("/create-event")
    public String createEventPage() {
        return "createEventPageView";
    }
    @PostMapping("/create-event-new")
    public String createEvent(@ModelAttribute Event event) {
        eventService.save(event);
        return "redirect:/";
    }

    @GetMapping("/events")
    public String EventsPage() {
        return "eventsPageView";
    }
}
