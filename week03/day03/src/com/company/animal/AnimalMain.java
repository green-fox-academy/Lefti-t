package com.company.animal;

public class AnimalMain {

    public static void main(String[] args) {

        Animal zebra = new Animal();
        Animal snake = new Animal();
        Animal chupacabra = new Animal(30,30);


        zebra.setHunger();
        snake.setThirst();
        snake.setPlay();
        chupacabra.setPlay();

        System.out.println(zebra.hunger);
        System.out.println(snake.thirst);
        System.out.println(chupacabra.hunger);


    }
}
