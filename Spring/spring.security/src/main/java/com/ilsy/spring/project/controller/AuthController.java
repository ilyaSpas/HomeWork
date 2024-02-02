package com.ilsy.spring.project.controller;

import com.ilsy.spring.project.entity.Person;
import com.ilsy.spring.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

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
    public String registration(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            System.out.println("Есть ошибка");
            return "/auth/registryPage";
        }
        System.out.println("Ошибок - нет");
        personService.createPerson(person);
        return "redirect:/auth/login";
    }


}
