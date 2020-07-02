package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

    protected String name;
    protected double balance;
    protected String animalType;
    protected boolean isKing;


    public BankAccount(String name, double balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;

    }

    public String getName() {
        return name;
    }



    public String getBalance() {
        String formattedString = String.format("%.2f", balance);

        return formattedString + " Zebra";
    }


    public String getAnimalType() {
        return animalType;
    }



    public boolean isKing() {
        return isKing;
    }


}
