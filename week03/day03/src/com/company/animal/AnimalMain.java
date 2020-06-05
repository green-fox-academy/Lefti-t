package com.company.animal;

public class AnimalMain {

    public static void main(String[] args) {

        Farm farm = new Farm(20);


        farm.addAnimal( new Animal("Zebra",50,50));
        farm.addAnimal( new Animal("Snake",60,50));

        /*farm.animalList.add(new Animal("Zebra",50,50));
        farm.animalList.add(new Animal("Snake",60,50));
        farm.animalList.add(new Animal("Chupacabra",70,50));
        farm.animalList.add(new Animal("rat",70,50)); */


        farm.breed();
        farm.slaughter();


        System.out.println( farm.getFreeSlots());
        System.out.println(farm.animalList.size());

    }
}
