package com.Advance_Java.Threads_Multithreading.Multhreading;

import java.util.Scanner;
/*
Q. Which one is more effective/prefered More for multi-threading, is it implementing Runnable interface or is it extending Thread class?
->
 */
class Demo11 implements Runnable{
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
class Demo12 implements Runnable {
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
class Demo13 implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing numbers started");
        for(int i = 1; i <= 5 ; i++) {
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
public class UsingImplementsToAchieveMultithreading {
    public static void main(String[] args) {
        Demo11 demo11 = new Demo11();
        Demo12 demo12 = new Demo12();
        Demo13 demo13 = new Demo13();

        Thread thread1 = new Thread(demo11);
        Thread thread2 = new Thread(demo12);
        Thread thread3 = new Thread(demo13);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
