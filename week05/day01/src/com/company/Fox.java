package com.company;

import org.w3c.dom.ls.LSOutput;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class Fox {

    String name;
    String color;
    int age;


    public Fox(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Fox foxy = new Fox("foxy","green",4);
        Fox foxter = new Fox("foxter","red",15);
        Fox foxtrot = new Fox("foxtrot","orange",8);
        Fox foxmama = new Fox("foxmama","green",18);
        Fox foxpapa = new Fox("foxpapa","brown",19);

        List<Fox> foxes = new ArrayList<>();
        foxes.add(foxmama);
        foxes.add(foxpapa);
        foxes.add(foxy);
        foxes.add(foxter);
        foxes.add(foxtrot);
//
//        Write a Stream Expression to find the foxes with green color!
//                Write a Stream java.beans.Expression to find the foxes with green color, and age less then 5 years!
//                Write a Stream Expression to find the frequency of foxes by color!

        foxes.stream()
                .filter(fox -> fox.getColor() == "green")
                .filter(fox -> fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox.getName()));

        Map<String, Long> frequentColors =
        foxes.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
        frequentColors.forEach((k, v) -> System.out.println(k + ":" + v));


    }
}
