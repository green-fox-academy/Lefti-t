package com.company;
import java.util.ArrayList;

public class ListIntro1 {

    public static void main(String[] args) {


        ArrayList<String> names= new ArrayList<String>();


        names.add("William ");
        names.add("Kamila");
        names.add("John");
        names.add("Maria\n");

        names.remove(2);
        System.out.println(names.size());
        System.out.println(names.get(2));


        for ( String i:names) {
            System.out.println(i);

        }

        for (int i = names.size() -1; i >= 0 ; i--) {
            System.out.println(names.get(i));
        }

        names.removeAll(names);
        System.out.println(names.size());
    }
}
