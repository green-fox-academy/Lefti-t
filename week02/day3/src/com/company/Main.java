package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int divisor = scanner.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fail.");
        }




            // Write a program that opens a file called "my-file.txt", then prints
            // each line from the file.
            // If the program is unable to read the file (for example it does not exist),
            // then it should print the following error message: "Unable to read file: my-file.txt"


            try {
                Path filePath = Paths.get("my-file.txt");
                List<String> lines = null;
                lines = Files.readAllLines(filePath);
                for (String line : lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Unable to read file: my-file.txt");
            }

        }
    }










