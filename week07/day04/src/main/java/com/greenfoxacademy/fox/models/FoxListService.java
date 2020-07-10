package com.greenfoxacademy.fox.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FoxListService {

    List<Fox> foxes ;

    public FoxListService(){
        foxes = new ArrayList<>();
        this.foxes.add(new Fox("FoxMam",(Arrays.asList("jump","fart","fart while jumping")),"pizza","beer"));
        this.foxes.add(new Fox("FoxDad"));
        this.foxes.add(new Fox("FoxSon"));
        this.foxes.add(new Fox("FoxDaughter"));

    }


    public Fox findFoxName(String name){
    return     foxes.stream().filter(s -> s.getName().toLowerCase().equals(name.toLowerCase())).findFirst().orElse(null);

    }
    public List<String> getFoodTypes(){
        return Stream.of(Food.meals.values()).map(Enum::name).map(String::toLowerCase).collect(Collectors.toList());
    }

    public List<String> getDrinkTypes(){
        return Stream.of(Drink.drinks.values()).map(Enum::name).map(String::toLowerCase).collect(Collectors.toList());
    }

}
