package com.assignee.assignee.controllers;

import com.assignee.assignee.models.Todo;
import com.assignee.assignee.services.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private ToDoService toDoService;

    public TodoController(ToDoService toDoService) {
        this.toDoService = toDoService;
//        iToDoRepository.save(new Todo(null, "Start the day", false, false));
//        iToDoRepository.save(new Todo(null, "Finish H2 workshop1", false, false));
//        iToDoRepository.save(new Todo(null, "Finish JPA workshop2", false, false));
//        iToDoRepository.save(new Todo(null, "Create a CRUD project", false, false));
    }


    @GetMapping({"/", "/list"})
    public String list(Model model) {
        List<Todo> todos = new ArrayList<Todo>();
        toDoService.findAll().forEach(todos::add);
        model.addAttribute("todos", todos);
        return "todolist";
    }


    @GetMapping("/add")
    public String addTodo(Model model) {
        Todo todo = new Todo();
        model.addAttribute("todo", todo);
        return "add";
    }


    @PostMapping("/add-todo")
    public String saveTodo(@ModelAttribute Todo todo) {
        toDoService.save(todo);
        return "redirect:/todo/list";
    }


    @PostMapping("search")
    public String displayResult(Model model, @RequestParam String search) {
        List<Todo> todos = toDoService.findAll().stream().filter(s -> s.getTitle().toLowerCase()
                .contains(search)).collect(Collectors.toList());
        model.addAttribute("todos", todos);
        return "todolist";

    }
}
