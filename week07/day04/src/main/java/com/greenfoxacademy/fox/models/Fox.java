package com.greenfoxacademy.fox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> trickList;
    private String food;
    private String drink;

    public Fox(String name, List<String> trickList, String food, String drink) {
        this.name = name;
        this.trickList = trickList;
        this.food = food;
        this.drink = drink;
    }

    public Fox(String name) {
        this.name = name;
        this.trickList = new ArrayList<String>();
        this.food = "ice cream";
        this.drink = "vodka";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<String> trickList) {
        this.trickList = trickList;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }


}
