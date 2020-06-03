package com.company.counter;

public class CounterMain {

    public static void main(String[] args) {

        Counter count = new Counter(0);
        Counter count2 = new Counter(0);

        count.add(5);
        count2.add(12);
        System.out.println(count.get());
        System.out.println(count2.reset());
    }
}
