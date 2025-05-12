package com.mycompany.springbootproject.service;

import com.mycompany.springbootproject.dto.TaskDto;
import com.mycompany.springbootproject.entity.TaskEntity;
import com.mycompany.springbootproject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {


    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskDto> getAllTasks() {

        List<TaskEntity> tasks = taskRepository.getAll();

        return mapToTaskDto(tasks);
    }

    private List<TaskDto> mapToTaskDto(List<TaskEntity> taskList) {

        return taskList.stream()
                .map(this::covertToDto)
                .collect(Collectors.toList());
    }


    private TaskDto covertToDto (TaskEntity entity){

        TaskDto taskDto = new TaskDto();
        taskDto.setId(entity.getId());
        taskDto.setTitle(entity.getTitle());
        taskDto.setDescription(entity.getDescription());
        taskDto.setCompleted(entity.isCompleted());

        return taskDto;

    }
}
