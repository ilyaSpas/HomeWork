package org.example.demorest2.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.demorest2.dto.TaskDto;
import org.example.demorest2.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<HttpStatus> createTask(@RequestBody @Valid TaskDto taskDto,
                                                 BindingResult bindingResult) {
        taskService.checkBindingResult(bindingResult);
        taskService.save(taskDto);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TaskDto>> getAllTasks() {
        return new ResponseEntity<>(taskService.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> getTaskById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HttpStatus> updateTask(@PathVariable("id") Long id,
                                                 @RequestBody @Valid TaskDto taskDto,
                                                 BindingResult bindingResult) {
        taskService.checkBindingResult(bindingResult);
        taskService.update(id, taskDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable("id") Long id) {
        taskService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
