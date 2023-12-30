package com.example.mailsender.controller;

import com.example.mailsender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String test(){
        return "/main";
    }

    @PostMapping("/test")
    public String send(@RequestParam("to") String to,
                       @RequestParam("sub") String sub,
                       @RequestParam("text") String text,
                       Model model) {
        System.out.printf("""
                TO: %s
                SUB: %s
                TEXT: %s
                """, to, sub, text);
        emailService.sendSimpleMessage(to, sub, text);
        model.addAttribute("message", "Ваше письмо отправленно!");
        return "/main";
    }
}
