package com.aircraftCarrier;

public abstract class Aircraft {

    String type;
    int ammoStorage;
    int maxAmmo;
    int baseDamage;


    public Aircraft() {
        this.ammoStorage = 0;

    }

    public int fight() {
        setAmmoStorage(0);
        return damage();
    }

    public int damage() {
        return (this.ammoStorage * this.baseDamage);
    }

    public int refill(int amount) {
        int maxAmount = this.maxAmmo - this.ammoStorage;
        if (amount >= maxAmount) {
            setAmmoStorage(maxAmount);
            amount -= maxAmount;
        } else {
            setAmmoStorage(amount);
            amount = 0;
        }
        return amount;
    }

    public int getAmmoStorage() {
        return ammoStorage;
    }

    public void setAmmoStorage(int ammoStorage) {
        this.ammoStorage = ammoStorage;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }


    public int getBaseDamage() {
        return baseDamage;
    }


    public String getType() {
        return this.type;

    }

    public String getStatus() {
        System.out.println("Type: " + this.type + ", Ammo: " + this.ammoStorage + ", Base Damage: " + this.baseDamage + ", All Damage: " + damage());

        return null;
    }

     abstract boolean isPriority();
}
