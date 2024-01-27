package com.example.demorest.service;

import com.example.demorest.dto.FilmDto;
import com.example.demorest.entity.Film;
import com.example.demorest.repo.FilmRepository;
import com.example.demorest.util.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmService {
    private final FilmRepository filmRepository;
    private final Converter converter;


    @Autowired
    public FilmService(FilmRepository filmRepository, Converter converter) {
        this.filmRepository = filmRepository;
        this.converter = converter;
    }

    public Film save(Film film) {
        return filmRepository.save(film);
    }

    public List<Film> findAll(String sort) {
        if (sort != null){
            switch (sort){
                case ("title"):
                    return filmRepository.findAll().stream()
                            .sorted(Comparator.comparing(Film::getTitle))
                            .collect(Collectors.toList());
            }
        }
        return filmRepository.findAll();
    }

    public Film findById(Long id) {
        return filmRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }

    public Film updateById(Long id, Film film) {
        Film filmFromDB = filmRepository.findById(id).orElse(null);
        if (film.getTitle() != null) {
            filmFromDB.setTitle(film.getTitle());
        }
        if (film.getComments() != null) {
            filmFromDB.setComments(film.getComments());
        }
        return filmRepository.save(filmFromDB);
    }
}
