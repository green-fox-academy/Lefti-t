package com.CharSequence;

public class Gnirts implements CharSequence {

 public String example;

    public Gnirts(String example) {
        this.example = example;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.example.charAt(this.example.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
