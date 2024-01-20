package com.example.RESTforTest.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AnimalErrorResponse {
    private String message;

    private LocalDateTime timeStamp;
}
