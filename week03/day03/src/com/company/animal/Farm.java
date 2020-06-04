package com.company.animal;

import java.util.ArrayList;
import java.util.List;



public class Farm {


    List<Animal> animalList = new ArrayList<>();
    int farmSize = 20;
    int freeSlots = 10;



    public void addAnimal (Animal animal){
        this.animalList.add(animal);
    }


    public void breed() {

        if (this.farmSize > this.freeSlots ) {
           addAnimal(new Animal());
           this.freeSlots -=1;

            System.out.println("A new animal has successfully been bred. ");
            System.out.println("The farm has now " + getFarmSize() + " animals and " + getFreeSlots() + " free slots.");
        }else {
            System.out.println("The Farm is full!");
        }
    }
    public void slaughter(){

       int min1 = animalList.get(0).getHunger();
       int minPos1 = 0;
        for(int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getHunger() > min1) {
                min1 = animalList.get(i).getHunger();
                minPos1 = i;
            }
        }
            animalList.remove(minPos1);
        System.out.println(minPos1 + " has been slaughtered!");




        }





    public int getFarmSize() {
        return this.farmSize;
    }


    public int getFreeSlots() {
        return this.freeSlots;
    }


}

