package com.example.demo.service;

import com.example.demo.model.Person;

import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void createPerson(Person person){
        personRepository.save(person);
    }
}
