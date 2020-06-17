package com.company;


public class functions {


    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        int baseNum = 123;
        System.out.println(doubling(baseNum));


        // - Create a string variable named `al` and assign the value `Green Fox` to it
        String al = "Green Fox!";
        System.out.println(greet(al));


        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));


        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
        int numbers = 5;
        System.out.println(append(numbers));


        //   that returns it's input's factorial
       // int number = 4;
        System.out.println(factorio(5));
    }


    //FUNCTIONS


    // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
    // -    Print the result of `doubling(baseNum)`
    public static int doubling(int baseNum) {

        return baseNum *= 2;
    }


    // - Create a function called `greet` that greets it's input parameter
    //     - Greeting is printing e.g. `Greetings dear, Green Fox`
    // - Greet `al`

    public static String greet(String al) {
        return "Hello " + al;
    }


    // - Write a function called `appendAFunc` that gets a string as an input,
    //   appends an 'a' character to its end and returns with a string
    // - Print the result of `appendAFunc(typo)`


    public static String appendAFunc(String typo) {
        return typo + "a";
    }


    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter


    public static int append(int numbers) {
        for (int i = 0; i < numbers; i++) {
            return (int) ((double) numbers / 2 * (numbers + 1));
        }
        return numbers;
    }


    // - Create a function called `factorio`
    //   that returns it's input's factorial


    public static int factorio(int number) {
        int num = (int) number;
        int result=1;
        int i = 1;
        for (i = 1; i <= num; i++) {
            result = result * i;

        }

        return result;
    }


    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    //    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'


    public static void h(int number, int[] j) {


    }

}


