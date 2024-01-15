package com.example.demo;

import com.example.demo.model.Position;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Test {
    @GetMapping("/rest")
    public String sayHello(){
        return "Hello world!";
    }
}
