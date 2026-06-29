package com.Advance_Java.Threads_Multithreading.Multhreading.Synchronization;
/*
# Synchronization:
    Imagine you're filling your water bottle at the only tap in your college. Everyone is tired and wants a drink.
    But only one person can use the tap at a time. If two people try to use it together, water splashes everywhere
    and causes confusion. So, what do people usually do? They form a queue. One person uses the tap while others
    wait for their turn.

    This is exactly what Synchronization means in Java. When many threads (like people) try to access a
    shared resource (like the tap), Java makes them wait their turn — so that things stay organized and
    no one gets in each other's way.

Q1. What Is Synchronization?
Standard Definition:
    Synchronization in Java is the process of controlling the access of multiple threads to shared resources.
    It ensures that only one thread can access the critical section of code at a time, thus preventing
    data inconsistency and race conditions.

    1. In simple terms, synchronization makes sure threads take turns.
    2. If one thread is doing something important (like updating a shared variable),
       others must wait until it's done.

# Using synchronized Methods and Blocks in Java:
    When multiple threads want to use the same data in a Java program, we need a way to make sure
    they don’t interfere with each other. One common way to manage this is by using the synchronized keyword.

    Java gives us two simple ways to do this:
        1. Synchronized Methods
        2. Synchronized Blocks
*/
class Printer implements Runnable{
    @Override
    synchronized public void run() {
        try {
            String name = Thread.currentThread().getName();
            System.out.println(name+" has started printing");
            Thread.sleep(3000);
            System.out.println(name + " is doing the printing");
            Thread.sleep(3000);
            System.out.println(name + " has finished printing");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);

        t1.setName("Java Dev");
        t2.setName("Python Dev");
        t3.setName("C Dev");


        t1.start();
        t2.start();
        t3.start();
    }
}

/*
1. Synchronized Methods
    Idea: Only one thread is allowed to use the entire method at a time. Others have to wait.
    Real-Life Example:
    You and your friends are writing a group assignment in one shared Google Doc. To avoid confusion,
    you all agree that only one person will edit at a time while others wait

    Java Code:
                public class SharedDocument {
                    private String content = "";

                    public synchronized void editContent(String newText) {
                        content += newText;
                    }

                    public synchronized String readContent() {
                        return content;
                    }
                }
    What’s Happening:
        1. The editContent() and readContent() methods are synchronized.
        2. That means only one thread at a time can enter either of these methods for a single object.
        3. If one thread is editing, others must wait — just like taking turns with the “editing pen.”

2. Synchronized Blocks:
    Idea: Instead of locking the whole method, you can lock only a small part of the code —
    the one that really needs protection.

    Real-Life Example:
    Let’s say students are posting announcements on a college notice board. Only one student can write at a time.
    But others can read the board or do other things while someone writes.

    Java Code:
                public class NoticeBoard {
                    private List<String> messages = new ArrayList<>();

                    public void postMessage(String message) {
                        synchronized (this) {
                            messages.add(message);
                        }
                        notifyStudents(message); // No need to lock this part
                    }

                    public List<String> readMessages() {
                        synchronized (this) {
                            return new ArrayList<>(messages);
                        }
                    }

                    private void notifyStudents(String message) {
                        // Notify students about the new post
                    }
                }
    What’s Happening:
        1. Only the part where the messages list is changed is inside the synchronized block.
        2. The notifyStudents() part runs normally — no waiting.

 */
/*
# Key Points to Remember:
    1. Synchronization is used to prevent multiple threads from accessing shared resources at the same time.
    2. It ensures thread safety, avoids race conditions, and keeps data consistent.
    3. You can synchronize:
        1. An entire method (using synchronized before method definition).
        2. A specific block of code (using synchronized(object)).
    4. Synchronized methods lock the whole method.
    5. Synchronized blocks allow more control by locking only a portion of the code.
    6. Avoid over-synchronization, as it can slow down performance.
    7. Use private lock objects instead of this for better control and safety.

# Common Interview Questions and Answers:

    Q1. What is synchronization in Java?
    Answer: Synchronization is a technique that ensures only one thread can access a block of code or a method
            at a time to prevent data inconsistency in multithreaded programs.

    Q2. Why do we need synchronization in Java?
    Answer: To prevent thread interference and race conditions when multiple threads access
            and modify shared resources at the same time.

    Q3. What is the difference between synchronized method and synchronized block?
    Answer: 1. A synchronized method locks the whole method.
            2. A synchronized block locks only a small part of the method that needs protection.
            This improves efficiency and performance.

    Q5. Is synchronization always required in multithreading?
    Answer: No. If threads don't share resources or the data is read-only, you don’t need synchronization.
            It's only required when there’s a risk of thread interference.

    Q6. What is the advantage of using ReentrantLock over the synchronized keyword?
    Answer: 1. It allows a thread to re-acquire the same lock multiple times.
            2. ReentrantLock allows a thread to acquire the same lock multiple times without getting blocked,
               offering more control than the synchronized keyword.
 */