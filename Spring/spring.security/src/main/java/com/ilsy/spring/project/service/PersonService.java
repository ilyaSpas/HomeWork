package com.ilsy.spring.project.service;

import com.ilsy.spring.project.dto.PersonDto;
import com.ilsy.spring.project.entity.Person;
import com.ilsy.spring.project.repo.PersonRepository;
import com.ilsy.spring.project.util.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final Converter converter;

    @Autowired
    public PersonService(PersonRepository personRepository, Converter converter) {
        this.converter = converter;
        this.personRepository = personRepository;
    }

    public void createPerson(PersonDto personDto){
        personRepository.save(converter.DtoToPerson(personDto));
    }


}
