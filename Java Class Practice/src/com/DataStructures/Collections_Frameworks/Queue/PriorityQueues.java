package com.DataStructures.Collections_Frameworks.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
/*
# PriorityQueue:
    In Java, a PriorityQueue is like a smart line. Instead of serving people in the exact order they arrive,
    it looks at who is more important and moves them forward. So, the most important tasks or people
    are handled first — even if they arrived later.

Q1. What Exactly is a Priority Queue?
Standard Definition:
    A PriorityQueue is a special kind of queue in Java where each item has a priority, and the item with
    the highest (or lowest Element) priority is served first, not necessarily the one that came first.

# Priority-Based Processing:
    1. Natural Ordering: If the elements have a natural order (like integers or strings),
                         Java’s PriorityQueue will use that to determine priority.
    2. Custom Comparator: You can provide your own logic to determine the priority of elements.
                          Imagine you’re assigning VIP passes not based on who paid more,
                          but on who’s been waiting the longest!
 */
public class PriorityQueues {
    public static void main(String[] args) {
        // PriorityQueue follow Min Heap Binary Tree Data Structure
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(175);
        pq.add(125);
        pq.add(25);
        pq.offer(75);
        pq.offer(50);
        // object with the highest priority will be the first one or for the lowest element
        // it will print elements in layerd traversing method
        System.out.println(pq); // O/P is [25, 75, 50, 175, 100, 125] because it follows Min Heap Data Structure

        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder()); // here Higher Number will be higher priorities

    }
}
/*
# Summary of Key Points 📝:
    1. PriorityQueue is a queue that serves elements based on their priority rather than their order of insertion.
    2. Heap-Based: Elements are stored internally using a heap, making insertion and removal efficient.
    3. Flexible Prioritization: Can use natural ordering or a custom comparator to determine element priority.
    4. Efficient for Prioritizing Tasks: Great for applications like task scheduling, algorithms like Dijkstra's,
                                         and managing prioritized events.

# Common Interview Questions & Answers:

    Q1. What is a PriorityQueue in Java?
    Answer: A PriorityQueue is a special type of queue where each item has a level of importance, called priority.
            Instead of handling items in the order they were added, it handles the most important ones first.
            For example, in a hospital, serious patients are treated before minor ones — even if they arrived later.

    Q2. How is PriorityQueue different from a normal queue?
    Answer: A normal queue works on “first come, first served” — also called FIFO. But a PriorityQueue serves items
            based on importance. So, the most urgent or important item is handled first, not just the first one that came in.

    Q3. How does PriorityQueue know which item is more important?
    Answer: Java uses something called natural ordering (like numbers in ascending order or words in alphabetical order).
            You can also set your own rules using a comparator to decide what makes one item more important than another.

    Q4. When would you use a PriorityQueue in real life?
    Answer: You would use a PriorityQueue when some tasks need to be done before others — like handling emergency requests,
            scheduling important jobs, or finding the shortest path in a map. It’s useful whenever priority matters more than order.

    Q5. What happens if two items have the same priority in a PriorityQueue?
    Answer: If two items have the same priority, Java will decide based on the order they were added or based on
            how the internal sorting works. The behavior can vary depending on the type of data and how you define priority.

    Q6. Is PriorityQueue ordered like a regular list?
    Answer: No, it’s not. When you print a PriorityQueue, the items may not look sorted. That’s because it’s built like a heap,
            and it only guarantees that the most important item is always at the front — not that the whole queue looks sorted.
 */