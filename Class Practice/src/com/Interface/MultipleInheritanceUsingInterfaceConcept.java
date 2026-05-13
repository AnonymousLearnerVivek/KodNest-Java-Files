package com.Interface;
/*
    Achieving Multiple Inheritance Using Interface Concept
 */
interface Calculator1{
    void add();
    void sub();
}
interface Calculator2{
    void mul();
    void div();
}

abstract class MyCalc implements Calculator1,Calculator2{
    @Override
    public void add() {
        System.out.println("MyCalc is adding");
    }
    @Override
    public void sub() {
        System.out.println("MyCalc is subtracting");
    }
}

class Calc extends MyCalc{
    @Override
    public void mul() {
        System.out.println("Cal is multing");
    }
    @Override
    public void div() {
        System.out.println("Cal is divising");
    }
}

public class MultipleInheritanceUsingInterfaceConcept {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
