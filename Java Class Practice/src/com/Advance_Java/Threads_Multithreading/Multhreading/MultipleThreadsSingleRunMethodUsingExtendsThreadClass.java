package com.Advance_Java.Threads_Multithreading.Multhreading;

import java.util.Scanner;

class Demo100 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("ADD")) adding();
        else if (name.equals("CHAR")) printCharacters();
        else printNumbers();
    }
    public void adding() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition started");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println("Addition finished");
    }

    public void printCharacters() {
        System.out.println("Printing characters started");
        for(int i = 65; i < 70 ; i++) {
            System.out.println((char)(i));
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing characters finished");
    }

    public void printNumbers() {
        System.out.println("Printing numbers started");
        for(int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing numbers finished");
    }
}
public class MultipleThreadsSingleRunMethodUsingExtendsThreadClass {
    public static void main(String[] args) {
        Demo100 d1 = new Demo100();
        Demo100 d2 = new Demo100();
        Demo100 d3 = new Demo100();

        d1.setName("ADD");
        d2.setName("CHAR");
        d3.setName("NUM");

        d1.start();
        d2.start();
        d3.start();
    }
}
