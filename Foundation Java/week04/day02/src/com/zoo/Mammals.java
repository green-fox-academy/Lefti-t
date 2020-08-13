package com.zoo;

public class Mammals extends Animal {


    public Mammals(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void feeding() {
        System.out.println("A " + getName()  + " is breast feeding its young.");
    }




    public void breed() {
        System.out.println("A " + getName() + " is breeding by pushing miniature versions out.");
    }
}
