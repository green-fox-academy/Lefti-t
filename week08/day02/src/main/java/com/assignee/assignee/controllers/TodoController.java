package com.assignee.assignee.controllers;

import com.assignee.assignee.models.Todo;
import com.assignee.assignee.services.AssigneeService;
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
private AssigneeService assigneeService;
    public TodoController(ToDoService toDoService,AssigneeService assigneeService) {
        this.toDoService = toDoService;
        this.assigneeService = assigneeService;

//        iToDoRepository.save(new Todo(null, "Start the day", false, false));
//        iToDoRepository.save(new Todo(null, "Finish H2 workshop1", false, false));
//        iToDoRepository.save(new Todo(null, "Finish JPA workshop2", false, false));
//        iToDoRepository.save(new Todo(null, "Create a CRUD project", false, false));
    }

@GetMapping("/")
public String main(){
        return "main";
}

    @GetMapping("/list")
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

    @GetMapping("/edit-todo/{id}")
    public String editTodoGET(Model model, @PathVariable Long id) {
        model.addAttribute("assignees",assigneeService.getAllAssignees());
        model.addAttribute("todo", toDoService.getTodo(id));
        return "edit-todo";
    }

    @PostMapping("/edit-todo")
    public String editTodoPOST(@ModelAttribute("todo") Todo todo, @RequestParam(value = "id") Long id
            ,@RequestParam(required = false,value = "assigneeID") Long assigneeID) {
       if ( assigneeID == null) {
           toDoService.updateToDo(id, todo.getTitle(), todo.isUrgent(), todo.isDone());
       } else {
           toDoService.updateToDo(id, assigneeID, todo.getTitle(), todo.isUrgent(), todo.isDone());
       }
        return "redirect:/todo/list";
    }
    @GetMapping("/delete-todo/{id}")
    public String deleteTodo( @PathVariable Long id) {
        toDoService.deleteToDo(id);
        return "redirect:/todo/list";
    }
}
