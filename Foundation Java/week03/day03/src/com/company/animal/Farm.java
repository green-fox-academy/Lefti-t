package com.company.animal;

import java.util.ArrayList;
import java.util.List;


public class Farm {


    List<Animal> animalList;
    int farmSize;
    int freeSlots;

    public Farm(int farmSize) {
        this.farmSize = farmSize;
        this.animalList = new ArrayList<>();
        this.freeSlots = this.farmSize;
    }

    public void addAnimal(Animal animal) {
        this.animalList.add(animal);
        this.freeSlots -= 1;
    }


    public void breed() {

        if (this.farmSize > this.freeSlots) {
            addAnimal(new Animal());

            System.out.println("A new animal has successfully been bred. ");
            System.out.println("The farm has now " + animalList.size() + " animals and " + getFreeSlots() + " free slots.");
        } else {
            System.out.println("The Farm is full!");
        }
    }

    public void slaughter() {

        int min1 = animalList.get(0).getHunger();
        int minPos1 = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getHunger() > min1) {
                min1 = animalList.get(i).getHunger();
                minPos1 = i;
            }
        }
        System.out.println(animalList.get(minPos1).name + " has been slaughtered!");
        animalList.remove(minPos1);
        this.freeSlots +=1;


    }


    public int getFarmSize() {
        return this.farmSize;
    }


    public int getFreeSlots() {
        return this.freeSlots;
    }


}

