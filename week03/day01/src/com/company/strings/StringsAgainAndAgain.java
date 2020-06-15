package com.company.strings;

import java.util.Scanner;

public class StringsAgainAndAgain {

    public static void main(String[] args) {


        System.out.println("Give me a string");
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        System.out.println(string(scan));

    }

    public static String string(String s) {

        //Given a string, compute recursively a new string where all the adjacent chars are now separated by a *

        if (s.length() == 1) {
            return s;
        } else {
            return s.charAt(0) + "*" + string(s.substring(1));

        }
    }
}
