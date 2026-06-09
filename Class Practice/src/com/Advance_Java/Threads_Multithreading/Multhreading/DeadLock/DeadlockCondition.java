package com.Advance_Java.Threads_Multithreading.Multhreading.DeadLock;
/*
    when you have shared resources and different threats occupy different resources
    and there is a dependency where those resources become unavailable for other threats,
    it reaches a state, and we call this state as Deadlock State.
 */
class Hospital implements Runnable {
    String res1 = "Bed";
    String res2 = "Doctor";

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("TOM")) tomTreatment();
        else jerryTreatment();
    }

    public void tomTreatment() {
        try{
            synchronized(res1){
                System.out.println("Tom is accessing the " + res1);
                Thread.sleep(3000);
                synchronized(res2){
                    System.out.println("Tom is treated by the " + res2);
                    Thread.sleep(3000);
                    System.out.println(res2 + " is finished treating Tom");
                }
                System.out.println("Tom is leaving from the " + res1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void jerryTreatment() {
        try{
            synchronized(res2) { // This will lead to Deadlock condition
                System.out.println("Jerry is treated by the " + res2);
                Thread.sleep(3000);
                synchronized(res1) {
                    System.out.println("Jerry is accessing the " + res1);
                    Thread.sleep(3000);
                    System.out.println(res1 + " is finished treating Jerry");
                }
                System.out.println("Jerry is leaving from the " + res2);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class DeadlockCondition {
    public static void main(String[] args) {
        Hospital h = new Hospital();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);

        t1.setName("TOM");
        t2.setName("JERRY");

        t1.start();
        t2.start();
    }
}