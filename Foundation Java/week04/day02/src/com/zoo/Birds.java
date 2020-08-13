package com.zoo;

import com.flyable.Flyable;

public class Birds extends  EggHatchers implements Flyable {

    String name;
    int age;
    String gender;

    public Birds(String name, int age, String gender) {
        super(name, age, gender);

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
