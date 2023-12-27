package com.example.demo.controller;

import com.example.demo.model.Event;
import com.example.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.IntStream;


@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public String allEvents(Model model,
                            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                            @RequestParam(value = "event_per_page", required = false, defaultValue = "3") Integer bookPerPage) {
        Page<Event> events = eventService.findWithPagination(page, bookPerPage);
        model.addAttribute("events", events);
        model.addAttribute("numbers", IntStream.range(0, events.getTotalPages()).toArray());
        return "event/eventsPage";
    }

    @GetMapping("/search")
    public String search(@Param("name") String town, Model model) {
        model.addAttribute("find_events", eventService.findByTown(town));
        return "event/eventsPage";
    }

    @PostMapping
    public String createEvent(@ModelAttribute("event") Event event){
        eventService.save(event);
        return "redirect:/event";
    }

    @GetMapping("/{id}")
    public String showEvent(@PathVariable("id") Long id,
                            @ModelAttribute("event") Event event,
                            Model model) {
        model.addAttribute("event", eventService.findById(id));
        return "event/showEvent";
    }

    @GetMapping("/new")
    public String newEvent(@ModelAttribute("event") Event event){
        return "event/newEventPage";
    }

    @GetMapping("/{id}/edit")
    public String editEvent(@ModelAttribute("event") Event event,
                            @PathVariable("id") Long id,
                            Model model){
        model.addAttribute("event", eventService.findById(id));
        return "event/editEventPage";
    }

    @PostMapping("/{id}/update")
    public String updateEvent(@ModelAttribute("id") Long id,
                              @ModelAttribute("event") Event event){
        eventService.update(event);
        return "redirect:/event/{id}";
    }

    @PostMapping("/{id}/delete")
    public String deleteEvent(@PathVariable("id") Long id) {
        eventService.delete(id);
        return "redirect:/event";
    }
}
