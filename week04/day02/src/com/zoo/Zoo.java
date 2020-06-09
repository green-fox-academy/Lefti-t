package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {



        Mammals monkey = new Mammals("Monkey",5,"male");
        monkey.feeding();
        monkey.breed();

        EggHatchers snake = new Reptiles("Snake", 3,"female");
        snake.breed();

        Reptiles crocodile = new Reptiles("Crocodile",12,"female");
        crocodile.breed();
        crocodile.crawl();



    }
}
