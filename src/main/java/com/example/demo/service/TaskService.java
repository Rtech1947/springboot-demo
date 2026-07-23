package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.model.CreateTaskModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private int idCounter = 1;

    public List<Task> create(CreateTaskModel request) {

        Task task = new Task();

        task.setId(idCounter++);
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setCompleted(false);
        task.setCreatedDate(LocalDateTime.now());

        tasks.add(task);

        return tasks;
    }

    public List<Task> getAll() {
        return tasks;
    }

    public List<Task> updateStatus(int id, boolean completed) {

        for (Task task : tasks) {

            if (task.getId() == id) {

                task.setCompleted(completed);

                return tasks;
            }
        }

        return null;
    }

    public List<Task> delete(int id) {

        tasks.removeIf(task -> task.getId() == id);
        return tasks;
    }

}