package com.company;

public class MaxFinder {
    public static void main(String[] args) {
        int [] list = {1,223,25,6,28};
        int n =list.length;

        System.out.println(max(list,n));

    }
    public static int max(int A[], int n){


        if(n == 1)
            return A[0];

        return Math.max(A[n-1], max(A, n-1));

    }
}
