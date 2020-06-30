package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindFrequencyOfCharacter {
    public static void main(String[] args) {


//        Exercise 9
//        Write a Stream Expression to find the frequency of characters in a given string!

        List<String> string = Arrays.asList("Hello, this is a random string.");

        int count = string.stream()
                .forEach(char -> count++)

    }
}
