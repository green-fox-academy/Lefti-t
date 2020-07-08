package com.greenfoxacademy.di.coloring;

import com.greenfoxacademy.di.helloDiProject.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {

    @Autowired
    Printer printer;

    @Override

    public void printColor() {
        printer.log("BRRRRRRRRRRRRRRRRRRRRR");
    }
}
