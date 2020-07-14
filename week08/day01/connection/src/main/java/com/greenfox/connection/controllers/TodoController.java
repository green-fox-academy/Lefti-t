package com.greenfox.connection.controllers;

import com.greenfox.connection.models.Todo;
import com.greenfox.connection.repositories.IToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private IToDoRepository iToDoRepository;

    public TodoController(IToDoRepository iToDoRepository) {
        this.iToDoRepository = iToDoRepository;
//
//        iToDoRepository.save(new Todo(null,"Start the day",false,false));
//        iToDoRepository.save(new Todo(null,"Finish H2 workshop1",false,false));
//        iToDoRepository.save(new Todo(null,"Finish JPA workshop2",false,false));
//        iToDoRepository.save(new Todo(null,"Create a CRUD project",false,false));
    }



    @GetMapping({"/", "/list"})
    public String list(Model model) {
        List<Todo> todos = new ArrayList<Todo>();
        iToDoRepository.findAll().forEach(todos::add);
        model.addAttribute("todos",todos);
        return "todolist";
    }


    @PostMapping("/add")
    public String saveTodo(@ModelAttribute("todo") Todo todo) {
        iToDoRepository.save(todo);
        return "add-form";
    }
}
