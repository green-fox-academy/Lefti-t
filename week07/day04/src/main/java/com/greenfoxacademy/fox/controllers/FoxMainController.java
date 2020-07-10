package com.greenfoxacademy.fox.controllers;

import com.greenfoxacademy.fox.models.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxMainController {

    @Autowired
    private FoxListService foxList;


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String main(Model model, @RequestParam String name) {
        model.addAttribute("foxName", foxList.findFoxName(name).getName());
        model.addAttribute("foxTricks", foxList.findFoxName(name).getTrickList());
        model.addAttribute("foxFood", foxList.findFoxName(name).getFood());
        model.addAttribute("foxDrink", foxList.findFoxName(name).getDrink());
        model.addAttribute("foxTricksSize", foxList.findFoxName(name).getTrickList().size());
        return "index";
    }

    @PostMapping("/")
    public String loggedIn(Model model, @RequestParam String foxName) {
        return "redirect:/?name=" + foxName;
    }


}
