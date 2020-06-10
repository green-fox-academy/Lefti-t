package com.company.printable;

public class Domino implements Printable{

    int A ;
    int B;

    public Domino(int a, int b) {
        A = a;
        B = b;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.getA() + ", B side: " + this.getB());
    }
}
