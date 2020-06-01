package com.company;

import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {
        char x = 'x';
        System.out.println("Give me a set of characters");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(strings(s,x));

    }

    public static String strings(String s, char x) {


        //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.


        if (s.length() == 0) {
            return s;
        }
        if (s.charAt(0) == 'x') {
            s = s.replaceAll("x", "y");

            return s.charAt(0) + strings(s.substring(1),x);

        }  else {
            return s.charAt(0) + strings(s.substring(1), x);
        }


    }
}

