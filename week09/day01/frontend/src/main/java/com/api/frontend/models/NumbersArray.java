package com.api.frontend.models;

import java.util.ArrayList;
import java.util.List;

public class NumbersArray {
    private String what;
    private  List<Integer> numbers;

    public NumbersArray(List<Integer> numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public NumbersArray() {
        this.numbers = new ArrayList<>();
    }



    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public  List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers( List<Integer> numbers) {
        this.numbers = numbers;
    }
}
