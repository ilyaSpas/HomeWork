package com.example.demorest.service;

import com.example.demorest.entity.Film;
import com.example.demorest.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Film save(Film film){
        return filmRepository.save(film);
    }

    public List<Film> findAll() {
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
        filmFromDB.setTitle(film.getTitle());
        filmFromDB.setActors(film.getActors());
        return filmRepository.save(filmFromDB);
    }
}
