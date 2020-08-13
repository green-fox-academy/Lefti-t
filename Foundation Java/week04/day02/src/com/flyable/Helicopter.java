package com.flyable;

public class Helicopter  extends  Vehicle implements Flyable{


    public Helicopter(int speed, int maxAltitude, String name) {
        super(speed, maxAltitude, name);
    }

    @Override
    public void land() {
        System.out.println("The " + getName() + " has landed!");
    }

    @Override
    public void fly() {
        System.out.println("The " + getName() + " is flying!");
    }

    @Override
    public void takeOff() {
        System.out.println("The " + getName() + " has took off!");
    }
}
