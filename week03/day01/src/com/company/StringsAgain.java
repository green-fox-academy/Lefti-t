package com.company;

import java.util.Scanner;

public class StringsAgain {

    public static void main(String[] args) {

        char x = 'x';
        System.out.println("Give me a set of characters");
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.next();
        System.out.println(string(scan,x));

    }

    public static String string(String s, char x) {

        //Given a string, compute recursively a new string where all the 'x' chars have been removed.

        if (s.length() == 0) {
            return s;
        } else {
            if (s.charAt(0) == 'x') {
                return string(s.substring(1), x);

            } else {
                return s.charAt(0) + string(s.substring(1), x);
            }

        }
    }
}