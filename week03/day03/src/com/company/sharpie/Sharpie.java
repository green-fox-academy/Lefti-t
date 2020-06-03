package com.company.sharpie;

public class Sharpie {

    String color;
    Float width;
    Float inkAmount;


    public Sharpie(String color, Float width) {
        this.color = color;
        this.width = width;
        inkAmount = 100f;
    }


    public void use(){
        inkAmount -= 5;
    }
}
