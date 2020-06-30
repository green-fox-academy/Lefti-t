package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequencyOfCharacter {
    public static void main(String[] args) {


//        Exercise 9
//        Write a Stream Expression to find the frequency of characters in a given string!

     String string = "Hello, this is a random string.";

        Map<String, Long> frequentChars = Arrays.stream(string.toLowerCase().split(""))
                .collect(Collectors.groupingBy( c -> c, Collectors.counting()));
        frequentChars.forEach((k, v) -> System.out.println(k + ":" + v));


    }
}
