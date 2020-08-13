package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {


        ArrayList<Integer> money = new ArrayList<Integer>();

        money.addAll(List.of(500, 1000, 1250, 175, 800, 120));

        int sum = 0;
        for (int i : money) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println( "Biggest expense was for : " + Collections.max(money) );
        System.out.println( "Cheapest expense was for : " + Collections.min(money) );

        int average = sum/ money.size();
        System.out.println(average);
            }
        }





