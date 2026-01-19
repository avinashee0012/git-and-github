package com.rebellion.git_and_github.Entity;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean isDone;

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

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markDone(){
        isDone = true;
    }
}
