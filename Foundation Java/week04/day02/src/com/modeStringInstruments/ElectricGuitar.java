package com.modeStringInstruments;

public class ElectricGuitar extends StringedInstrument {

    int numberOfStrings = 6;
    String name = "Electric Guitar";


    public ElectricGuitar() {
        this.numberOfStrings = numberOfStrings;
        this.name = name;
    }
public ElectricGuitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
}

    @Override
    public String sound() {
        return  "Twang";
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
