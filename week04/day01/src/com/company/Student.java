package com.company;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior developer");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }
}
