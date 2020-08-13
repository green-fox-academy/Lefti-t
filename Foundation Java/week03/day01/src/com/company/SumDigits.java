package com.company;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {


        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sumDigits(number));


    }
    public static int sumDigits(int n){
//Given a non-negative integer n, return the sum of its digits recursively (without loops).

        if (n == 0) {
             return 0;

        } else {
            return (n % 10 + sumDigits(n / 10));
        }


    }
}
