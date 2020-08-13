package com.assignee.assignee.services;

import com.assignee.assignee.models.Todo;
import com.assignee.assignee.repositories.AssigneeRepository;
import com.assignee.assignee.repositories.IToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoServiceImp implements ToDoService {
    IToDoRepository iToDoRepository;
AssigneeRepository assigneeRepository;
    public ToDoServiceImp(IToDoRepository iToDoRepository, AssigneeRepository assigneeRepository) {
        this.iToDoRepository = iToDoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Todo> findAll() {
        return this.iToDoRepository.findAll();
    }


    @Override
    public void save(String title) {
        Todo todo = new Todo(title);
        this.iToDoRepository.save(todo);
    }


    @Override
    public List<Todo> getAllActive() {
        return null;
    }

    @Override
    public void deleteToDo(long id) {
        this.iToDoRepository.deleteById(id);
    }

    @Override
    public Todo getTodo(long id) {
        return this.iToDoRepository.getOne(id);
    }

    @Override
    public void updateToDo(long id, String title, boolean urgent, boolean done) {
        Todo todo = new Todo(title, urgent, done);
        todo.setId(id);
        todo.setDone(done);
        todo.setUrgent(urgent);
        this.iToDoRepository.save(todo);

    }
    @Override
    public void updateToDo(long id, Long assigneeID, String title, boolean urgent, boolean done) {
        Todo todo = new Todo(title, urgent, done);
        todo.setId(id);
        todo.setDone(done);
        todo.setUrgent(urgent);
        todo.setAssignee(this.assigneeRepository.getOne(assigneeID));
        this.iToDoRepository.save(todo);

    }

    @Override
    public List<Todo> search(String search) {
        return this.iToDoRepository
                .findAll()
                .stream()
                .filter(s -> s.getTitle().toLowerCase().contains(search.toLowerCase()))
                 .collect(Collectors.toList());
    }



}