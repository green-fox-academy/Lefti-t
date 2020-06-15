package com.company.pirates;

public class Pirate {

    int pirateNumber;
    int rum;
    boolean captain;
    boolean dead = false;
    String name;


    public Pirate() {
        pirateNumber++;
        this.rum = 0;
        this.captain = captain;
        this.dead = dead;
        this.name = "Pirate " + pirateNumber;
    }



    public void drinkSomeRum() {
        this.rum++;
    }

    public void howItGoingMate() {
        if (this.rum < 5) {
            drinkSomeRum();
        } else {
            die();

        }
    }

    public void die() {
        this.dead = true;
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public boolean isCaptain() {
        return captain;
    }

    public int getRum() {
        return rum;
    }

    public String getName() {
        return name;
    }
}
