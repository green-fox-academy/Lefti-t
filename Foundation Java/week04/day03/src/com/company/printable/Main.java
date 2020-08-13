package com.company.printable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Domino domino = new Domino(3, 2);
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(domino);

        ToDo todo = new ToDo("Buy milk", "High", true);
        List<ToDo> todos = new ArrayList<>();
        todos.add(todo);


        for (Domino d : dominoes) {
            d.printAllFields();
        }

        for (ToDo t: todos) {
            t.printAllFields();

        }
    }
}
