package com.greenfoxacademy.fox.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
