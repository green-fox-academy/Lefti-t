package com.zoo;

public class Reptiles extends EggHatchers {


    int poisonous;

    public Reptiles(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void crawl() {
        System.out.println("The " + this.name + " is crawling..");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
