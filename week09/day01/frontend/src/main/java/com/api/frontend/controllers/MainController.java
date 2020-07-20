package com.api.frontend.controllers;

import com.api.frontend.services.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    final
    NumberService numberService;

    public MainController(NumberService numberService) {
        this.numberService = numberService;
    }


    @GetMapping("/")
    public String main() {
        return "index";
    }

    @GetMapping("/doubling")
    public String doubling(@RequestParam Long input) {
        if (input != null) {
            return numberService.doubleNumber(input).toString();
        } else {
            return new String("Please provide an input!");
        }
    }
}
