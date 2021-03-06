package com.company.cloneable;

public class Person implements Cloneable {

    String name;
    int age;
    String gender;


    public void introduce() {
        System.out.println("Hi, I'am " + name + ",a " + age + " year old " + gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}