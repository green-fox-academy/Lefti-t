package com.greenfoxacademy.di.helloDiProject;

import com.greenfoxacademy.di.coloring.MyColor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer implements MyColor {


    public void log(String message) {

        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }

    @Override
    public void printColor() {

    }
}