package org.example.demorest2.controller;

import lombok.RequiredArgsConstructor;
import org.example.demorest2.dto.TaskDto;
import org.example.demorest2.entity.Task;
import org.example.demorest2.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping
    public String createTask(@RequestBody TaskDto taskDto) {
        taskService.save(taskDto);
        return "Task created!";
    }

    @GetMapping
    public List<TaskDto> getAllTasks(){
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public TaskDto getTaskById(@PathVariable("id") Long id){
        return taskService.findById(id);
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable("id") Long id,
                             @RequestBody TaskDto taskDto){
        taskService.update(id, taskDto);
        return "Task updated!";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable("id") Long id){
        taskService.delete(id);
        return "Task is deleted!";
    }
}
