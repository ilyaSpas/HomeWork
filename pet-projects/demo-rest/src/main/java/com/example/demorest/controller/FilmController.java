package com.example.demorest.controller;

import com.example.demorest.dto.FilmDto;
import com.example.demorest.entity.Film;
import com.example.demorest.service.FilmService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/film")
public class FilmController {
    private final FilmService filmService;

    private final ModelMapper modelMapper;

    @Autowired
    public FilmController(FilmService filmService, ModelMapper modelMapper) {
        this.filmService = filmService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<List<FilmDto>> getFilms() {
        List<FilmDto> filmDtoList = filmService.findAll().stream()
                .map(this::convertToFilmDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(filmDtoList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createFilm(@RequestBody FilmDto filmDto) {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmDto> getFilm(@PathVariable("id") Long id) {
        return new ResponseEntity<>(convertToFilmDto(filmService.findById(id)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FilmDto> updateFilm(@PathVariable("id") Long id,
                                                 @RequestBody FilmDto filmDto) {
        filmService.updateById(id, convertToFilm(filmDto));
        return new ResponseEntity<>(filmDto, HttpStatus.OK);
    }

    public Film convertToFilm(FilmDto filmDto) {
        return modelMapper.map(filmDto, Film.class);
    }

    public FilmDto convertToFilmDto(Film film) {
        return modelMapper.map(film, FilmDto.class);
    }
}
