package com.company.sum;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


public class SumTest {

    Sum summary = new Sum();

    ArrayList<Integer> sumList = new ArrayList<>();


    @Test
    public void sumTesting() {
        int sum1 = 0;
        for (int i = 0; i < 6; i++) {
            sumList.add(i);
            sum1 += i;
        }
        assertEquals(15, summary.sum(sumList));

    }

}
