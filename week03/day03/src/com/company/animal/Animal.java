package com.company.animal;

public class Animal {

    int hunger;
    int thirst;

    public Animal() {

        this.hunger = 50;
        this.thirst = 50;
    }

    public Animal(String name,int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }


    public void setHunger() {

        this.hunger--;
    }

    public int getHunger() {
        return hunger;
    }



    public void setThirst() {
        this.thirst--;
    }

    public void setPlay() {
        this.hunger++;
        this.thirst++;

    }


}
