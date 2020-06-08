package gardenApplication;

public abstract class Plant {


    protected String color;

    protected Double waterLevel;

    public Plant(String color, Double waterLevel) {
        this.color = color;
        this.waterLevel = waterLevel;
    }

    public abstract void addWater(double water);

    public abstract boolean inNeedOfWater();
}
