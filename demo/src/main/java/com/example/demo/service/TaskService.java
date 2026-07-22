package com.example.demo.service;

import com.example.demo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private int idCounter = 1;

    public Task create(Task task) {

        task.setId(idCounter++);
        tasks.add(task);

        return task;
    }

    public List<Task> getAll() {
        return tasks;
    }

    public Task updateStatus(int id, boolean completed) {

        for (Task task : tasks) {

            if (task.getId() == id) {

                task.setCompleted(completed);

                return task;
            }
        }

        return null;
    }

    public boolean delete(int id) {

        return tasks.removeIf(task -> task.getId() == id);
    }

}