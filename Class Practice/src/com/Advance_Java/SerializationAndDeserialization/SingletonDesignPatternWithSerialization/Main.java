package com.Advance_Java.SerializationAndDeserialization.SingletonDesignPatternWithSerialization;

public class Main {
    public static void main(String[] args) {

        PrimeMinister pm1 = PrimeMinister.createInstance("Modiji", 75);
        System.out.println(pm1);

        PrimeMinister pm2 = PrimeMinister.createInstance("Yogiji", 55);
        System.out.println(pm2);

        PrimeMinister pm3 = PrimeMinister.createInstance("Amit", 61);
        System.out.println(pm3);

        /*
        Output:-
            PrimeMinister{name=Modiji, age=75}
            PrimeMinister{name=Modiji, age=75}
            PrimeMinister{name=Modiji, age=75}
         */
    }
}
