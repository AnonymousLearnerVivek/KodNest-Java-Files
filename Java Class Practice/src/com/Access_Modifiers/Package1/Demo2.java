package com.Access_Modifiers.Package1;

public class Demo2 extends Demo1{
    void display1() {
        System.out.println(a); // accessible here
        System.out.println(b); // accessible here
        System.out.println(c); // accessible here
//        System.out.println(d); // cannot be accessible here
    }
}
