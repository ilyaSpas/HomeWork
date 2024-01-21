package com.example.demorest.dto;

import com.example.demorest.entity.Comment;
import lombok.Data;

import java.util.List;

@Data
public class FilmDto {
    private String title;

    private List<CommentDto> comments;
}
