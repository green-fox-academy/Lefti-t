package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListIntro2 {
    public static void main(String[] args) {


        ArrayList<String> listA = new ArrayList<String>();

        listA.addAll(List.of("Apple","Avocado","Blueberries","Durian","Lychee"));


        ArrayList<String> listB = new ArrayList<String>();
        listB = listA;

        if (listA.contains("Durian")) {
            System.out.println("Yes Durian is in listA");
        } else {
            System.out.println("Nope, Durian is not on listA");

        }
        listB.remove("Durian");

        listA.add(4,"Kiwi");

        if (listA.size() > listB.size()) {
            System.out.println("listA is bigger");
        } else {
            System.out.println("listB is bigger");
        }

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        listB.addAll(List.of("Passion Fruit","Pomelo"));

        System.out.println(listA.get(2));


    }

}
