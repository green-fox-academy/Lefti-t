package gardenApplication;

import java.util.ArrayList;

public class GardenMain {

    public static void main(String[] args) {


        Garden garden = new Garden();

        Plant flower1 = new Flower("Blue", (double) 0);
        garden.addPlant(flower1);
        Plant flower2 = new Flower("Yellow", (double) 0);
        garden.addPlant(flower2);
        Plant tree1 = new Tree("Green", (double) 0);
        garden.addPlant(tree1);
        Plant tree2 = new Tree("Brown", (double) 0);
        garden.addPlant(tree2);




        garden.waterInfo();
        garden.addWater((double) 40);
        garden.waterInfo();
        garden.addWater((double) 70);

        garden.waterInfo();
    }
}
