package com.api.frontend.controllers;

import com.api.frontend.models.Append;
import com.api.frontend.models.Doubling;
import com.api.frontend.models.Greeter;
import com.api.frontend.models.Until;
import com.api.frontend.services.FrontendService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class APIController {

    FrontendService frontendService = new FrontendService();
    Greeter greeter = new Greeter();
    Append append = new Append();

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

    @PostMapping("dountil/{action}")
    public Object dountil(@PathVariable(required = false) String action , @RequestBody Until until) {
        if(until.getUntil()==null){
            return new Error("sjfkfjjfjf");
        }
        return frontendService.getAction(action,until.getUntil());
    }
}