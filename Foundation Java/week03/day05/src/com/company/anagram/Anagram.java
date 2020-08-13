package com.company.anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    String string="String_Testing";
    String string2="String_Testing";

    boolean check(String string,String string2){


            if(string.length() != string2.length()){
                System.out.println("The Anagram is false");
            }
            char [] c1 = string.toCharArray();
            char [] c2 = string2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
        }

    }

