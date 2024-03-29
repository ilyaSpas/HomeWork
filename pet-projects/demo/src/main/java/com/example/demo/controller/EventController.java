package com.example.demo.controller;

import com.example.demo.model.Event;
import com.example.demo.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.stream.IntStream;


@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    //DONE!
    @GetMapping
    public String allEvents(Model model,
                            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                            @RequestParam(value = "event_per_page", required = false, defaultValue = "3") Integer bookPerPage) {
        Page<Event> events = eventService.findWithPagination(page, bookPerPage);
        model.addAttribute("events", events);
        model.addAttribute("numbers", IntStream.range(0, events.getTotalPages()).toArray());
        return "event/eventsPage";
    }

    //DONE!
    @GetMapping("/search")
    public String search(@Param("name") String town, Model model) {
        model.addAttribute("find_events", eventService.findByTown(town));
        return "event/eventsPage";
    }

    //DONE!
    @PostMapping
    public String createEvent(@ModelAttribute("event") @Valid Event event, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "event/newEventPage";
        }
        eventService.save(event);
        return "redirect:/event";
    }

    //DONE!
    @GetMapping("/{id}")
    public String showEvent(@PathVariable("id") Long id,
                            @ModelAttribute("event") Event event,
                            Model model) {
        model.addAttribute("event", eventService.findById(id));
        return "event/showEvent";
    }

    //DONE!
    @GetMapping("/new")
    public String newEvent(@ModelAttribute("event") Event event) {
        return "event/newEventPage";
    }

    //DONE!
    @GetMapping("/{id}/edit")
    public String editEvent(@ModelAttribute("event") Event event,
                            @PathVariable("id") Long id,
                            Model model) {
        model.addAttribute("event", eventService.findById(id));
        return "event/editEventPage";
    }

    //DONE!
    @PostMapping("/{id}/update")
    public String updateEvent(@ModelAttribute("id") Long id,
                              @ModelAttribute("event") @Valid Event event, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "redirect:/event/{id}";
        }
        eventService.update(event);
        return "redirect:/event/{id}";
    }

    //DONE!
    @PostMapping("/{id}/delete")
    public String deleteEvent(@PathVariable("id") Long id) {
        eventService.delete(id);
        return "redirect:/event";
    }
}
