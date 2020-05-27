package com.company;


import java.util.stream.IntStream;

public class functions {



    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        int baseNum = 123;
        System.out.println(doubling(baseNum));





        // - Create a string variable named `al` and assign the value `Green Fox` to it
        String al= "Green Fox!";
        System.out.println(greet(al));





        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));





        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
        int numbers = 5;
        System.out.println(append(numbers));




        //   that returns it's input's factorial
        int number = 5;
        System.out.println("Factorial of "+ number + " is " + factorio(5));
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




    public static String appendAFunc(String typo){
        return typo+"a";
    }



    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter


    public static int append(int numbers){
        for (int i = 0; i < numbers ; i++) {
            return (int) ((double)numbers/2*(numbers+1));
        }
        return numbers;
    }



    // - Create a function called `factorio`
    //   that returns it's input's factorial


    public static int factorio(int number){
        int result =1,i;
        for(i=2;i<=number;i++)
            result *= i;
            return result;
        }
    }


