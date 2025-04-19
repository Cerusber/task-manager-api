package com.tanchevsky.taskmanager;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    @GetMapping
    public Collection<Task> getAllTasks() {
        return tasks.values();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        long id = idGenerator.incrementAndGet();
        task.setId(id);
        tasks.put(id, task);
        return task;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        tasks.remove(id);
    }
}
