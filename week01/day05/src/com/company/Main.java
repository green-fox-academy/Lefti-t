package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random scanner;

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number.");
        int oddOrEven = scanner.nextInt();


            if (oddOrEven % 2 == 0) {
            System.out.println(oddOrEven + " is an even number");
        } else {

            System.out.println(oddOrEven + " is an odd number");
            }
        }
}

