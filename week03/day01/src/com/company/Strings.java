package com.company;

import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {
        System.out.println("Give me a set of characters");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(strings(s));

    }

    public static String strings(String s) {


        //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.


        if (s.isEmpty()) {
            return s;
        }
        if (s.charAt(0) == 'x') {
            s = s.replaceFirst("x", "y");

            return s.charAt(0) + strings(s.substring(1));

        } else if (s.charAt(0) != 'x') {
            return s.charAt(0) + strings(s.substring(1));
        }


        return s;
    }
}

