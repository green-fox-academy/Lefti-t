package com.company;


public class functions {



    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        int baseNum = 123;
        System.out.println(doubling(baseNum));





        // - Create a string variable named `al` and assign the value `Green Fox` to it
        String al= "Green Fox!";
        greet(al);






        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
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

    public static void greet(String al) {
        System.out.println("Hello " + al);
    }




    // - Write a function called `appendAFunc` that gets a string as an input,
    //   appends an 'a' character to its end and returns with a string
    // - Print the result of `appendAFunc(typo)`




    public static String appendAFunc(String typo){
        return typo+"a";
    }

}