package com.company;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Give me a number to calculate the fibonnaci sequence");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        System.out.println(fibs(scan));
    }


    public static int fibs(int n) {

        if ( n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return  fibs(n-1) + fibs(n-2);

    }
}
