package org.example.restdemoproject1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {
    @GetMapping("/get")
    public String check(){
        return "Hello world!!!";
    }
}
