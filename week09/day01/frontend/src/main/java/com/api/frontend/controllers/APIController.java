package com.api.frontend.controllers;

import com.api.frontend.models.Doubling;
import com.api.frontend.services.GreeterService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class APIController {


    @GetMapping("/doubling")
    @ResponseStatus(HttpStatus.OK)
    public Object doubling(@RequestParam(required = false) Integer input) {
        Map<String, Object> doubled = new HashMap<>();
        if (input == null) {
            doubled.put("error", "Please provide an input!");
            return doubled;
        }
        return new Doubling(input).doubleInput();
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title,  HttpServletResponse response) {
        GreeterService greeterService = new GreeterService();
        return greeterService.getGreeting();
    }
}