package com.example.demorest.util;

import com.example.demorest.dto.CommentDto;
import com.example.demorest.dto.FilmDto;
import com.example.demorest.entity.Comment;
import com.example.demorest.entity.Film;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {
    private final ModelMapper modelMapper;

    @Autowired
    public Converter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Film filDaoToFilm(FilmDto filmDto) {
        return modelMapper.map(filmDto, Film.class);
    }

    public FilmDto filmToFilmDto(Film film) {
        return modelMapper.map(film, FilmDto.class);
    }

    public List<FilmDto> ListFilmToListFilmDto(List<Film> films){
        return films.stream()
                .map(filmDto -> filmToFilmDto(filmDto))
                .collect(Collectors.toList());
    }

    public Comment commentDtoToComment(CommentDto commentDto) {
        return modelMapper.map(commentDto, Comment.class);
    }

    public CommentDto commentToCommentDto(Comment comment) {
        return modelMapper.map(comment, CommentDto.class);
    }

    public List<CommentDto> listCommentToCommentFilmDto(List<Comment> comments){
        return comments.stream()
                .map(commentDto -> commentToCommentDto(commentDto))
                .collect(Collectors.toList());
    }
}
