package com.company.hardOnes;

public class SubInt {




    public static void main(String[] args) {
subInt(5, new int[]{1,5,25,35,45});

    }


    public static int subInt (Integer n  , int[] l){
        for (int i = 0; i < l.length ; i++) {
            if ( l[i] == n || l[i] / 10 == n && i != 0  || (l[i] % 10 == n && i != 0) ) {
                System.out.println(l[i]);
            }

        }
        return 0;
    }
}
