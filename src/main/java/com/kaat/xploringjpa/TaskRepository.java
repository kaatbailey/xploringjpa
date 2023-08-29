package com.kaat.xploringjpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Spring Data JPA will provide CRUD methods automatically
}

