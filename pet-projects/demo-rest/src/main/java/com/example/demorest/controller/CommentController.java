package com.example.demorest.controller;

import com.example.demorest.dto.CommentDto;
import com.example.demorest.dto.FilmDto;
import com.example.demorest.entity.Comment;
import com.example.demorest.entity.Film;
import com.example.demorest.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/film")
public class CommentController {
    private final CommentService commentService;

    private final ModelMapper modelMapper;

    @Autowired
    public CommentController(CommentService commentService, ModelMapper modelMapper) {
        this.commentService = commentService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/{id}/comment")
    public ResponseEntity<HttpStatus> createFilm(@PathVariable("id") Long id,
                                                 @RequestBody CommentDto commentDto) {
        commentService.save(convertToComment(commentDto), id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    public Comment convertToComment(CommentDto commentDto) {
        return modelMapper.map(commentDto, Comment.class);
    }

    public CommentDto convertToCommentDto(Comment comment) {
        return modelMapper.map(comment, CommentDto.class);
    }
}
