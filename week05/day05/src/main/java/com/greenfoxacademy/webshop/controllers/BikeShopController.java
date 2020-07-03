package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ItemsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BikeShopController {

    ItemsList bikeList = new ItemsList();

    @GetMapping("index")
    public String displayBikes(Model model){
        model.addAttribute("bikeList",bikeList.getItemsList());
        return "index";
    }
}
