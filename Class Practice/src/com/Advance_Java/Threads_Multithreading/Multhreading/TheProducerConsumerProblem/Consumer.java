package com.Advance_Java.Threads_Multithreading.Multhreading.TheProducerConsumerProblem;

public class Consumer implements Runnable {
    Factory factory;

    public Consumer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        while(true) {
            factory.getData();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
