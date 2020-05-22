package com.company;

import java.util.Random;
import java.util.Scanner;

public class Loops {

    private static Random scanner;

    public static void main(String[] args) {


        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"


        for (int i = 0; i < 100; i++) {
            System.out.println("I won't cheat on the exam!");
        }


        // Create a program that prints all the even numbers between 0 and 500


        for (int i = 0; i < 500; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }

        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an number");
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i * number);
        }


        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5


        System.out.println("Give me two numbers");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();

        if (no2 < no1) {
            System.out.println("The second number should be bigger.");
        } else {
            for (int i = no1; i < no2; i++) {
                System.out.println(i);
            }
        }


        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.


        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else  if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was



        int triangle = 5;
        for (int row = 1; row <= triangle; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

