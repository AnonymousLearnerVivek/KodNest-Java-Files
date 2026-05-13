package com.InnerClasses;

class OuterClass1 {
    static int a = 10;

    static class InnerClass1 {
        static int b = 20;
        int c = 30;

        static void innerDisplay() {
            System.out.println("Inner class static display method is called");
            System.out.println(b);
//            System.out.println(c); // it will show an error you cannot access the non-static variable inside an static method
        }

        void disp() {
            System.out.println("Inner class non static display method is called");
            System.out.println(b);
            System.out.println(c);
        }
    }

    static void outerDisplay() {
        System.out.println("Outer class static display method is called");
        System.out.println(a);
        System.out.println(InnerClass1.b); // you can access the static variable b here outside the innerclass
        InnerClass1.innerDisplay();


    }
}

public class _2StaticNestedClasses {
    public static void main(String[] args) {

    }
}
