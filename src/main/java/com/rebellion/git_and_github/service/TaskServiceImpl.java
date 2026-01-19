package com.rebellion.git_and_github.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rebellion.git_and_github.Entity.Task;
import com.rebellion.git_and_github.dto.TaskRequestDto;
import com.rebellion.git_and_github.repository.TaskRepo;

@Service
public class TaskServiceImpl implements TaskService{
    private final TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Override
    public Task createTask(TaskRequestDto requestDto) {
        Task task = new Task(requestDto.getTitle(), requestDto.getDescription());
        return taskRepo.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    @Override
    public Task markTaskDone(int taskId) {
        Task task = taskRepo.findById(taskId);
        if(task == null) throw new IllegalArgumentException("Invalid task id");
        task.markDone();
        return taskRepo.update(task);
    }
}
