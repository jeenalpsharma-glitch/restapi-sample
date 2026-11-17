package com.example.taskapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks() {

        Task task1 = new Task(1, "Learn Java", true);
        Task task2 = new Task(2, "Learn Spring Boot", false);
        Task task3 = new Task(3, "Build REST API", false);

        return List.of(task1, task2, task3);
    }
}