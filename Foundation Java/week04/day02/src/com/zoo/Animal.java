package com.zoo;

public abstract class Animal {

    String name;
    int age;
    String gender;

    public Animal(String name, int age, String gender) {
    }

    protected Animal() {
    }



    public String getName() {
        return this.name;
    }

    public abstract void breed();


}
