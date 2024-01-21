package com.example.demorest.service;

import com.example.demorest.entity.Comment;
import com.example.demorest.repo.CommentRepository;
import com.example.demorest.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    public final CommentRepository commentRepository;
    private final FilmService filmService;

    @Autowired
    public CommentService(CommentRepository commentRepository, FilmService filmService) {
        this.commentRepository = commentRepository;
        this.filmService = filmService;
    }

    public void save(Comment comment, Long id) {
        comment.setFilm(filmService.findById(id));
        commentRepository.save(comment);
    }
}
