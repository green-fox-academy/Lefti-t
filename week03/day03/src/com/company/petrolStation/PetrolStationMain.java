package com.company.petrolStation;

public class PetrolStationMain {

    public static void main(String[] args) {


        Station gasStation = new Station(500);

        Car subaru = new Car("Subaru",0,100);
        Car honda = new Car("Honda",50,80);

        gasStation.refill(subaru);


        System.out.println(gasStation.gasAmount);
        System.out.println(subaru.gasAmount);
        System.out.println(honda);
    }
}
