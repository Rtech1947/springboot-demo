package com.example.demo.model;

import java.time.LocalDateTime;

public class Task {

    private int id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdDate;

    public Task() {
    }

    public Task(int id, String title, String description,
                boolean completed, LocalDateTime createdDate) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}