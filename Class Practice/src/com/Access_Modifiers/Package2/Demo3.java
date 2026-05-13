package com.Access_Modifiers.Package2;

import com.Access_Modifiers.Package1.Demo1;

public class Demo3 extends Demo1 {
    void display2() {
        System.out.println(a);
        System.out.println(b);
//        System.out.println(c); // c cannot be accessible here
//        System.out.println(d); // d cannot be accessible here
    }
}
