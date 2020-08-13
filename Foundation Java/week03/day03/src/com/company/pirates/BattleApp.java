package com.company.pirates;

public class BattleApp {
    public static void main(String[] args) {




        Ship ship = new Ship("Black pearl");
        ship.setCaptain();
        ship.fillShip();
ship.captain.drinkSomeRum();


        Ship ship2 = new Ship("White widow");
        ship2.setCaptain();
        ship2.fillShip();


        ship.battle(ship2);
    }
}
