package com.aircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircraft> airplanes = new ArrayList<>();
    int carrierAmmo;
    int HP;
    String name;

    public Carrier(int carrierAmmo, int HP,String name) {
        this.carrierAmmo = carrierAmmo;
        this.HP = HP;
        this.airplanes = new ArrayList<>();
        this.name= name;
    }


    public void addAircraft(Aircraft aircraft) {
        airplanes.add(aircraft);
    }

    public void fill() throws Exception {

        if (this.carrierAmmo == 0) throw new Exception("Not enough ammo!");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < this.airplanes.size(); j++) {
                if (this.airplanes.get(j).isPriority() == (i == 0)) {
                    this.carrierAmmo = this.airplanes.get(j).refill(carrierAmmo);
                    if (carrierAmmo <= 0) throw new Exception("Not enough ammo!");
                }
            }
        }
    }

    public void fight(Carrier enemyCarrier) {
        int damage = 0;
        for (Aircraft aircraft : airplanes) {
            damage = airplanes.size() * aircraft.damage();
            aircraft.fight();

        }
        enemyCarrier.HP -= damage;
    }

    public void getStatus() {
        if (this.HP <= 0) {
            System.out.println("The " + this.name + " has been sunk!");
        } else {
            int totalDamage = 0;
            for (Aircraft aircraft : airplanes) {
                totalDamage = (airplanes.size() * aircraft.damage());
            }

            System.out.println("Carrier: "+ this.name + ", HP: " + this.HP + ", Aircraft count: " + airplanes.size() + ", Ammo: " + this.carrierAmmo + ", Total Damage: " + totalDamage);

        }
    }
}