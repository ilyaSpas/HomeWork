package com.ilsy.spring.project.util;

import com.ilsy.spring.project.dto.PersonDto;
import com.ilsy.spring.project.entity.Person;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Converter {
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public Converter(ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public Person DtoToPerson(PersonDto personDto){
        Person person = modelMapper.map(personDto, Person.class);
        person.setPassword(passwordEncoder.encode(personDto.getPassword()));
        person.setBirthday(LocalDate.parse(personDto.getBirthday()));
        return person;
    }
}
