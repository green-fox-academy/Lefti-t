package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {

    HashMap<String, Integer> products = new HashMap();


    public static void main(String[] args) {


        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Eggs", 200);
        productList.put("Milk", 200);
        productList.put("Fish", 400);
        productList.put("Apples", 150);
        productList.put("Bread", 50);
        productList.put("Chicken", 550);

        //FISH
        System.out.println("How much is the fish?");
        System.out.println("The fish costs " + productList.get("Fish"));


        //HIGHEST_VALUE
        System.out.println("What is the most expensive product?");
        int highestValue = (Collections.max(productList.values()));
        for (Map.Entry<String, Integer> entry : productList.entrySet()) {
            if (entry.getValue() == highestValue) {
                System.out.println("Its the " + entry.getKey());
            }
        }

        //AVG VALUE
        System.out.println("What is the average values of all products?");
        int average = (int) productList.values().stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("The average value is  " + average);


        //PRODUCTS UNDER 300
        System.out.println("How many products price is below 300?");
        int numberOfPruducts = 0;
        for (Map.Entry<String, Integer> entry : productList.entrySet()) {
            if (entry.getValue() < 300) {
                numberOfPruducts++;
            }
        }
        System.out.println(numberOfPruducts + " products price is below 300");


        //ANY VALUE == 125?
        System.out.println("Is there anything we can buy for exactly 125?");
        int products125 = 0;
        for (Map.Entry<String, Integer> entry : productList.entrySet()) {
            if (entry.getValue() == 125) {
                products125++;
            }
        }
            if (products125 == 0) {
                System.out.println("None of the products  are valued at 125");
            } else {
                System.out.println(products125 + " products are valued at 125");
            }

            //LOWEST VALUE
        System.out.println("What is the least expensive product?");
        int lowestValue = (Collections.min(productList.values()));
        for (Map.Entry<String, Integer> entry : productList.entrySet()) {
            if (entry.getValue() == lowestValue) {
                System.out.println("Its the " + entry.getKey());
            }
        }
        }
    }





