package com.rebellion.git_and_github.service;

import java.util.List;

import com.rebellion.git_and_github.Entity.Task;
import com.rebellion.git_and_github.dto.TaskRequestDto;

public interface TaskService {
    Task createTask(TaskRequestDto task);
    List<Task> getAllTasks();
    Task markTaskDone(int taskId);
}
