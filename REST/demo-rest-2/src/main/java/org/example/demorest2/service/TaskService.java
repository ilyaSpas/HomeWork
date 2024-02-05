package org.example.demorest2.service;

import lombok.RequiredArgsConstructor;
import org.example.demorest2.converter.Converter;
import org.example.demorest2.dto.TaskDto;
import org.example.demorest2.entity.Task;
import org.example.demorest2.exception.TaskNotCreatedException;
import org.example.demorest2.exception.TaskNotFoundException;
import org.example.demorest2.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

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


    public void checkBindingResult(BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            StringBuilder stringBuilder = new StringBuilder();
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError fieldError : errors){
                stringBuilder.append(fieldError.getField())
                        .append(" - ")
                        .append(fieldError.getDefaultMessage())
                        .append(";");
            }
            throw new TaskNotCreatedException(stringBuilder.toString());
        }
    }
}
