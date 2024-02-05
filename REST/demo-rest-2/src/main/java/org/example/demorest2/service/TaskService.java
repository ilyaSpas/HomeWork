package org.example.demorest2.service;

import lombok.RequiredArgsConstructor;
import org.example.demorest2.converter.Converter;
import org.example.demorest2.dto.TaskDto;
import org.example.demorest2.entity.Task;
import org.example.demorest2.entity.TaskStatus;
import org.example.demorest2.exception.TaskNotFoundException;
import org.example.demorest2.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final Converter converter;

    @Transactional
    public void save(TaskDto taskDto){
        taskRepository.save(converter.daoToTask(taskDto));
    }

    public TaskDto findById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(TaskNotFoundException::new);
        return converter.taskToDao(task);
    }

    public List<TaskDto> findAll() {
        return converter.taskListToTaskDaoList(taskRepository.findAll());
    }

    @Transactional
    public void update(Long id, TaskDto taskDto) {
        Task task = taskRepository.findById(id).orElseThrow(TaskNotFoundException::new);
        task = converter.updateByDao(task, taskDto);
        taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
