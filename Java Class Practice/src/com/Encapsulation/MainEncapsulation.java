package com.Encapsulation;

class Ac {
    private String coolent;

    void setData(String value){
        coolent = value;
//        System.out.println("Coolent is: " + coolent);
    }

//    void getData(){
//        System.out.println("coolent: " + coolent);
//    }

    String getData(){
        return coolent;
    }
}

public class MainEncapsulation {
    public static void main(String[] args) {
        Ac ac = new Ac();
        ac.setData("Liquid");
//        ac.getData();
        System.out.println(ac.getData());
    }
}