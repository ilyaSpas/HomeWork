package com.example.demorest.service;

import com.example.demorest.dto.FilmDto;
import com.example.demorest.entity.Film;
import com.example.demorest.repo.FilmRepository;
import com.example.demorest.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    public Film save(FilmDto filmDto) {
        return filmRepository.save(converter.filDaoToFilm(filmDto));
    }

    public List<FilmDto> findAll(String sort, Integer page, Integer size) {
        if (sort != null){
            switch (sort){
                case ("title"):
                    return converter.ListFilmToListFilmDto(filmRepository.findAll().stream()
                            .sorted(Comparator.comparing(Film::getTitle))
                            .collect(Collectors.toList()));
            }
        }
        if (page != null && size != null){
            Page<Film> filmPage = filmRepository.findAll(PageRequest.of(page, size));
            List<FilmDto> filmsDto = converter.ListFilmToListFilmDto(filmPage.getContent());
            return filmsDto;
        }
        return converter.ListFilmToListFilmDto(filmRepository.findAll());
    }

    public FilmDto findById(Long id) {
        return converter.filmToFilmDto(filmRepository.findById(id).orElse(null));
    }

    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }


    public FilmDto updateById(Long id, Film film) {
        Film filmFromDB = filmRepository.findById(id).orElse(null);
        if (film.getTitle() != null) {
            filmFromDB.setTitle(film.getTitle());
        }
        if (film.getComments() != null) {
            filmFromDB.setComments(film.getComments());
        }
        filmRepository.save(filmFromDB);
        return converter.filmToFilmDto(filmFromDB);
    }
}
