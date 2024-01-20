package com.example.RESTforTest.repo;

import com.example.RESTforTest.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
