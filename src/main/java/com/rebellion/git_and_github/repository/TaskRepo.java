package com.rebellion.git_and_github.repository;

import java.util.List;

import com.rebellion.git_and_github.Entity.Task;

public interface TaskRepo {
    Task save(Task task);
    List<Task> findAll();
    Task findById(int taskId);
    Task updateById(Task task);
}
