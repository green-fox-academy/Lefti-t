package com.greenfox.listing_todos;

import com.greenfox.listing_todos.models.Todo;
import com.greenfox.listing_todos.repositories.IToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ListingTodosApplication implements CommandLineRunner {
    private static IToDoRepository iToDoRepository;

    public ListingTodosApplication(IToDoRepository iToDoRepository) {
        this.iToDoRepository = iToDoRepository;
    }

    public static void main(String[] args) {
        // SpringApplication.run(ListingTodosApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        //List<Todo> todos2 = new ArrayList<Todo>();
        iToDoRepository.save(new Todo(null,"Start the day",false,false));
        iToDoRepository.save(new Todo(null,"Finish H2 workshop1",false,false));
        iToDoRepository.save(new Todo(null,"Finish JPA workshop2",false,false));
        iToDoRepository.save(new Todo(null,"Create a CRUD project",false,false));
        iToDoRepository.findAll().forEach(todo -> System.out.println());
    }
}
