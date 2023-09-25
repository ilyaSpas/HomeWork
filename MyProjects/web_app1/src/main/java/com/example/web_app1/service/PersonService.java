package com.example.web_app1.service;

import com.example.web_app1.models.Event;
import com.example.web_app1.models.Person;
import com.example.web_app1.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    @Autowired
    private final PersonRepository personRepository;
    public void savePerson(Person person, Event event){
        person.setEvent(event);
        event.getPersonList().add(person);
        personRepository.save(person);
    }
}
