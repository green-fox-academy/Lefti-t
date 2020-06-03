package com.company.sharpie;

public class SharpieMain {

    public static void main(String[] args) {


        Sharpie blue5 = new Sharpie("blue",5f);
        Sharpie black3 = new Sharpie("black",3f);
        Sharpie red8 = new Sharpie("red",8f);


        red8.use();

        System.out.println(red8.inkAmount + " \n" + black3.inkAmount);
        }
    }

