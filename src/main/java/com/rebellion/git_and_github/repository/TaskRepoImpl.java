package com.rebellion.git_and_github.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.rebellion.git_and_github.Entity.Task;

@Component
public class TaskRepoImpl implements TaskRepo{
    private final Map<Integer, Task> tasks = new HashMap<>();

    @Override
    public Task save(Task task) {
        int id = tasks.size() + 1;
        task.setId(id);
        tasks.put(id, task);
        return tasks.get(id);
    }
}
