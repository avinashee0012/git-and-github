package com.rebellion.git_and_github.dto;

public class TaskRequestDto {
    private String title;
    private String description;

    public TaskRequestDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
