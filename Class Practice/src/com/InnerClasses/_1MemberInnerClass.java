package com.InnerClasses;
class OuterClass {
    int a = 10;

    class InnerClass {    // also knows as non-static inner class and Member inner Class
        int b = 20;

        void innerDisplay() {
            System.out.println("Inner class display method is called");
            System.out.println(b);
            System.out.println(a);
        }
    }

    void outerDisplay() {
        System.out.println("Outer class display method is called");
        System.out.println(a);
    }
}
public class _1MemberInnerClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.outerDisplay();

        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.innerDisplay();
    }
}
