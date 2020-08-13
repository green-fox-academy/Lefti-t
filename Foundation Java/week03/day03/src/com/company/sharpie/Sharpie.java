package com.company.sharpie;

public class Sharpie {

    String color;
    Float width;
    private int inkAmount;



    public Sharpie(String color, Float width, int inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }


    public void use(){
       this.inkAmount -= 50;
    }

    public void use(int amount){
        inkAmount -= amount;
    }

    public int getInkAmount() {
        return this.inkAmount;
    }
}
