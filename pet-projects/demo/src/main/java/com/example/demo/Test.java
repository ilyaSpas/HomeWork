package com.example.demo;

import com.example.demo.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Test {
    @Autowired
    private Test2 test2;

    @GetMapping("/rest")
    public String sayHello(){
        return test2.foo();
    }
}
