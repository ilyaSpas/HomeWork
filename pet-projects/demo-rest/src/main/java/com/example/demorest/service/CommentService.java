package com.example.demorest.service;

import com.example.demorest.dto.CommentDto;
import com.example.demorest.entity.Comment;
import com.example.demorest.repo.CommentRepository;
import com.example.demorest.repo.FilmRepository;
import com.example.demorest.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CommentService {
    public final CommentRepository commentRepository;
    public final FilmRepository filmRepository;
    private final Converter converter;

    @Autowired
    public CommentService(CommentRepository commentRepository, FilmRepository filmRepository, Converter converter) {
        this.commentRepository = commentRepository;
        this.filmRepository = filmRepository;
        this.converter = converter;
    }

    public void save(CommentDto commentDto, Long id) {
        Comment comment = converter.commentDtoToComment(commentDto);
        comment.setFilm(filmRepository.findById(id).orElse(null));
        commentRepository.save(comment);
    }

    public List<CommentDto> findAll() {
        return converter.listCommentToCommentFilmDto(commentRepository.findAll());
    }
}
