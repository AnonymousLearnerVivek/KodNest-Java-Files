package com.DataStructures.Collections_Frameworks.Map_Interface;

import java.sql.SQLOutput;
import java.util.WeakHashMap;

public class WeakHashMapClass {
    public static void main(String[] args){

        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("C");
        String s4 = new String("D");

        WeakHashMap<Integer, String> whm = new WeakHashMap<Integer,String>();
        whm.put(1000, s1);
        whm.put(2000, s2);
        whm.put(3000, s3);
        whm.put(4000, s4);

        System.out.println(whm);

        // After complete the program execution who call the Garbage collector internally -> it is JVM who will call it
        // but if in case In your program if you want to call the Garbage collector, You can also call it explicitly in the program

        System.gc(); // it will Run the Garbage Collector in the JVM
        for(int i = 0; i < 5000; i++){
            System.out.print(" "); // Wasting some time for Garbage collector
        }
        System.out.println();

        System.out.println(whm); // it will nothing in it here 
    }
}






