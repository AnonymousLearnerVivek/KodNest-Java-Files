package com.DataStructures.Collections_Frameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;
/*
Q1. What Exactly is the Queue Interface?
Standard Definition:
    The Queue interface is part of Java’s Collections Framework. It represents a collection designed for
    holding elements prior to processing, typically in the order they were added.

# First-In, First-Out (FIFO) Principle:
    The FIFO rule is what makes queues work properly, both in real life and in programming.
    It means that the first item added is the first one to be removed — just like the
    first person in line gets served first.
 */
public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> requestQueue = new LinkedList<>(); // upcasting happening here because linkedList implements both List and Queue(deque) interface
        /*
        1. Enqueue (Adding Elements to the Queue)
           To add something to a queue in Java, you can use either add() or offer().
           Both do the same thing: they put the item at the end of the line.
            1. add() will give an error if the queue is full.
            2. offer() will just say “no” by returning false.
         */
        requestQueue.add("Request 1");
        requestQueue.add("Request 2");
        requestQueue.offer("Request 3"); // In Queue, we 2 methods to add anything add() and offer()
        requestQueue.offer("Request 4");

        System.out.println("Request Queue: " + requestQueue);

        /*
        2. Dequeue (Removing Elements from the Queue)
            To take something out of a queue in Java, you can use remove() or poll().
            Both take out the first item in the line — the one that’s been waiting the longest.
                1. remove() gives an error if the queue is empty.
                2. poll() quietly returns nothing (null) if there’s nothing to remove.
         */
        requestQueue.remove(); // it will remove the first value inside the queue because Queue follows FIFO principla
        System.out.println("Request Queue: " + requestQueue);
        requestQueue.poll(); // it will do the same as well
        System.out.println("Request Queue: " + requestQueue);
//        requestQueue.remove(1); this will nothing because in Queue u can't pass index value to remove any element, but you can pass specific element value to be removed
        requestQueue.remove("Request 4");
        System.out.println("Request Queue: " + requestQueue);

        /*
        3. Peek (Viewing the Front Element)
            1. The peek() method lets you look at the first item in the queue without removing it.
            2. If the queue is empty, it just returns nothing (null) without causing an error.
         */

        requestQueue.add("Request 1");
        requestQueue.add("Request 2");
        System.out.println("Request Queue: " + requestQueue);
        System.out.println("Request Queue: " + requestQueue.peek());

        /*
        4. isEmpty (Checking if the Queue is Empty)
            1. The isEmpty() method helps you check if there’s anything in the queue.
            2. If the queue has no items left, it returns true. If there’s still something waiting, it returns false.
         */
        System.out.println("is the Queue empty? " + requestQueue.isEmpty());
    }
}
/*
# Summary of Key Points 📝:
    1. Queue Interface: A collection designed to hold elements before processing, following the FIFO principle.
    2. FIFO Principle: Ensures that the first element added is the first to be removed, maintaining order and fairness.
    3. Basic Operations:
            1. add(E element): Adds an element to the end of the queue.
            2. poll(): Removes and returns the front element of the queue, or returns null if the queue is empty.
            3. peek(): Retrieves the front element without removing it.
            4. isEmpty(): Checks if the queue is empty.
    4. Real-World Uses: Managing server requests, printer jobs, customer service requests, and task scheduling to maintain order and efficiency.
 */