package com.Advance_Java.Threads_Multithreading.Multhreading;
/*
    Daemon threads are the supporting threads to the main threads,
    and they exist as long as the main threads are existing

    There is One in-Built daemon thread in java which is Garbage Collector

    # Step to create Daemon Threads

    Step 1 - Identify the main threads and Daemon threads
    Step 2 - keep the Daemon threads inside an infinte loop
             for( ; ; ) --> This will be infinite for-loop
             while(true) --> This will be infinite whlie-loop
    Step3 - always use setDaemon(true) method to make thread as Daemon Thread before starting the Thread
    Step4 - also set thier priority as setPriority(1) or setPriority(Thread.MIN_PRIORITY) for daemon threads
 */

class MicrosoftWord extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("TYPE")) typing();
        else if(name.equals("SPELL")) spellCheck();
        else autoSave();
    }
    public void typing(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Typing......");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void spellCheck(){
        for( ; ; ){
            System.out.println("Spelling Check......");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void autoSave(){
        for( ; ; ){
            System.out.println("AutoSaving......");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Daemon_Thread {
    public static void main(String[] args) {
        MicrosoftWord t1 = new MicrosoftWord();
        MicrosoftWord t2 = new MicrosoftWord();
        MicrosoftWord t3 = new MicrosoftWord();

        t1.setName("TYPE");
        t2.setName("SPELL");
        t3.setName("AUTOSAVE");

        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}
