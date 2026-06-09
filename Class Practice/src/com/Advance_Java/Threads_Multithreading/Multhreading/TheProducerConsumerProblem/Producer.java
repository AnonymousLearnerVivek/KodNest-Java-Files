package com.Advance_Java.Threads_Multithreading.Multhreading.TheProducerConsumerProblem;

public class Producer implements Runnable {
    Factory factory;
    public Producer(Factory factory) {
        this.factory = factory;
    }
    @Override
    public void run() {
        int i = 1;
        while(true) {
            factory.setData(i++);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
