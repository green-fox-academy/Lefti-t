package com.company;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class divideByZero {

    public static void main(String[] args) {




    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0


    Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a number");
    int divisor = scanner.nextInt();

            try {
        int result = 10 / divisor;
        System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("Fail.");
    }

}

}
