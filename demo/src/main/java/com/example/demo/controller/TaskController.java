package com.example.demo.controller;

import com.example.demo.model.Task;
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
    public Task createTask(@RequestBody Task task) {

        return taskService.create(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {

        return taskService.getAll();
    }

    @PutMapping("/{id}")
    public Task updateStatus(
            @PathVariable int id,
            @RequestParam boolean completed) {

        return taskService.updateStatus(id, completed);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {

        boolean deleted = taskService.delete(id);

        if (deleted)
            return "Task Deleted";

        return "Task Not Found";
    }

}