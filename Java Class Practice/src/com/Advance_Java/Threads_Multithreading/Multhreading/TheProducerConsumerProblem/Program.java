package com.Advance_Java.Threads_Multithreading.Multhreading.TheProducerConsumerProblem;

public class Program {
    public static void main(String[] args) {
        Factory fact = new Factory();
        Producer p = new Producer(fact);
        Consumer c = new Consumer(fact);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
}
