package org.example.demorest2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
@Tag(name = "Task controller", description = "demo RESTful API")
public class TaskController {
    private final TaskService taskService;

    @Operation(
            summary = "Create task",
            description = "Создать задачу"
    )
    @PostMapping
    public ResponseEntity<HttpStatus> createTask(@RequestBody
                                                 @Valid
                                                 @Parameter(description = "Dto задачи")
                                                 TaskDto taskDto,
                                                 BindingResult bindingResult) {
        taskService.checkBindingResult(bindingResult);
        taskService.save(taskDto);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get all tasks",
            description = "Получить все задачи"
    )
    @GetMapping
    public ResponseEntity<List<TaskDto>> getAllTasks() {
        return new ResponseEntity<>(taskService.findAll(), HttpStatus.FOUND);
    }

    @Operation(
            summary = "Get task by id",
            description = "Получить задачу по id"
    )
    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> getTaskById(@PathVariable("id")
                                               @Parameter(description = "Идентификатор задачи")
                                               Long id) {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.FOUND);
    }

    @Operation(
            summary = "Update task by id",
            description = "Обновить задачу по id"
    )
    @PutMapping("/{id}")
    public ResponseEntity<HttpStatus> updateTask(@PathVariable("id")
                                                 @Parameter(description = "Идентификатор задачи")
                                                 Long id,
                                                 @RequestBody
                                                 @Valid
                                                 @Parameter(description = "Dto для оновления")
                                                 TaskDto taskDto,
                                                 BindingResult bindingResult) {
        taskService.checkBindingResult(bindingResult);
        taskService.update(id, taskDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @Operation(
            summary = "Delete task by id",
            description = "Удалить задачу по id"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable("id")
                                                 @Parameter(description = "Идентификатор задачи")
                                                 Long id) {
        taskService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
