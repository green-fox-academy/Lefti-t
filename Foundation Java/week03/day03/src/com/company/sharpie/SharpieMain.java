package com.company.sharpie;

public class SharpieMain {

    public static void main(String[] args) {

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.addItem(new Sharpie("Black", 3f, 80));
        sharpieSet.addItem(new Sharpie("Blue", 5f, 70));
        sharpieSet.addItem(new Sharpie("Red", 7f, 60));
        sharpieSet.addItem(new Sharpie("Green", 7f, 90));
        sharpieSet.addItem(new Sharpie("Orange", 7f, 50));


        sharpieSet.sharpieList.get(0).use(70);
        sharpieSet.sharpieList.get(1).use();
        sharpieSet.sharpieList.get(4).use();


        Sharpie sharpie1 = sharpieSet.sharpieList.get(0);

        System.out.println();
        System.out.println("The " + sharpie1.color + " sharpie has " + sharpieSet.sharpieList.get(0).getInkAmount());
        System.out.println("The " + sharpieSet.sharpieList.get(1).color + " sharpie has " + sharpieSet.sharpieList.get(1).getInkAmount());
        System.out.println("The " + sharpieSet.sharpieList.get(2).color + " sharpie has " + sharpieSet.sharpieList.get(2).getInkAmount());
        System.out.println("The " + sharpieSet.sharpieList.get(3).color + " sharpie has " + sharpieSet.sharpieList.get(3).getInkAmount());
        System.out.println(sharpieSet.usable() + " out of " + sharpieSet.sharpieList.size() + " sharpies are still usable");
    }
}

