package com.ilsy.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Класс контроллер
 * @author Spass
 */
@Controller
public class MainController {
    /**
     * Индекс
     * @return шаблон индекса
     */
    @GetMapping("/")
    public String index(){
        return "main/mainPage";
    }

    @GetMapping("/db")
    public String db(){
        return "db/test2";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
