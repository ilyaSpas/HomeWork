package com.example.web_app1.controllers;

import com.example.web_app1.models.Event;
import com.example.web_app1.models.Person;
import com.example.web_app1.service.EventService;
import com.example.web_app1.service.PersonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class EventPageController {
    @Autowired
    private final EventService eventService;
    @Autowired
    private final PersonService personService;
    @GetMapping("/create-event")
    public String mainPage() {
        return "newEventPageView";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute Event event) {
        eventService.addEvent(event);
        return "mainPageView";
    }

    @GetMapping("/all-events")
    public String allEventsPage(Model model) {
        model.addAttribute("events", eventService.findAll());
        return "allEventsPageView";
    }

    @GetMapping("/event/{id}")
    public String bookDetails(@PathVariable(value = "id") long id, Model model) {
        Event event = eventService.findByID(id);
        model.addAttribute("event", event);
        return "registrationPageView";
    }

    @GetMapping("/event/{id}/qr")
    public String getQrCode(@PathVariable(value = "id") long id, Model model) {
        Event event = eventService.findByID(id);
        model.addAttribute("event", event);
        return "eventQrCodePageView";
    }

    @PostMapping("/event/{id}/registration")
    public String registration(@PathVariable(value = "id") long id,
                               @ModelAttribute Person person,
                               Model model) {
        Event event = eventService.findByID(id);
        model.addAttribute("event", event);
        personService.savePerson(person, event);
        return "redirect:/";
    }

    @GetMapping("/event/{id}/report")
    public String eventReport(@PathVariable(value = "id") long id, Model model) {
        Event event = eventService.findByID(id);
        model.addAttribute("persons", event.getPersonList());
        return "reportEventPageView";
    }
}
