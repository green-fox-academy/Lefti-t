package com.company.postIt;

import java.awt.*;

public class PostIt {

    Color backgroundColor;
    String text;
    Color textColor;


    public PostIt( Color backgroundColor, String text, Color textColor){

    this.backgroundColor= backgroundColor;
    this.text = text;
    this.textColor = textColor;
    }

    public static void main(String[] args) {

    PostIt Idea1 = new PostIt(Color.orange,"this is a new Post-It named Idea 1",Color.blue);
    PostIt Awesome= new PostIt(Color.pink,"this is a new Post-It named Awesome",Color.black);
    PostIt Superb= new PostIt(Color.yellow,"this is a new Post-It named Superb!",Color.green);


        System.out.println(Idea1.backgroundColor + Idea1.text + Idea1.textColor);

    }
}
