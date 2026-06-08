package com.Advance_Java.Threads_Multithreading.Multhreading;

/*
Q1. Simple Example: How interrupt() Works in Real Life
    Let’s understand how interrupting a thread works using a simple example.
    Imagine This…
    You're using a job search app. You click to download a big PDF file of a job description.
    After a few seconds, you realize it's not what you wanted. So, you press Cancel to stop the download.
    Let’s now create a Java program that does the same thing with threads.

    Part 1: Creating a Thread That Can Be Interrupted
 */
class DownloadTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Download started...");

        for (int i = 1; i <= 10; i++) {
            // Simulating time taken for downloading each part
            try {
                Thread.sleep(1000); // Wait 1 second (downloading...)
            } catch (InterruptedException e) {
                System.out.println("Download was interrupted!");
                return; // Exit the thread early
            }

            System.out.println("Downloaded " + i * 10 + "%");

            // Check if the thread was interrupted manually
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Download stopped by user.");
                return;
            }
        }

        System.out.println("Download completed successfully.");
    }
}

public class InterruptingAThreadUsingInterruptMethod {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(new DownloadTask());
        downloadThread.start(); // Start the download

        // Wait 3 seconds, then simulate "Cancel"
        try {
            Thread.sleep(3000); // Main thread waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("User decides to cancel the download.");
        downloadThread.interrupt(); // Send stop signal
    }
}

/*
# Interrupting a Thread Using interrupt():
    Imagine your friend is sleeping during a group study session. Suddenly, the teacher walks in,
    and you need to wake your friend up. You don’t pull them out of the chair. Instead, you gently
    tap them and say, “Hey, wake up! It’s time to focus.” You’re not forcing them — just giving a signal.
    This is exactly what the interrupt() method does in Java. It doesn’t force a thread to stop.
    It simply sends a message saying, “Please stop if you can.”

    Q1. What is interrupt()?
        1. In Java, the interrupt() method is used to send a request to a thread asking it to stop
           what it’s doing, especially if the thread is sleeping, waiting, or doing a long-running task.
        2. It does not forcefully stop the thread. Instead, it sets an internal flag that the thread can check
           and decide how to respond. If the thread is in a state like sleep() or wait(), it will throw
           an InterruptedException when interrupted.

    Q2. How Does interrupt() Work?
        When you call the interrupt() method on a thread, you’re sending it a signal to stop.
        The thread won’t stop immediately, but it will know that it has been asked to stop.

        Now what happens depends on what the thread is doing:
            1. If the thread is sleeping or waiting, the signal will wake it up, and
               it will stop if you handle it properly in your code.
            2. If the thread is busy doing work, it won’t stop on its own. You have to
               write your code in a way that checks if the thread was interrupted, and
               then decide what to do — like stop the task or clean things up.

        # You can check if a thread was interrupted by using:
                    Thread.currentThread().isInterrupted()

          This helps the thread know it should stop and exit safely.

# Key Points to Remember:
    1. interrupt() is used to send a stop signal to a thread — it's like politely asking a thread to stop.
    2. It doesn’t forcefully kill the thread; it’s just a request.
    3. If the thread is sleeping or waiting, it will throw an InterruptedException.
    4. If the thread is busy doing work, it needs to check if it was interrupted using:
            Thread.currentThread().isInterrupted();
    5. You can use interrupt() to cancel tasks safely — like stopping a file download in an app.
    6. It helps your program become more efficient, safe, and user-friendly.
    7. Avoid using the old stop() method. It's unsafe and was removed from modern Java.

# Common Interview Questions & Answers:

    Q1: What does the interrupt() method do in Java?
     A: It sends a request to a thread to stop its current work. It doesn’t stop the thread directly,
        but tells it, “Please stop when you’re ready.”

    Q2: When will a thread throw InterruptedException?
     A: If the thread is sleeping (sleep()), waiting (wait()), or blocking, and someone calls interrupt(),
        it throws InterruptedException.

    Q3: Can interrupt() stop a running thread?
     A: Not by itself. The thread must check whether it was interrupted using isInterrupted() and then decide to stop.

    Q4: Why should we use interrupt() instead of stop()?
     A: stop() forces the thread to end immediately, which can break things (like leaving files unfinished).
        interrupt() is safer — it lets the thread stop on its own, after cleaning up.

    Q5: What is the best practice when using interrupt() in long-running threads?
     A: 1. Regularly check the interrupt status and handle it appropriately.
        2. Periodically checking the interrupt status ensures that long-running threads can stop gracefully
           when requested, preventing resource wastage and ensuring smooth program behavior.



 */











