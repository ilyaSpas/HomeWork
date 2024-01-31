package com.ilsy.spring.project.controller;

import com.ilsy.spring.project.dto.PersonDto;
import com.ilsy.spring.project.entity.Person;
import com.ilsy.spring.project.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final PersonService personService;

    @Autowired
    public AuthController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/login")
    public String authorizationPage() {
        return "auth/loginPage";
    }

    @GetMapping("/registry")
    public String registryPage(@ModelAttribute("person") Person person) {
        return "auth/registryPage";
    }

    @PostMapping("/registry")
    public String registration(@ModelAttribute("person") PersonDto personDto) {
        personService.createPerson(personDto);
        return "redirect:/";
    }


}
