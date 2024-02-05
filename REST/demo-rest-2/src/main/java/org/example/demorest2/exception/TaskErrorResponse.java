package org.example.demorest2.exception;

import java.time.LocalDateTime;

public class TaskErrorResponse {
    private String message;
    private LocalDateTime date;

    public TaskErrorResponse(String message) {
        this.message = message;
        this.date = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
