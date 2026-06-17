package com.Advance_Java.JavaAnnotation;

import java.util.ArrayList;

public class Demo1 {

    @Demo(demo = "Hello")
    void display() {
        System.out.println("Display of Parent");
    }

    @SuppressWarnings({"unused", "unchecked", "rawtypes"})
    void display1() {
        int a = 10;
        int b = 20;

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
    }
    @Deprecated
    void display2() {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("World");
        al.add("Mango");
    }
}
