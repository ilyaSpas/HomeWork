package org.example.demorest2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name="Task controller", description="RESTful сервис")
public class TaskController {
    private final TaskService taskService;

    @Operation(
            summary = "Создать задачу",
            description = "Позволяет создать задачу"
    )
    @PostMapping
    public ResponseEntity<HttpStatus> createTask(@RequestBody @Valid TaskDto taskDto,
                                                 BindingResult bindingResult) {
        taskService.checkBindingResult(bindingResult);
        taskService.save(taskDto);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @Operation(
            summary = "Получить все задачи",
            description = "Возвращает список задач"
    )
    @GetMapping
    public ResponseEntity<List<TaskDto>> getAllTasks() {
        return new ResponseEntity<>(taskService.findAll(), HttpStatus.FOUND);
    }

    @Operation(
            summary = "Получить задачу по id",
            description = "Возвращает задачу по id"
    )
    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> getTaskById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.FOUND);
    }

    @Operation(
            summary = "Обновить задачу по id",
            description = "Обновляет задачу по id"
    )
    @PutMapping("/{id}")
    public ResponseEntity<HttpStatus> updateTask(@PathVariable("id") Long id,
                                                 @RequestBody @Valid TaskDto taskDto,
                                                 BindingResult bindingResult) {
        taskService.checkBindingResult(bindingResult);
        taskService.update(id, taskDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @Operation(
            summary = "Удаляет задачу по id",
            description = "Позваляет удаить задачу"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable("id") Long id) {
        taskService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
