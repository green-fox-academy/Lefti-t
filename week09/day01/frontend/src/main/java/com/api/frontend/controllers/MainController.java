package com.api.frontend.controllers;

import com.api.frontend.services.FrontendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    final
    FrontendService frontendService;

    public MainController(FrontendService frontendService) {
        this.frontendService = frontendService;
    }

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/test")
    public @ResponseBody
    String greeting() {
        return "Hello, World";
    }


    @RequestMapping("/append")
    public @ResponseBody
    String append() {
        return frontendService.appended();
    }
}
