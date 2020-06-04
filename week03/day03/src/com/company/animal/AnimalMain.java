package com.company.animal;

public class AnimalMain {

    public static void main(String[] args) {

        Farm farm = new Farm();



        farm.animalList.add(new Animal("Zebra",50,50));
        farm.animalList.add(new Animal("Snake",60,50));
        farm.animalList.add(new Animal("Chupacabra",70,50));


        farm.breed();


        System.out.println( farm.getFreeSlots());

    }
}
