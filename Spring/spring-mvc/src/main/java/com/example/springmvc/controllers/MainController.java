package com.example.springmvc.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/example")
public class MainController {

//    @GetMapping("/")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String mainPage(HttpServletRequest request, Model model){
        String s = request.getParameter("word");
        model.addAttribute("text", s);
        System.out.println(s);
        return "main/main";
    }

    @PostMapping("/example")
    public String test(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        return "main/main";
    }
}
