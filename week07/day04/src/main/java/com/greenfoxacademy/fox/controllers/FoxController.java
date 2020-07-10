package com.greenfoxacademy.fox.controllers;
import com.greenfoxacademy.fox.models.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
    @Autowired
    private FoxListService foxList;



    @GetMapping("/nutritionStore")
    public String nutritionStore(Model model, @RequestParam String name) {
        model.addAttribute("foxName",name);
        model.addAttribute("foxFood", foxList.getFoodTypes());
        model.addAttribute("foxDrink", foxList.getDrinkTypes());
        return "nutritionStore";
    }

    @PostMapping("/nutritionNew")
    public String changeNutrition(Model model, @RequestParam String name, String newFood, String newDrink) {
      //  model.addAttribute("newFoxFood", foxList.findFoxName(name).setFood(newFood));
   foxList.findFoxName(name).setDrink(newDrink);
        return "redirect:/?name=" + name;
    }
}
