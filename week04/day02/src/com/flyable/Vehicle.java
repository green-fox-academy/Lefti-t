package com.flyable;

public abstract class Vehicle {

    int speed;
    int maxAltitude;
    String name;


    public Vehicle(int speed, int maxAltitude, String name) {
        this.speed = speed;
        this.maxAltitude = maxAltitude;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
