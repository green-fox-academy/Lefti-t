package com.modeStringInstruments;

public class Violin  extends  StringedInstrument{

    int numberOfStrings = 4;
    String name = "Violin";


    @Override
    public String sound() {
        return "Screeeechh";
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
