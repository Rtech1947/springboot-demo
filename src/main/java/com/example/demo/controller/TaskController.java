package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.model.CreateTaskModel;
import com.example.demo.service.TaskService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public List<Task> createTask(@RequestBody CreateTaskModel request) {

        return taskService.create(request);
    }

    @GetMapping
    public List<Task> getAllTasks() {

        return taskService.getAll();
    }

    @PutMapping("/{id}")
    public List<Task> updateStatus(
            @PathVariable int id,
            @RequestParam boolean completed) {

        return taskService.updateStatus(id, completed);
    }

    @DeleteMapping("/{id}")
    public List<Task> deleteTask(@PathVariable int id) {

        List<Task> tasks = taskService.delete(id);

        return tasks;
    }

}