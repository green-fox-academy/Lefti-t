package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebGreetCounterController {


    @RequestMapping("/web/greeting")
    public String webGreetCounter(Model model,String name,Integer counter) {
        Greeting greeting = new Greeting(10,"hello "  );
        model.addAttribute("name", "Lefti");
        model.addAttribute("counter",greeting.getGreetCount());
        return "greetingCounter";
    }
}
