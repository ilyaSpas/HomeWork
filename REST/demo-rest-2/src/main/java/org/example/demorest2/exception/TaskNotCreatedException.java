package org.example.demorest2.exception;

public class TaskNotCreatedException extends RuntimeException {
    public TaskNotCreatedException(String message) {
        super(message);
    }
}
