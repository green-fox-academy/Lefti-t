package com.company.bunnies;

import java.util.Scanner;

public class Bunnies {

    public static void main(String[] args) {

        System.out.println("Give me a number of bunnies");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number +" bunnies have "+ bunnies(number)+ " floppy ears");

    }

    public static int bunnies(int n ){

        //We have a number of bunnies and each bunny has two big floppy ears.
        //We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        if (n <= 0) {
            return 0;
        }
            return 2 + bunnies(n - 1 );
        }


    }

