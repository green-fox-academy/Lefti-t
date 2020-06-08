package gardenApplication;

public class Flower extends Plant {


    public Flower(String color, Double waterLevel) {
        super(color, waterLevel);
    }

    @Override
    public void addWater(double water) {
        this.waterLevel = this.waterLevel + ( water * 0.75);
    }

    @Override
    public boolean inNeedOfWater() {
        return this.waterLevel < 5;
    }
}
