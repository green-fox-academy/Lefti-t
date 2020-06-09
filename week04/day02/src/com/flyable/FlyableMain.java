package com.flyable;

public class FlyableMain {
    public static void main(String[] args) {


        Helicopter heli = new Helicopter(250,6500,"Helicopter");
        heli.takeOff();
        heli.fly();
        heli.land();

    }
}
