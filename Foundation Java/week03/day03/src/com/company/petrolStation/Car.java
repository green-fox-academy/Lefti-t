package com.company.petrolStation;

public class Car {

    int gasAmount;
    int capacity;
    String name;

    public Car(String name,int gasAmount, int capacity) {
        this.gasAmount = capacity;
        this.capacity = gasAmount;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "{" +
                "gasAmount=" + gasAmount +
                ", capacity=" + capacity +
                 "}";
    }
}
