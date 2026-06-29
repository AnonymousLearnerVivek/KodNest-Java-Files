package com.StaticKeyword;

class Program {
    static int a;  // static variable

    static         // static block
    {
        System.out.println("This is static Block");
        a = 10;
    }

    static void display1()
    {
        System.out.println("This is static method");
        System.out.println(a);
    }

    int b;   // instance variable or non static variable

    {     // instance variable or nonstatic block
        System.out.println("This is Instance or non static block");
        b = 20;
    }

    void display2(){
        System.out.println("This is Instance or non static method");
        System.out.println(b);
    }

}
