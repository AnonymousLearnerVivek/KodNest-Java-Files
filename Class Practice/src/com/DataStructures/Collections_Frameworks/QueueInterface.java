package com.DataStructures.Collections_Frameworks;

import java.util.LinkedList;
import java.util.Queue;

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

            Example to remember:
            It’s like waiting in line for a burger. When it’s your turn, you get your order. But if you reach the front and the burgers are all gone:
                 1. poll() politely says, “Sorry, nothing left.”
                 2. remove() reacts strongly and throws an error.
         */
        requestQueue.remove(); // it will remove the first value inside the queue because Queue follows FIFO principla
        System.out.println("Request Queue: " + requestQueue);
        requestQueue.poll(); // it will do the same as well
        System.out.println("Request Queue: " + requestQueue);
//        requestQueue.remove(1); this will nothing because in Queue u can't pass index value to remove any element, but you can pass specific element value to be removed
        requestQueue.remove("Request 4");
        System.out.println("Request Queue: " + requestQueue);
    }
}
