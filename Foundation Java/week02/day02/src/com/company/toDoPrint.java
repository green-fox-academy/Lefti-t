package com.company;

public class toDoPrint {


    public static void main(String[] args) {


        StringBuffer todoText = new StringBuffer( " - Buy milk\n");

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String myToDo = new String("My todo:\n");
        String games = new String(" - Download games\n");
        String diablo = new String("    - Diablo");
        StringBuffer todoText2 = new StringBuffer(myToDo + todoText + games + diablo);
        todoText = todoText2;

        System.out.println(todoText);



    }
}
