package com.example.demorest.service;

import com.example.demorest.entity.Comment;
import com.example.demorest.repo.CommentRepository;
import com.example.demorest.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CommentService {
    public final CommentRepository commentRepository;
    public final FilmRepository filmRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository, FilmRepository filmRepository) {
        this.commentRepository = commentRepository;
        this.filmRepository = filmRepository;
    }

    //DONE
    public void save(Comment comment, Long id) {
        comment.setFilm(filmRepository.findById(id).orElse(null));
        commentRepository.save(comment);
    }

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }
}
