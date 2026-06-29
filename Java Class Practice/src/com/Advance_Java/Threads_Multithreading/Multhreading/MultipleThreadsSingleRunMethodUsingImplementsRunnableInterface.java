package com.Advance_Java.Threads_Multithreading.Multhreading;

import java.util.Scanner;

class Demo200 implements Runnable {
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
public class MultipleThreadsSingleRunMethodUsingImplementsRunnableInterface {
    public static void main(String[] args) {
        Demo200 d  = new Demo200();

        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);

        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");
        t1.start();
        t2.start();
        t3.start();
    }
}
