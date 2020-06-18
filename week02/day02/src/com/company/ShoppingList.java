package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    private List<String> shoppingList = new ArrayList<>();

    public ShoppingList() {

        shoppingList.addAll(Arrays.asList("Eggs", "Milk", "Fish", "Apples", "Bread", "Chicken"));
    }

    public static void main(String[] args) {

        ShoppingList list = new ShoppingList();

        Scanner s = new Scanner(System.in);
        System.out.println("Which item of the list would you like to check?");
        String scan = s.next();


        list.checkItemInList(scan);


    }

    public void checkItemInList(String item) {


        if (!shoppingList.contains(item)) {
            System.out.println(item + " is not in the shopping list.");
        } else {
            System.out.println(item + " is already in the shopping list.");
        }

    }
}
