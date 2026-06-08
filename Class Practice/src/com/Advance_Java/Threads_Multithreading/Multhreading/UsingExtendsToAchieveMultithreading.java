package com.Advance_Java.Threads_Multithreading.Multhreading;

import java.util.Scanner;

/*
Q1. What is Process?
    It's a program which is present on the RAM which is ready for the execution or which is executing already.

Q2. What is Thread?
    Thread is a independent instructions getting executed independently within a process.

if you want to achieve multithreading - you need to keep the independent method inside run() method which is present in Thread Class
we can achieve multithreading in 2 ways -> 1. By extends class (Thread Class)
                                        -> 2. By implements interface (Runnable interface)
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
public class UsingExtendsToAchieveMultithreading {
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

/*
# Multithreading using Extending the Thread Class:

    Q1. How do we actually make one of these helpers?
        One simple way is by extending the Thread class. Think of it like building your own worker
        and giving them clear instructions on what job to do. Once you’re ready, you just say “go!” —
        and they’ll do it on their own while your program continues running.

    Q2. What Does It Mean to Extend the Thread Class?
        Let’s take an example.
        # Imagine you're using the Kodnest app:
            1. You’re attending a live class
            2. At the same time, your progress is being saved in the background
            3. And maybe you're also practicing a coding problem in a new tab
        All these things happen at the same time. That’s multithreading.

        In Java, to make this happen, we can extend the Thread class. Each thread will handle its own job —
        just like you multitask while learning.

    # Steps to Extend the Thread Class in Java:
    Let’s break it down in a fun and beginner-friendly way:

    Step 1: Create a Class that Extends Thread
            Think of this as hiring a new worker in your program.
            You’re saying, “Hey Java, I’m creating my own thread!”

                    class MyWorker extends Thread {
                        // ...
                    }

    Step 2: Override the run() Method
            This is where you write what the worker should do.
            Maybe print numbers, fetch data, or do a task in the background.

                    @Override
                    public void run() {
                        System.out.println("Worker is doing the task!");
                    }

    Step 3: Create an Object and Call start()
            Now that your worker is ready, it's time to start the action —
            just like clicking “Start” in your app to begin a class.

                    MyWorker worker = new MyWorker();
                    worker.start(); // not run()

    # Note: 1. Use start() — not run() directly — so Java creates a new thread and runs the task separately.


    # Key Points to Remember:
        1. Use extends Thread to create a new thread class.
        2. Put the code you want to run inside the run() method.
        3. Use start() (not run()) to actually begin the thread.
        4. Each thread runs independently — just like multiple features in your app.

    # Common Interview Questions & Answers:

        Q1. What is the purpose of the run() method in a thread class?
        Answer: The run() method contains the actual code that will be executed by the thread when it starts.
                It defines the task that the thread is supposed to perform.

        Q2. Can we directly call the run() method instead of start()?
        Answer: Yes, we can call the run() method directly, but it will not start a new thread.
                Instead, it will execute like a normal method in the current thread.
                To create a new thread of execution, we must call the start() method.

        Q3. Can a thread object be started more than once?
        Answer: No, a thread object can only be started once. If you try to start a thread that
                has already been started, Java will throw an IllegalThreadStateException.

        Q4. What is the difference between start() and run()?
        Answer: 1. start(): This method creates a new thread and then internally calls the run() method.
                            It initiates a separate path of execution.
                2. run(): This method contains the task to be executed but does not start a new thread
                          if called directly. It simply runs within the current thread.

        Q5. Which method is used to transition a thread from a runnable state to a timed waiting state?
        Answer: The sleep() method causes the thread to pause for a specified period,
                transitioning it to a timed waiting state.
 */










