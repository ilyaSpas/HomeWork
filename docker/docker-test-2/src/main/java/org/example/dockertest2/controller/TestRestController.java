package org.example.dockertest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {
    @GetMapping("/greet")
    public String getGreeting(){
        return "Hello world!!!";
    }
}
