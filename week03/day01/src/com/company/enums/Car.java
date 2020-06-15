package com.company.enums;

import java.util.*;


public class Car {

     Cars type = Cars.getRandomCar();
     Colors color = Colors.getRandomColor();


    public Car(Cars type, Colors color) {
    }

    enum Cars {
        VAN, OFFROAD, COUPE, TRUCK, SPORTSCAR, COMPACT, STATIONWAGON;


        private static final Cars[] VALUES = values();
        private static final int SIZE = VALUES.length;
        private static final Random RANDOM = new Random();

        public static Cars getRandomCar() {
            return VALUES[RANDOM.nextInt(SIZE)];

        }
    }
        enum Colors {
            BLUE, WHITE, RED, BLACK, YELLOW, GREY, GREEN;


            private static final Colors[] VALUES = values();
            private static final int SIZE = VALUES.length;
            private static final Random RANDOM = new Random();

            public static Colors getRandomColor() {
                return VALUES[RANDOM.nextInt(SIZE)];

            }


        }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", color=" + color +
                '}';
    }
}







