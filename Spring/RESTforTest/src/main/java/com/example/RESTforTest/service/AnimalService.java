package com.example.RESTforTest.service;

import com.example.RESTforTest.entity.Animal;
import com.example.RESTforTest.repo.AnimalRepository;
import com.example.RESTforTest.util.AnimalNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void save(Animal animal){
        animalRepository.save(animal);
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal findById(Long id) {
        Optional<Animal> animal = animalRepository.findById(id);
        return animal.orElseThrow(AnimalNotFoundException::new);
    }
}
