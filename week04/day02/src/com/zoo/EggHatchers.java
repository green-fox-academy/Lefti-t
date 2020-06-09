package com.zoo;

public abstract class EggHatchers extends Animal {


    public EggHatchers(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected EggHatchers() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public  void breed() {
        System.out.println( "A " + this.name + " is breeding by laying eggs!");
    }
}