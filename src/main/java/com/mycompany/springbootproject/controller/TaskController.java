package com.mycompany.springbootproject.controller;

import com.mycompany.springbootproject.dto.TaskDto;
import com.mycompany.springbootproject.entity.TaskEntity;
import com.mycompany.springbootproject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @GetMapping("/allTasks")
    public ResponseEntity<List<TaskDto>> getAllTasks(){

        List<TaskDto> taskList= taskService.getAllTasks();

        return ResponseEntity.ok(taskList);
    }



}
