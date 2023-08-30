package com.kaat.xploringjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final TaskRepository taskRepository;

    @Autowired
    public DatabaseInitializer(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (taskRepository.count() == 0) {
            for (int i = 1; i <= 5; i++) {
                Task task = new Task();
                task.setTitle("Task " + i);
                task.setDescription("Description for Task " + i);
                taskRepository.save(task);
            }
        }
    }
}
