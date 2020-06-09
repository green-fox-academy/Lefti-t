package com.modeStringInstruments;

public class BassGuitar extends StringedInstrument {

    int numberOfStrings = 4;
    String name = "Bass Guitar";


    @Override
    public String sound() {
        return "Duum-duuum-damn";
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
