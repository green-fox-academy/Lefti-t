package com.greenfoxacademy.di.coloring;

import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {

    @Override

    public void printColor() {
        System.out.println("Hellow yellow ");
    }
}
