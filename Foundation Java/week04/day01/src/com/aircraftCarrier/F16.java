package com.aircraftCarrier;

public class F16 extends Aircraft {



    public F16() {
       super();
        this.type = "F16";
        this.maxAmmo = 8;
        this.baseDamage = 30;

    }

    @Override
    boolean isPriority() {
        return false;
    }
}
