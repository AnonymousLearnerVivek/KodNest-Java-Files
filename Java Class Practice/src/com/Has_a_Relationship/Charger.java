package com.Has_a_Relationship;

public class Charger {
    int voltage;
    char type;

    public  Charger(int voltage, char type) {
        this.voltage = voltage;
        this.type = type;
    }

    public void chargerDetails() {
        System.out.println("Voltage: " + voltage + " volts");
        System.out.println("Charger Type: " + type + " type");
    }
}
