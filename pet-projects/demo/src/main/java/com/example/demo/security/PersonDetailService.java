package com.example.demo.security;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        Optional<Person> person = personRepository.findByEmail(username);
        return new PersonDetails(person.get());
    }
}
