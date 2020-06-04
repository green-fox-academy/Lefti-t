package com.company.petrolStation;

public class Station {

    int gasAmount = 10000;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }




    public void refill(Car name){
        this.gasAmount -= name.capacity;
        name.gasAmount += (name.capacity - name.gasAmount);


    }
}
