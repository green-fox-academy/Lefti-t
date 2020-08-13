package com.gfa.reddit.controllers;

import com.gfa.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    final
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String welcomepage() {
        return "/welcome";
    }

    @GetMapping("/register")
    public String signIn() {
        return "register";
    }

    @PostMapping("register")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        if (this.userService.doesUserExist(username)) {
            model.addAttribute("UserAlreadyExists", "Username" + username + " already exists!");
            return "register";
        } else {
            this.userService.saveNewUser(username, password);
            model.addAttribute("newUser", username);
            return "login";
        }
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (this.userService.doesUserExist(username) && this.userService.validLogin(username, password)) {
            if (!this.userService.validLogin(username, password)) {
                model.addAttribute("Error", "The password for username " + username + "is not correct!");
                return "login";
            }
            if (!this.userService.doesUserExist(username)) {
                model.addAttribute("Error2", "The username " + username + "does not exist.Please register!");
                return "register";
            }
        }
        model.addAttribute("username", username);
        return "redirect:/index";
    }
}