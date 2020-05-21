package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        /* Modify this program to greet you instead of the World!
        System.out.println("Hello, World!");*/

        System.out.println("Hello Lefti");




        /* Modify this program to print Humpty Dumpty riddle correctly
        *  System.out.println("All the king's horses and all the king's men");
        System.out.println("Humpty Dumpty had a great fall.");
        System.out.println("Humpty Dumpty sat on a wall,");
        System.out.println("Couldn't put Humpty together again.");*/

        String firstVerse = "Humpty Dumpty sat on a wall,";
        String  secondVerse = "Humpty Dumpty had a great fall.";
        String thirdVerse = "All the king's horses and all the king's men";
        String fourthVerse ="Couldn't put Humpty together again.";
        System.out.println(firstVerse + "\n" + secondVerse + "\n" + thirdVerse+ "\n" +  fourthVerse );




        // Greet 3 of your classmates with this program, in three separate lines
        // like:
        //
        // Hello, Esther!
        // Hello, Mary!
        // Hello, Joe!

        System.out.println("Hello Esther" + "\n" + "Hello Mary" + "\n" + "Hello Joe" );



        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87

        String name = "Lefti";
        int age = 35;
        float height = 1.92f;
        System.out.println(name + "\n" + age + "\n" + height);



        // Create a program that prints a few operations on two numbers: 22 and 13
        // Print the result of 13 added to 22
        // Print the result of 13 substracted from 22
        // Print the result of 22 multiplied by 13
        // Print the result of 22 divided by 13 (as a decimal fraction)
        // Print the integer part of 22 divided by 13
        // Print the remainder of 22 divided by 13

        System.out.println( 13 + 22);
        System.out.println(22-13);
        System.out.println(22 * 13);
        System.out.println(22 / 13.);
        System.out.println(22 / 13);
        System.out.println( 22 % 13);



        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

       int dailyHours = 6;
       int weekDays = 5;
       int weeklyHours = dailyHours * weekDays ;
       int totalDays = 17 * 5;
       int weeklyHours2 = 52;
       System.out.println("Total coding hours are " + dailyHours * totalDays);
       System.out.println("The coding hours percentage is " + (float) weeklyHours / weeklyHours2 *100 + "%");



        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8"
        int favoriteNumber = 8;
        System.out.println("My favourite number is: " + favoriteNumber);



        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);




        // Print the Body mass index (BMI) based on these values
        double massInKg = 98.2;
        double heightInM = 1.92;
        double BMI = massInKg / Math.pow(heightInM,2) ;
        System.out.println("My BMI is " + BMI + "%, I have to start a diet.");




        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String myName = "Lefti";
        int age1 = 35;
        double height1 = 1.92;
        boolean married = false;
        System.out.println("My name is " + myName + " and i am " + age1 + "years old, " + height1 +  "cm tall and the statement that i am married is " + married + ".");



        int aa = 3;
        // make the "a" variable's value bigger by 10
        aa += 8;
        System.out.println(aa);

        int bb = 100;
        // make b smaller by 7
        bb -= 7;
        System.out.println(bb);

        int cc = 44;
        // please double c's value
        cc *= 2;
        System.out.println(cc);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = (int) Math.pow(e,3);
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println( f1 > f2);
        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println(g2*2 > g1);
        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        System.out.println( h%11==0);
        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        System.out.println(i1 > Math.pow(i2,2)&&(i1 < Math.pow(i2,3)));

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        System.out.println( j%3==0 && j%5==0);



        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double side1 = 10;
        double side2 = 10;
        double side3 = 10;
        System.out.println("The total surface area is " + (2*side1*side2 + 2*side2*side3 + 2*side1*side3) );
        System.out.println("The total volume is " + side1 * side2 * side3);




        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingSeconds = ((23-currentHours)*60 + (59-currentMinutes))*60 + (60 - currentSeconds) ;
        System.out.println(remainingSeconds);
    }
}

