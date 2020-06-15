package com.company.bunnies;

import java.util.Scanner;

public class BunniesAgain {

    public static void main(String[] args) {

        System.out.println("Give me a number of bunnies");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + " bunnies have " + bunnies(number) + " floppy ears");
    }

    public static int bunnies(int n) {

        //We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
        // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
        // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        if( n == 1 ){
            return 2;
        }
            if (n % 2 == 0) {
                return 3 + bunnies(n - 1);
            } else {
                return 2 + bunnies(n - 1);
            }



    }
}
