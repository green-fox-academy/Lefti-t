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

        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).inNeedOfWater()) {
                System.out.println("This " + garden.get(i).color + " " + garden.get(i).getClass().getSimpleName() + " needs water");
            } else {
                System.out.println("This " + garden.get(i).color + " " + garden.get(i).getClass().getSimpleName() + " is watered");
            }


        }
    }

}
