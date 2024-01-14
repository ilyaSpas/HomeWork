package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class PersonController {
    @GetMapping("/{id}/registration")
    public String registrationNewPerson(@PathVariable("id") Long id) {
        return "person/registrationPage";
    }
}
