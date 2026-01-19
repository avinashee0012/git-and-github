package com.rebellion.git_and_github.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rebellion.git_and_github.Entity.Task;
import com.rebellion.git_and_github.dto.TaskRequestDto;
import com.rebellion.git_and_github.service.TaskService;

@RestController
@RequestMapping("api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }
    
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskRequestDto taskRequestDto){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.createTask(taskRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getAllTasks());
    }
}
