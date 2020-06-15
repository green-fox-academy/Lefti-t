package com.aircraftCarrier;

public class F35 extends Aircraft {


    public F35() {
        super();
        this.type = "F35";
        this.maxAmmo = 12;
        this.baseDamage = 50;
    }


    @Override
    boolean isPriority() {
        return true;
    }
}
