package com.example.demoWebApp.controller;

import com.example.demoWebApp.util.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class EventController {

    @GetMapping
    public String allEvents() {
        return "event/events";
    }

    @PostMapping
    public String saveEvent() {
        Test test = new Test();
        test.checkHibernate();
        return "redirect:/event";
    }

    @GetMapping("/new")
    public String createEvent() {
        return "event/new_event";
    }
}
