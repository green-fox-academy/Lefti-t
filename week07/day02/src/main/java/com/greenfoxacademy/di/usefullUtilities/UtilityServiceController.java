package com.greenfoxacademy.di.usefullUtilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;

@Controller
public class UtilityServiceController {
    @Autowired
    private UtilityService utilityService;

    @GetMapping("/useful")
    public String useful() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String email(Model model, @RequestParam (required = false, name="email") String email) {
        String invalid ="blue";
        String valid = "green";
        if ( utilityService.validateEmail(email)) {
            model.addAttribute("color", valid);
            model.addAttribute("text", email);
            return "email";
        } else {
            model.addAttribute("color", invalid);
            return "email";
        }
    }



}
