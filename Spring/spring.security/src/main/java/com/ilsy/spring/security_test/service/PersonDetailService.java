package com.ilsy.spring.security_test.service;

import com.ilsy.spring.security_test.entity.Person;
import com.ilsy.spring.security_test.repo.PersonRepository;
import com.ilsy.spring.security_test.security.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonDetailService implements UserDetailsService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonDetailService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = personRepository.findByUsername(username);
        if (person.isEmpty()){
            throw new UsernameNotFoundException("Username not found!");
        }
        return new PersonDetails(person.get());
    }
}
