package com.api.frontend.controllers;

import com.api.frontend.models.*;
import com.api.frontend.services.FrontendService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.lang.Error;
import java.util.HashMap;
import java.util.Map;

@RestController
public class APIController {

    FrontendService frontendService = new FrontendService();


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
    public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title, HttpServletResponse response) {
        return frontendService.getGreeting(name, title, response);
    }

    @GetMapping("/appenda/{append}")
    public Object append(@PathVariable(required = false) String append) {
        return new Append(append);
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable(required = false) String action, @RequestBody Until until) {
        if (until.getUntil() == null) {
            return new ResponseEntity<>(new Error("Please provide a number!"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(frontendService.getAction(action, until.getUntil()), HttpStatus.OK);
    }

    @PostMapping("/arrays/")
    public ResponseEntity<?> arrayHandler(@RequestBody NumbersArray numbers) {
        if (numbers.getNumbers() == null) {
            return new ResponseEntity<>(new Error("Please provide what to do with the numbers!"), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(frontendService.arrayHandlerService(numbers),HttpStatus.OK);
    }
}