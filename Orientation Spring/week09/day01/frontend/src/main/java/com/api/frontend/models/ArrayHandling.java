package com.api.frontend.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandling {
    private String what;
    private List<Integer> numbers;


    public ArrayHandling(List<Integer> numbers, String what) {
        this.what = what;
        this.numbers = numbers;
    }

    public ArrayHandling() {
        this.numbers = new ArrayList<>();

    }


    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
