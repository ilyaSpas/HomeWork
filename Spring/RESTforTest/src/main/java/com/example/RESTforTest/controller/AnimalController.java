package com.example.RESTforTest.controller;

import com.example.RESTforTest.entity.Animal;
import com.example.RESTforTest.service.AnimalService;
import com.example.RESTforTest.util.AnimalErrorResponse;
import com.example.RESTforTest.util.AnimalNotCreatException;
import com.example.RESTforTest.util.AnimalNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAnimals(){
        return animalService.findAll();
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable("id") Long id){
        return animalService.findById(id);
    }

    @ExceptionHandler
    private ResponseEntity<AnimalErrorResponse> handleException(AnimalNotFoundException e){
        AnimalErrorResponse animalErrorResponse = new AnimalErrorResponse(
                "Animal not found",
                LocalDateTime.now());
        return new ResponseEntity<>(animalErrorResponse, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody @Valid Animal animal, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            StringBuilder errorMsg = new StringBuilder();
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors){
                errorMsg.append(error.getField() + " - " + error.getDefaultMessage() + ";");
            }
            throw new AnimalNotCreatException(errorMsg.toString());
        }
        animalService.save(animal);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @ExceptionHandler
    private ResponseEntity<AnimalErrorResponse> handleException(AnimalNotCreatException e){
        AnimalErrorResponse animalErrorResponse = new AnimalErrorResponse(
                e.getMessage(),
                LocalDateTime.now());
        return new ResponseEntity<>(animalErrorResponse, HttpStatus.BAD_REQUEST);
    }


//    @GetMapping("/add")
//    public void addAnimals(){
//        Animal animal = new Animal();
//        animal.setName("Vasya");
//        animal.setType("Cat");
//        animalService.save(animal);
//    }
}
