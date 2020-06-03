package com.company.counter;

public class Counter {

    int value;

    public Counter(int value) {
        this.value = 0;
    }

    public void add(int number){

        this.value += number;
    }


    public  int get() {
        return this.value;
    }

    public int reset(){
        int value = 0;
        return value;
    }
}
