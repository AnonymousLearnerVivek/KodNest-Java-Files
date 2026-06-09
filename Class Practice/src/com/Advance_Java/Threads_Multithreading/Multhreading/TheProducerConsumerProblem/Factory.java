package com.Advance_Java.Threads_Multithreading.Multhreading.TheProducerConsumerProblem;

public class Factory {
    int aQuantity;
    boolean isProduced = false;
    synchronized public void setData(int aQuantity)  {
        if(isProduced == true) {
            try {
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.aQuantity = aQuantity;
        System.out.println(aQuantity + " number of phones are produced");
        isProduced = true;
        notify();
    }

    synchronized public void getData() {
        if(isProduced == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(aQuantity + " number of phones are consumed");
        isProduced = false;
        notify();
    }
}













