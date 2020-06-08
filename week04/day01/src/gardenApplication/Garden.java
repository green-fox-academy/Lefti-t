package gardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    ArrayList<Plant> garden;

    public Garden() {
        this.garden = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        this.garden.add(plant);
    }

    public void addWater(double water) {
        int waterCount = 0;
        for (Plant plant : garden) {
            if (plant.inNeedOfWater()) {
                waterCount++;
            }
        }

        double waterDivisor = water / waterCount;
        for (Plant plant : garden) {
            if (plant.inNeedOfWater()) {
                plant.addWater(waterDivisor);
            }


        }
    }

    public void waterInfo() {

        for (Plant plant : garden) {
            if (plant.inNeedOfWater()) {
                System.out.println("This " + plant.color + " " + plant.getClass().getSimpleName() + " needs water");
            } else {
                System.out.println("This " + plant.color + " " + plant.getClass().getSimpleName() + " is watered");
            }


        }
    }

}
