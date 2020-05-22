package com.company;

import java.util.Random;
import java.util.Scanner;

public class Loops {

    private static Random scanner;

    public static void main(String[] args) {


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

