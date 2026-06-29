package com.Advance_Java.Threads_Multithreading.Multhreading;

/*
# Using join() to Wait for Thread Completion:
    Imagine you're using the Kodnest app. You attend a live class, then immediately start solving
    LeetCode questions, skipping the practice homework and notes. What happens? 😵 You feel lost.
    You're not ready. In learning (and coding), order matters. In Java, when you run multiple threads (tasks),
    they all work independently. But sometimes, you want one thread to wait until others are done — just like
    Kodnest ensures you finish each activity before moving to the next. That’s where the join() method comes in.

    Q1. What is join()?
        The join() method in Java is used when you want one thread (usually the main thread)
        to wait for another thread to finish its work.

# Key Points to Remember:
    1. join() is used to wait for a thread to complete before continuing.
    2. Helps maintain proper task order in multithreaded programs.
    3. Prevents main thread from finishing too early.
    4. Simulates step-by-step execution, great for loading tasks or setup processes.

# Common Interview Questions & Answers:

    Q1. What is the purpose of join() in Java?
     A. The join() method makes the current thread wait until another thread has finished executing.
        It ensures proper execution flow, especially when tasks need to be completed in order.

    Q2. Can you use join() on multiple threads?
     A. Yes. You can call join() on multiple threads one after another. This ensures all of them finish
        before the main thread moves on, which is useful for tasks like loading data, running parallel downloads, etc.

    Q3. What happens if we don’t use join()?
     A. Without join(), the main thread may finish while other threads are still running, which could
        lead to incomplete processing, especially when the main thread depends on their results.

 */
class Demo111 extends Thread {
    @Override
    public void run() {
        String name =  Thread.currentThread().getName();
        for(int i = 0; i < 5; i++) {
            System.out.println(name + " thread is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
class Demo211  extends Thread {
    @Override
    public void run() {
        String name =  Thread.currentThread().getName();
        for(int i = 0; i < 5; i++) {
            System.out.println(name + " thread is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
class Demo311 extends Thread {
    @Override
    public void run() {
        String name =  Thread.currentThread().getName();
        for(int i = 0; i < 5; i++) {
            System.out.println(name + " thread is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
public class JoinMethodInMultithreading {
    public static void main(String[] args) throws InterruptedException {
//        String name  =  Thread.currentThread().getName();
//        System.out.println(name + " thread started");
//        Demo111 demo1 = new Demo111();
//        Demo211 demo2 = new Demo211();
//        Demo311 demo3 = new Demo311();
//
//        demo1.start();
//        demo2.start();
//        demo3.start();
//        System.out.println(name + " thread completed");
        /*
         This will be the output
                main thread started
                main thread completed
                Thread-1 thread is running
                Thread-0 thread is running
                Thread-2 thread is running
                Thread-2 thread is running
                Thread-1 thread is running
                Thread-0 thread is running
                Thread-2 thread is running
                Thread-0 thread is running
                Thread-1 thread is running
                Thread-2 thread is running
                Thread-0 thread is running
                Thread-1 thread is running
                Thread-2 thread is running
                Thread-1 thread is running
                Thread-0 thread is running
         */

//        String name  =  Thread.currentThread().getName();
//        System.out.println(name + " thread started");
//        Demo111 demo1 = new Demo111();
//        Demo211 demo2 = new Demo211();
//        Demo311 demo3 = new Demo311();
//
//        demo1.start();
//        demo1.join();
//
//        demo2.start();
//        demo2.join();
//
//        demo3.start();
//        demo3.join();
//        System.out.println(name + " thread completed");

        /*
         This will run but it will be like sequential output
                main thread started
                Thread-0 thread is running
                Thread-0 thread is running
                Thread-0 thread is running
                Thread-0 thread is running
                Thread-0 thread is running
                Thread-1 thread is running
                Thread-1 thread is running
                Thread-1 thread is running
                Thread-1 thread is running
                Thread-1 thread is running
                Thread-2 thread is running
                Thread-2 thread is running
                Thread-2 thread is running
                Thread-2 thread is running
                Thread-2 thread is running
                main thread completed
         */

        String name  =  Thread.currentThread().getName();
        System.out.println(name + " thread started");
        Demo111 demo1 = new Demo111();
        Demo211 demo2 = new Demo211();
        Demo311 demo3 = new Demo311();

        demo1.start();
        demo2.start();
        demo3.start();
        // in this in between main thread they will have concurrent execution
        demo1.join();
        demo2.join();
        demo3.join();
        System.out.println(name + " thread completed");

        /*
            output will be
                main thread started
                Thread-1 thread is running
                Thread-2 thread is running
                Thread-0 thread is running
                Thread-2 thread is running
                Thread-0 thread is running
                Thread-1 thread is running
                Thread-0 thread is running
                Thread-1 thread is running
                Thread-2 thread is running
                Thread-1 thread is running
                Thread-2 thread is running
                Thread-0 thread is running
                Thread-2 thread is running
                Thread-0 thread is running
                Thread-1 thread is running
                main thread completed
         */
    }
}
