package com.example.demorest.controller;

import com.example.demorest.dto.CommentDto;
import com.example.demorest.entity.Comment;
import com.example.demorest.service.CommentService;
import com.example.demorest.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public ResponseEntity<List<CommentDto>> getAllComments() {
        return new ResponseEntity<>(commentService.findAll(), HttpStatus.OK);
    }
    
    @PostMapping("/{id}/comments")
    public ResponseEntity<HttpStatus> createComment(@PathVariable("id") Long id,
                                                    @RequestBody CommentDto commentDto) {
        commentService.save(commentDto, id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
