package org.example.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MainController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @Value("${tempVar}")
    private String tmp;

    @GetMapping("/id")
    public String getId(){
        return id + " " + tmp;
    }
}
