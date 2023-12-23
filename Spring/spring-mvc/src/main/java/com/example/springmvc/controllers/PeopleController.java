package com.example.springmvc.controllers;

import com.example.springmvc.dao.PersonDao;
import com.example.springmvc.model.Person;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDao personDao;

    @Autowired
    public PeopleController(PersonDao personDao) {
        this.personDao = personDao;
    }


    @GetMapping
    public String index(Model model) {
        model.addAttribute("people", personDao.index());
        return "main/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", personDao.show(id));
        return "main/show";
    }

//    @GetMapping("/new")
//    public String add(Model model, Person person) {
//        model.addAttribute(person);
//        return "main/add";
//    }

    @GetMapping("/new")
    public String add(@ModelAttribute("person") Person person) {
        return "main/add";
    }

    @PostMapping
    public String addNewPerson(@ModelAttribute("person") @Valid Person person,
                               BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            personDao.save(person);
            return "redirect:/people";
        }
        return "main/add";
    }

    @PostMapping("/{id}/delete")
    public String deletePerson(@PathVariable("id") int id){
        personDao.delete(id);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String editPerson(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", personDao.show(id));
        return "main/edit";
    }

    @PostMapping("/{id}")
    public String update(@ModelAttribute("person") @Valid Person person,
                         BindingResult bindingResult, @PathVariable int id) {
        if (!bindingResult.hasErrors()){
            personDao.update(id, person);
            return "redirect:/people";
        }
        return "main/edit";
    }

    @ModelAttribute("welcomeMessage")
    public String headerMessage(){
        return "HELLO WORLD!";
    }

}
