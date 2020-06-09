package com.zoo;

public class Birds extends  EggHatchers {

    String name;
    int age;
    String gender;

    public Birds(String name, int age, String gender) {
        super(name, age, gender);

    }

    public String fly(){
        return "The Bird is flying";

    }

    @Override
    public String getName() {
        return this.name;
    }


}
