package com.example.demorest.controller;

import com.example.demorest.dto.FilmDto;
import com.example.demorest.service.FilmService;
import com.example.demorest.util.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/films")
public class FilmController {
    private final FilmService filmService;
    private final Converter converter;

    @Autowired
    public FilmController(FilmService filmService, Converter converter) {
        this.filmService = filmService;
        this.converter = converter;
    }

    //DONE
    @GetMapping
    public ResponseEntity<List<FilmDto>> getFilms(@RequestParam(value = "sort", required = false) String sort) {
        return new ResponseEntity<>(filmService.findAll(sort), HttpStatus.OK);
    }

    //DONE
    @PostMapping
    public ResponseEntity<HttpStatus> createFilm(@RequestBody FilmDto filmDto) {
        filmService.save(filmDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    //DONE
    @GetMapping("/{id}")
    public ResponseEntity<FilmDto> getFilm(@PathVariable("id") Long id) {
        return new ResponseEntity<>(filmService.findById(id), HttpStatus.OK);
    }

    //DONE
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    //TODO
    @PutMapping("/{id}")
    public ResponseEntity<FilmDto> updateFilm(@PathVariable("id") Long id,
                                                 @RequestBody FilmDto filmDto) {
        filmService.updateById(id, converter.filDaoToFilm(filmDto));
        return new ResponseEntity<>(filmDto, HttpStatus.OK);
    }
}
