package org.example.demorest2.dto;

import lombok.Data;

@Data
public class TaskDto {
    private String title;
    private String description;
    private String status;
}
