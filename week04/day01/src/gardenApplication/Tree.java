package gardenApplication;

public class Tree extends Plant {


    public Tree(String color, Double waterLevel) {
        super(color, waterLevel);
    }

    @Override
    public void addWater(double water) {
        this.waterLevel = this.waterLevel + ( water * 0.4);
    }

    @Override
    public boolean inNeedOfWater() {
        return this.waterLevel < 10;
    }
}
