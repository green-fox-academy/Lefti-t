package com.assignee.assignee.controllers;

import com.assignee.assignee.models.Todo;
import com.assignee.assignee.services.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
        toDoService.save(todo.getTitle());
        return "redirect:/todo/list";
    }


    @GetMapping("/search")
    public String search(Model model, @RequestParam String search) {
        if (search != null) {
            model.addAttribute("todos", toDoService.search(search));
            return "todolist";
        } else return "redirect:/todo/list";
    }
}
