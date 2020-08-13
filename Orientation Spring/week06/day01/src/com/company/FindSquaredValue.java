package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindSquaredValue {

    public static void main(String[] args) {


        //Write a Stream Expression to find which number squared value is more then 20 from the following list:

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers.stream()
                .filter(n -> (n *n) > 20 )
                .forEach(n -> System.out.println(n));
    }
}
