package com.modeStringInstruments;

public class AppMusic {

    public static void main(String[] args) {

        ElectricGuitar guitar = new ElectricGuitar();
        guitar.play();
        BassGuitar bass = new BassGuitar();
        bass.play();
        Violin violin = new Violin();
        violin.play();
        ElectricGuitar guitar2 = new ElectricGuitar(7);
        guitar2.play();
    }
}
