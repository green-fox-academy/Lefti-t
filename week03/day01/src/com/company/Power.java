package com.company;
import java.math.*;
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {


        System.out.println("Give me two numbers, the second will be its base to its power");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int number2 = scanner1.nextInt();
        System.out.println(power(number,number2));
    }

    public static int power(int n, int m){
        //Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
        // so powerN(3, 2) is 9 (3 squared).

        if (n == 0|| m == 0){
            return 0;
        } else {
            return (int) Math.pow(n,m);
        }


    }
}
