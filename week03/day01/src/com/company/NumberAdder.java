package com.company;

public class NumberAdder {

    public static void main(String[] args) {


        int number = 10;
        System.out.println(sum1(number));


    }


    public static int sum1(int n) {

        //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.


        if (n == 1) {
            return 1;
        } else {
            return n + sum1(n-1);
        }

    }
}