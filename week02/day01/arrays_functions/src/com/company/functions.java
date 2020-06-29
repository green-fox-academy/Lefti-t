package com.company;


import java.util.Arrays;

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


        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]

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
        int result = 1;
        int i = 1;
        for (i = 1; i <= num; i++) {
            result = result * i;

        }

        return result;
    }


    public static  String bubble(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return Arrays.toString(arr);
    }

}




