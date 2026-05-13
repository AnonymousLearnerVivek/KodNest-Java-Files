package com.Has_a_Relationship;

public class Mobile {
    String brand;
    int price;
    OS os;
    public Mobile(String brand, int price, String name, float size) {
        this.brand = brand;
        this.price = price;
        os = new OS(name, size);
    }

    public void mobileDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: $" + price);
        os.osDetails();
    }

    public void chargeMobile(Charger ch) {
        ch.chargerDetails();
    }
}
