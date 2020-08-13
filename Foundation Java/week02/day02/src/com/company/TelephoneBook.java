package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TelephoneBook {

    public static void main(String[] args) {


        HashMap<String, String> phoneBook = new HashMap<String, String>();

        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");


        System.out.println(phoneBook.get("John K. Miller"));

        String value = "";
        for (Map.Entry<String, String> a : phoneBook.entrySet()) {
            if (Objects.equals("307-687-2982", a.getValue())) {
                value = a.getKey();
                System.out.println("Phone number is 307-687-2982 belongs to " + value);
            }
        }
            boolean search = (phoneBook.containsKey("Chris E. Myers"));
        if (search == true) {
            System.out.println(phoneBook.get("Chris E. Myers"));
        } else {
            System.out.println("Not such entry");
        }
    }
}