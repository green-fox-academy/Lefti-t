package com.company.sharpie;

public class SharpieMain {

    public static void main(String[] args) {

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.sharpieList.add(new Sharpie("Black",3f));
        sharpieSet.sharpieList.add(new Sharpie("Blue",5f));
        sharpieSet.sharpieList.add(new Sharpie("Red",8f));





        sharpieSet.sharpieList.get(2).use();
        sharpieSet.sharpieList.get(2).use();
        sharpieSet.sharpieList.get(0).use(70);


        System.out.println();
        System.out.println("The " + sharpieSet.sharpieList.get(0).color + " sharpie has " + sharpieSet.sharpieList.get(0).inkAmount);
        System.out.println("The " + sharpieSet.sharpieList.get(1).color + " sharpie has " + sharpieSet.sharpieList.get(1).inkAmount);
        System.out.println("The " + sharpieSet.sharpieList.get(2).color + " sharpie has " + sharpieSet.sharpieList.get(1).inkAmount);
        System.out.println(sharpieSet.usable() +  " out of "+ sharpieSet.sharpieList.size() + " sharpies are still usable");
        }
    }

