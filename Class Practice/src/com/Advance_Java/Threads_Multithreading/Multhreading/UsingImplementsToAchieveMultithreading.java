package com.Advance_Java.Threads_Multithreading.Multhreading;

import java.util.Scanner;
/*
    Q: Which one is more effective/prefered More for multi-threading, is it implementing Runnable interface or is it extending Thread class?
    A: 1. With Runnable, your class can still extend another class and perform thread tasks at the same time. Total flexibility!
       2. You can still extend another class since Java doesn’t allow multiple inheritance.
       3. Useful when your class already has a parent but you still want multithreading.
       4. Runnable is preferred in real-world Java applications and frameworks.
       5. It's a clean and standard approach for managing threads.

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
/*
# Multithreading with Runnable Interface:

    Imagine you’re building a Java project, and you want it to do many things at once — like uploading a file
    while the user continues using the app. That’s where multithreading helps. You might think,
    “Okay, I’ll create a thread by extending the Thread class.” But here’s the problem:
    what if your class is already using extends to get features from another class? In Java, you can’t extend
    two classes at the same time. That’s not allowed. So now you’re stuck. You want multithreading,
    but you also want to keep your class structure. What should you do?

    That’s where the Runnable interface comes to the rescue!

    Q1. What Is the Runnable Interface?
    Standard Definition:
        1. The Runnable interface is a functional interface in Java used to create threads by defining the
           code to be executed in a separate thread. It contains only one method: run().
        2. With Runnable, your class can still extend another class and perform thread tasks at the same time.
           Total flexibility!

# Steps to Use the Runnable Interface:
    1. Create a Class that Implements Runnable: This is like joining a Kodnest course. At the same time, you can still access
                                                features like practice challenges, AI-based questions, and chat with mentors.

    2. Override the run() Method: This method is where you define the task your thread will do. It’s like taking
                                  on a specific Kodnest challenge—this is the job your thread will do in the background.

    3. Create an Instance of the Runnable Class and Pass it to a Thread: You create an instance of the Runnable class,
       pass it to a Thread object, and call start(). This is like opening multiple tabs in the Kodnest app—one for learning,
       one for chatting with BroKod, and another for practicing.

# Key Points to Remember:
    1. Runnable is an Interface — not a class, so your class can still extend another class.
    2. Only One Method — It has one method: run(), where you define the task to be done in the thread.
    3. Used with Thread Class — Create a thread object and pass your Runnable task to it.
    4. start() is Mandatory — Always use thread.start() (not run() directly) to begin thread execution.
    5. Runnable = More Flexibility — Ideal when your class already extends something else.

# Common Interview Questions & Answers:
    Q1: Why use Runnable instead of extending Thread?
     A: Runnable gives flexibility — your class can extend another class too. It's better for clean, maintainable code.

    Q2: What is the main difference between Thread and Runnable?
     A: Thread is a class you extend. Runnable is an interface you implement. Runnable separates task from thread control.

    Q3: Can we start a thread by calling run() directly?
     A: No. run() will just act like a normal method. To create a new thread, use start().

    Q4: Can multiple threads share the same Runnable object?
     A: Yes. It helps when you want multiple threads to run the same task or share data.

    Q5: What happens if you try to start a thread twice?
     A: Java throws IllegalThreadStateException because a thread can be started only once.



 */