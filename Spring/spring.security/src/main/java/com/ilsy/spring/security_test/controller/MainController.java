package com.ilsy.spring.security_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Класс контроллер
 *
 * @author Spass
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "main/mainPage";
    }
}
