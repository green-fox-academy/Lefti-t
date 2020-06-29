package com.company;

public class FindUppercaseChars {
    public static void main(String[] args) {

//Write a Stream Expression to find the uppercase characters in a string!

        String c = "Hello There!"
                .chars()
                .filter(Character::isUpperCase)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println("The uppercase characters are " + c);


    }
}
