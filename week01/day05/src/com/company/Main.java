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



        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot



        System.out.println("Give me a number.");
        int oneTwo = scanner.nextInt();

        if (oneTwo <= 0) {
            System.out.println("Not enough bro.");
        } else if ( oneTwo == 1) {
            System.out.println("One.");
        } else if (oneTwo == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot.");
        }



        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Give me two numbers.");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("The bigger number is " + number1);
        } else {
            System.out.println("The bigger number is " + number2);
        }



        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people



        System.out.println("Give me a number of boys and girls.");
        int number01 = scanner.nextInt();
        int number02 = scanner.nextInt();

        if ((number01 == number02) && (number01 + number02 >= 20)) {
            System.out.println("The party is awesome!");
        } else if (number01 + number02 >= 20 &&  number01 > number02 || number01 < number02) {
                System.out.println("The party is quite cool!");
        } else if (number01 + number02 < 20 && number02 > 0) {
            System.out.println("The party is Ok-ish..");
        } else if (number02 == 0) {
            System.out.println("Ohh..Too many sausages on the dance floor..");
        }






        // if a is even increment out by one
        double a = 24;
        int out = 0;


        if (a%2==0) {
            out++;
            System.out.println(out);
        } else {
            System.out.println("Number is not even");
        }
        



        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"


        System.out.println(out2);



        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same


        System.out.println(c);




        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"


        System.out.println(out3);





    }
}


