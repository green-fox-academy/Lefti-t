package com.greenfox.listing_todos.repositories;

import com.greenfox.listing_todos.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface IToDoRepository extends CrudRepository<Todo, Long> {
}
