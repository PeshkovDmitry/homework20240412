package ru.gb.homework20240412.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.homework20240412.domain.Task;
import ru.gb.homework20240412.domain.TaskStatus;
import ru.gb.homework20240412.service.TaskService;

import java.util.List;

/**
 * Контроллер для обработки Task через REST API
 */

@RestController
@AllArgsConstructor
@RequestMapping
public class TaskController {

    private final TaskService service;

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return service.add(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAll();
    }

    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable TaskStatus status) {
        return service.getByStatus(status);
    }

    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task) {
        return service.updateStatus(id, task.getStatus());
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.delete(id);
    }

}
