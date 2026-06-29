package com.Advance_Java.SerializationAndDeserialization.SingletonDesignPatternWithSerialization;

public class PrimeMinister {
    private static PrimeMinister pm = null;
    String name;
    int age;

    private PrimeMinister() {

    }
    private PrimeMinister(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "PrimeMinister{" + "name=" + name + ", age=" + age + '}';
    }

    public static PrimeMinister createInstance(String name, int age) {
        if (pm == null) {
            pm = new PrimeMinister(name, age);
        }
        return pm;
    }
}
