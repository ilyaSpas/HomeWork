package org.example.demorest2.converter;

import lombok.RequiredArgsConstructor;
import org.example.demorest2.dto.TaskDto;
import org.example.demorest2.entity.Task;
import org.example.demorest2.entity.TaskStatus;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Converter {
    private final ModelMapper modelMapper;

    public Task daoToTask(TaskDto taskDto) {
        return modelMapper.map(taskDto, Task.class);
    }

    public TaskDto taskToDao(Task task) {
        return modelMapper.map(task, TaskDto.class);
    }

    public List<TaskDto> taskListToTaskDaoList(List<Task> taskList) {
        return taskList.stream()
                .map(this::taskToDao)
                .collect(Collectors.toList());
    }

    public Task updateByDao(Task task, TaskDto taskDto) {
        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setStatus(TaskStatus.valueOf(taskDto.getStatus()));
        return task;
    }
}
