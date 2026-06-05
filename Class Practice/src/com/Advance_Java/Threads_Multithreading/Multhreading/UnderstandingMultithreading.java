package com.Advance_Java.Threads_Multithreading.Multhreading;

import java.util.Scanner;

/*
Q1. What is Process?
    It's a program which is present on the RAM which is ready for the execution or which is executing already.

Q2. What is Thread?
    Thread is a independent instructions getting executed independently within a process.

if you want to achieve multithreading - you need to keep the independent method inside run() method which is present in Thread Class
we can achieve multithreading in 2 ways -> 1. By extends class
                                        -> 2. By implements interface
 */

class Demo1 extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition started");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println("Addition finished");
    }

}
class Demo2  extends Thread {
    @Override
    public void run() {
        System.out.println("Printing characters started");
        for(int i = 65; i < 70 ; i++) {
            System.out.println((char)(i));
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing characters finished");
    }

}
class Demo3 extends Thread {
    @Override
    public void run() {
        System.out.println("Printing numbers started");
        for(int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing numbers finished");
    }

}
public class UnderstandingMultithreading {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();
//        d1.run();  // it will not work like to call run() method you need call start() method
//        d2.run();
//        d3.run();
        d1.start();
        d2.start();
        d3.start();
    }
}











