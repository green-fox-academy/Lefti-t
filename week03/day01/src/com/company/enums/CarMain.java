package com.company.enums;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

    public static void main(String[] args) {


        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            Car car = new Car(Car.Cars.getRandomCar(), Car.Colors.getRandomColor());
            carList.add(car);
        }
        for (Car car : carList) {
            System.out.println(car);

        }
    }


}


