package org.example.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class FirstController {
    @GetMapping("/greet")
    public String getGreet(){
        return "Hello world!";
    }
}
