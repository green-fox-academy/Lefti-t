package com.company;

public class TakesLonger {

    public static void main(String[] args) {


        StringBuffer quote = new StringBuffer("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)




        String addition = new String(" always takes longer than ");
        String firstPart = new String("Hofstadter's Law: It");
        String secondPart = new String("you expect, even when you take into account Hofstadter's Law.");
        StringBuffer newQuote = new StringBuffer(firstPart + addition + secondPart);
        quote = newQuote;

        //OR  quote.insert(20, " always takes longer than" );
        System.out.println(quote);


    }
}
