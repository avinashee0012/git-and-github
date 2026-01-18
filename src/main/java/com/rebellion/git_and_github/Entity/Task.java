package com.rebellion.git_and_github.Entity;

public class Task {
    private int id;
    private String title;
    private String description;

    public Task(){
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
