package org.example.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class MainController {

    @GetMapping("/new")
    public String createNewEvent(){
        return "NEW EVENT";
    }
}
