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
    private final FoxListService foxList;

    public FoxController(FoxListService foxList) {
        this.foxList = foxList;
    }


    @GetMapping("/nutritionStore")
    public String nutritionStore(Model model, @RequestParam String name) {
        model.addAttribute("foxName", foxList.findFoxName(name).getName());
        model.addAttribute("foxFood", foxList.getFoodTypes());
        model.addAttribute("foxDrink", foxList.getDrinkTypes());
        model.addAttribute("currentFood", foxList.findFoxName(name).getFood());
        model.addAttribute("currentDrink", foxList.findFoxName(name).getDrink());
        return "nutritionStore";
    }

    @PostMapping("/nutritionNew")
    public String changeNutrition(Model model, @RequestParam String name, String newFood, String newDrink) {
        foxList.findFoxName(name).setFood(newFood);
        foxList.findFoxName(name).setDrink(newDrink);
        return "index";
    }
}
