package com.CharSequence;

public class Shifter implements CharSequence {


    String shifted;
    int shiftTimes;

    public Shifter(String shifted, int shiftTimes) {
        this.shifted = shifted;
        this.shiftTimes = shiftTimes;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.shifted.charAt(this.shiftTimes + index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
