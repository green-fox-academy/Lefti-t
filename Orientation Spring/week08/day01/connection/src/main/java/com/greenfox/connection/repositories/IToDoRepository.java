package com.greenfox.connection.repositories;

import com.greenfox.connection.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IToDoRepository extends JpaRepository<Todo, Long> {
}
