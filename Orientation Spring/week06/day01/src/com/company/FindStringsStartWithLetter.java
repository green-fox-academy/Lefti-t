package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindStringsStartWithLetter {
    public static void main(String[] args) {

//        Exercise 7
//        Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        Stream<String> s = cities.stream()
                .filter(city -> city.startsWith("L"));

        System.out.println(s.collect(Collectors.toList()));

    }
}
