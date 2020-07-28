package com.company;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateCharIntoString {
    public static void main(String[] args) {

//        Exercise 8
//        Write a Stream Expression to concatenate a Character list to a string!

        List<Character> chars = Arrays.asList('H', 'e', 'l', 'l', 'o');
        System.out.println( chars.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining("")));


    }
}
