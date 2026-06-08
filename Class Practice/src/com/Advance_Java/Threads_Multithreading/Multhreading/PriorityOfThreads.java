package com.Advance_Java.Threads_Multithreading.Multhreading;

import java.util.Scanner;

/*
# Setting Priority of the Main Thread:

    Threads in Java have priority levels, similar to how Swiggy decides which orders need to be delivered first during peak hours.
    By default, the main thread starts with a normal priority but can be adjusted to ensure critical tasks are executed promptly.

    # Thread Priorities Explained:
        1. Priority Levels: Threads have priorities ranging from MIN_PRIORITY (1) to MAX_PRIORITY (10).
                            The main thread’s default priority is NORM_PRIORITY (5).
        2. Changing the Priority: You can increase or decrease the main thread’s priority using the setPriority() method.
 */
class Demo10 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is executing");    }

}
class Demo22  extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is executing");    }

}
class Demo33 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is executing");
    }

}
public class PriorityOfThreads {
    public static void main(String[] args) {

//        Thread t = Thread.currentThread();
//        // Typically Threads priorities are ranging from 1 to 10
//        // and main thread have avg_priority 5
//
//        System.out.println("Current thread is " + t); // Current thread is Thread[#3,main,5,main] -> [id, name, priority, group_name]
//        System.out.println("Current Thread Name: " + t.getName()); // Current Thread Name: main
//        System.out.println("Current Thread Priority: " + t.getPriority()); // Current Thread Priority: 5
//        System.out.println("Current Thread ID: " + t.getId()); // Current Thread ID: 3
//        System.out.println("Current Thread State: " + t.getState()); // Current Thread State: RUNNABLE
//        System.out.println("Current Thread State: " + t.getThreadGroup()); // Current Thread State: java.lang.ThreadGroup[name=main,maxpri=10]
//
//
//        t.setPriority(10); // you can change the priority of the threads.
//        t.setName("First Thread"); // you can change thread name
//        System.out.println("Current Thread Name: " + t.getName());
//        System.out.println("Current Thread Priority: " + t.getPriority());


        String name = Thread.currentThread().getName();
        System.out.println(name + " is executing");
        Demo10 d1 = new Demo10();
        Demo22 d2 = new Demo22();
        Demo33 d3 = new Demo33();
        d1.start();
        d2.start();
        d3.start();
    }
}
