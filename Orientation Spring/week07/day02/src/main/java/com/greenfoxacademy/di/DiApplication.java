package com.greenfoxacademy.di;

import com.greenfoxacademy.di.coloring.YellowColor;
import com.greenfoxacademy.di.helloDiProject.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

    @Autowired
    private YellowColor yellow;

    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        yellow.printColor();
    }


}
