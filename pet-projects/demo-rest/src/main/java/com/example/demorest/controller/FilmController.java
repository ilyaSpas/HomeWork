package com.example.demorest.controller;

import com.example.demorest.dto.FilmDto;
import com.example.demorest.entity.Film;
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

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public ResponseEntity<List<FilmDto>> getFilms(@RequestParam(value = "sort", required = false) String sort,
                                                  @RequestParam(value = "page", required = false) Integer page,
                                                  @RequestParam(value = "size", required = false) Integer size) {
        return new ResponseEntity<>(filmService.findAll(sort, page, size), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createFilm(@RequestBody FilmDto filmDto) {
        filmService.save(filmDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmDto> getFilm(@PathVariable("id") Long id) {
        return new ResponseEntity<>(filmService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FilmDto> updateFilm(@PathVariable("id") Long id,
                                              @RequestBody Film film) {
        return new ResponseEntity<>(filmService.updateById(id, film), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
