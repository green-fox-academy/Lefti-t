package com.modeStringInstruments;

abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    public abstract String sound();


    public abstract void play();
}