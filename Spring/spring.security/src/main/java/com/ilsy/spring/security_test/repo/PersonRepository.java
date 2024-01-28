package com.ilsy.spring.security_test.repo;

import com.ilsy.spring.security_test.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsername(String username);
}
