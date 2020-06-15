package com.aircraftCarrier;

public class Main {
    public static void main(String[] args) throws Exception {


        F16 f16 = new F16();
        F16 f16_1 = new F16();
        F16 f16_2 = new F16();
        F16 f16_3 = new F16();

        F35 f35 = new F35();
        F35 f35_1 = new F35();
        F35 f35_3 = new F35();
        F35 f35_4 = new F35();

        Carrier enterprise = new Carrier(1000, 5000,"enterprise");
        enterprise.addAircraft(f16);
        enterprise.addAircraft(f16_1);
        enterprise.addAircraft(f35);
        enterprise.addAircraft(f35_1);
        enterprise.fill();

        enterprise.getStatus();

        Carrier deathBySea = new Carrier(1000, 4000,"deathBySea");
        deathBySea.addAircraft(f16_2);
        deathBySea.addAircraft(f16_3);
        deathBySea.addAircraft(f35_3);
        deathBySea.addAircraft(f35_4);
        deathBySea.fill();
        deathBySea.getStatus();

        enterprise.fight(deathBySea);

        enterprise.getStatus();
        deathBySea.getStatus();

        deathBySea.fight(enterprise);

        enterprise.getStatus();
        deathBySea.getStatus();

        deathBySea.fill();
        deathBySea.fight(enterprise);


        enterprise.getStatus();
        deathBySea.getStatus();

        deathBySea.fill();
        deathBySea.fight(enterprise);


        enterprise.getStatus();
        deathBySea.getStatus();

    }
}
