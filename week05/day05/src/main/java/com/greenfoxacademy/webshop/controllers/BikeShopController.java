package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ItemsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BikeShopController {

    ItemsList bikeList = new ItemsList();

    @GetMapping("index")
    public String displayBikes(Model model){
        model.addAttribute("bikeList",bikeList.getItemsList());
        return "index";
    }


    @GetMapping("in-stock")
    public String displayInStock(Model model){
        model.addAttribute("bikeList",bikeList.getInStockList());
        return "in-stock";
    }


    @GetMapping("cheapest-first")
    public String displayCheapestFirst(Model model){
        model.addAttribute("bikeList",bikeList.getCheapestFirst());
        return "cheapest-first";
    }


    @GetMapping("average-stock")
    public String displayAvgStock(Model model){
        model.addAttribute("avg",bikeList.getAvgStock());
        return "average-stock";
    }


    @GetMapping("contains-bike")
    public String displayContainsMtb(Model model){
        model.addAttribute("bikeList",bikeList.getContainsBike());
        return "contains-bike";
    }

    @GetMapping("most-expensive")
    public String displayMostExpensive(Model model){
        model.addAttribute("bikeList",bikeList.getMostExpensive());
        return "most-expensive";
    }

    @PostMapping("search")
    public String displayResult( Model model, @RequestParam String search){
        model.addAttribute("bikeList",bikeList.getSearchResult(search));
        return "index";

    }
}
