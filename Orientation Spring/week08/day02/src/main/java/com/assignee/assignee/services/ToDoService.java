package com.assignee.assignee.services;

import com.assignee.assignee.models.Todo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ToDoService  {

    List<Todo> findAll();


    void save(String title);

    List<Todo> getAllActive();

    void deleteToDo(long id);

    Todo getTodo(long id);

    List<Todo> search(String search);

    void updateToDo(long id, String title, boolean urgent, boolean done);

    void updateToDo(long id, Long assigneeID, String title, boolean urgent, boolean done);


}
