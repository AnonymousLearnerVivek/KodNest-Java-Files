package com.DataStructures.Collections_Frameworks.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
# ArrayDeque - it can like a Queue also, and it can like a Stack also

    A regular queue only lets you add at the back and remove from the front. That’s helpful,
    but what if you want to add or remove items from both sides of the list? That’s where
    ArrayDeque comes in — it gives you the power to manage both ends of the line.

Q1. What Exactly is ArrayDeque?
Standard Definition:
    ArrayDeque is a class in Java that allows you to add and remove items from both the front and the back of the collection.
    It stands for Array Double Ended Queue and is part of the Java Collections Framework.

Q2. Why Is ArrayDeque Important?
    Here’s why ArrayDeque is super useful in real-world programming:
        1. You can add and remove items from both ends easily.
        2. It’s faster than older options like LinkedList or Stack.
        3. It helps keep your code clean, fast, and efficient when dealing with ordered tasks or history-based actions.

Q3. How Does ArrayDeque Solve the Problem?
    Let’s take a real example: you’re building a task manager.
        1. You want to add urgent tasks to the front of the list.
        2. Normal tasks go to the end.
        3. As tasks are completed, you remove them from the front.
        4. In some cases, you might need to cancel the last-added task — from the end.

    With a normal queue, you’d be stuck. But with ArrayDeque, all of this becomes simple —
    no manual rearranging, no shifting items. Just use the right method, and it works.
 */
public class ArrayDeques {
    public static void main(String[] args) {
        Deque<Integer> arr = new ArrayDeque<>(); // ArrayDeque class implement Deque Interface

        /*
        1. Adding Elements
            1. Method: addFirst(E element) or addLast(E element)
            2. Purpose: Adds an element to either the front or the back of the deque.
         */
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        arr.addLast(40);
        System.out.println(arr);
        arr.addFirst(50);
        System.out.println(arr);


        /*
        2. Removing Elements
            1. Method: removeFirst() or removeLast()
            2. Purpose: Removes and returns an element from either the front or the back of the deque.
         */
        arr.remove(); // it will remove the first element 50
        System.out.println(arr);
        arr.removeLast();
//        arr.pollFirst(); // we can also use this functions also
        arr.pollLast();
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);

        /*
        3. Peek (Viewing Elements Without Removing)
            1. Method: peekFirst() or peekLast()
            2. Purpose: Views, but does not remove, the element at either end of the deque.
         */
        System.out.println(arr.peek()); // By-Default it will peek the first element
        System.out.println(arr.pollFirst());
        System.out.println(arr.pollLast());
    }
}
/*
# Double-Ended Functionality:
    With an ArrayDeque, you can put or take things from both the front and the back — like
    choosing to join the front of a burger line or quietly getting in at the end.
        1. Add Elements: You can add elements at both the head and tail of the deque
                         using addFirst() and addLast() respectively.
        2. Remove Elements: You can also remove elements from both ends using removeFirst() and removeLast().
                            This allows ArrayDeque to act both as a stack (LIFO) and a queue (FIFO).
 */
/*
#Summary of Key Points 📝:
    1. ArrayDeque is a resizable array implementation of the Deque interface, which supports adding or removing elements from both ends.
    2. Double-Ended Flexibility: Acts as both a stack and a queue, providing flexibility in managing elements.
    3. No Capacity Restrictions: It grows automatically, meaning you won’t run into annoying size limitations.
    4. Faster Than LinkedList and Stack: More efficient when adding and removing elements due to less overhead.

# Common Interview Questions and Answers:

    Q1. What is an ArrayDeque in Java?
    Answer: ArrayDeque is a special type of list in Java that lets you add or remove items from both the front and the back.
            It’s called a “double-ended queue” because it works like a line that has two open sides — you
            can use it like a queue or a stack depending on what you need.

    Q2. How is ArrayDeque different from a regular Queue?
    Answer: 1. A regular queue only lets you add to the end and remove from the front — like standing in line.
            2. ArrayDeque lets you add or remove from both the front and the back, giving you more control and flexibility.

    Q3. When should I use ArrayDeque instead of ArrayList or LinkedList?
    Answer: Use ArrayDeque when you:
            1. Want to add or remove items from both ends of a list
            2. Need something faster and more memory-efficient than LinkedList
            3. Want a replacement for older structures like Stack or Queue in one single class
        Avoid using it if you need to access items in the middle often — ArrayList is better for that.

    Q4. Is ArrayDeque better than Stack? Why?
    Answer: Yes, in most cases. Java recommends using ArrayDeque instead of Stack,
            because:
                1. Stack is older and slower due to extra locking
                2. ArrayDeque is faster and has cleaner methods for adding/removing items

    Q5. What happens if you use removeFirst() on an empty ArrayDeque?
    Answer: If the deque is empty, and you call removeFirst(), Java will throw an error.
            To avoid this, it’s better to use pollFirst() — it will safely return null instead of crashing.
 */











