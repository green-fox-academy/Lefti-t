package com.company.pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {


    public List<Pirate> pirates = new ArrayList<>();
    public Pirate captain;
    public String shipName;

    public Ship(String shipName) {

        this.shipName=shipName;
    }

    public void setCaptain() {
        this.captain = new Pirate();

    }

    public void fillShip() {
        for (int i = 0; i < 10; i++) {
            pirates.add(new Pirate());
        }

    }


    public int getPirates() {
        int i = 0;
        for (Pirate pirate : this.pirates) {
            if (!pirate.dead) i++;
        }
        return i;
    }

    public void battleWon() {

        System.out.println(this.shipName + " has won!");
        for (int i = 0; i < (int) Math.round(Math.random() * 5); i++) {
            this.captain.drinkSomeRum();
        }
        for (Pirate pirate : this.pirates) {
            for (int i = 0; i < (int) Math.round(Math.random() * 5); i++) {
                System.out.print(pirate.getName() + ": ");
                pirate.drinkSomeRum();
            }
        }
    }


    public void battleLost() {
        int deadPirates = (int) Math.round(Math.random() * this.getPirates());
        int i = 0;
        int j = 0;
        while (i < deadPirates) {
            while (this.pirates.get(j).dead) j++;
            this.pirates.get(j).die();
            i++;
        }
    }


    public boolean battle(Ship enemyShip) {

        int score = this.getPirates() + this.captain.getRum();
        int enemy = enemyShip.getPirates() + enemyShip.captain.getRum();
        if (score > enemy) {
            this.battleWon();
            enemyShip.battleLost();
        } else {
            this.battleLost();
            enemyShip.battleWon();

        }
        if (this.getPirates() <= 0) return false;
        else if (enemyShip.getPirates() <= 0) return true;
        else return this.battle(enemyShip);


    }


    @Override
    public String toString() {
        return "Ship{" +
                "pirates=" + pirates +
                ", captain=" + captain +
                '}';
    }
}

