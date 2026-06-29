package com.Access_Modifiers.Package3;

import com.Access_Modifiers.Package1.Demo1;

public class Demo4 {
    public static void main(String[] args) {
        Demo1 d =  new Demo1();
        System.out.println(d.a);
//        System.out.println(d.b); // b cannot be accessible here
//        System.out.println(d.c); // c cannot be accessible here
//        System.out.println(d.d); // d cannot be accessible here

    }
}
