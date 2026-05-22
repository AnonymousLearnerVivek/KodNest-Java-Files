package com.DataStructures.Collections_Frameworks;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
/*

 */
public class IterableInterface {
    public static void main(String[] args) {
        // Iterator is an Abstract class so we cannot create the object of it, but we can create the reference variable of it
        // Create an ArrayList of strings
        ArrayList<String> students = new ArrayList<>();

        // Add elements to the ArrayList
        students.add("Aarav");
        students.add("Diya");
        students.add("Kabir");
        students.add("Anika");
        System.out.println(students);
        // Get the iterator for the ArrayList
        Iterator<String> iterator = students.iterator();
        while(iterator.hasNext()) {    // .hasNext() method has return type boolean true/false
            System.out.println(iterator.next()); // .next() method has return type as Object so it will return the element
        }
    }
}
/*
Iterable Interface
    In Java, this kind of step-by-step access is made easy with something called the Iterable interface.

    The idea is simple: if something (like a list or set) is “Iterable,” it means you can look at all its items,
    one after another, without needing to know how they are stored inside.

    The Iterable interface makes this possible by giving us a way to move through every item in a collection,
    just like turning the pages of a book. And the best part? You don’t have to write complicated code.
    You can just use a for-each loop to visit each item.

Q1. What is the Iterable Interface? 🤔
Standard Definition:
    The Iterable interface is a part of Java's core library, located in java.lang. It represents a collection that can be traversed,
    meaning you can visit each element one by one in sequence.
    The Iterable interface only contains a single abstract method:
        Iterator<T> iterator(): This method returns an Iterator object that provides the mechanism for iterating over elements in the collection.

    Key Role: Once a class implements the Iterable interface, it can be used with a for-each loop,
                    providing a more readable and cleaner way to access collection elements

# The Role of Iterable in Collections:
    All major collection classes like List, Set, Queue, etc., implement the Iterable interface.
    This means they all provide a way to access their elements sequentially,
    which makes traversing these collections straightforward.

Q2. How Iterable Works
    The Iterable interface only provides a single method:
    Iterator<T> iterator();
        Returns an Iterator: This method returns an Iterator, which provides the mechanism to traverse elements one by one.

    Works with Enhanced For-Loop: Once iterator() is implemented, the enhanced for-loop can be used to iterate through the elements,
                                   providing a clean and easy way to access items.

# Key points to remember :
    1. Iterable Interface: This allows you to go through the elements of a collection one at a time, in an orderly way.
    2. Core Method: The main method, iterator(), returns an object that helps you access the elements one by one.
    3. Enhanced For-Loop: Once a collection implements Iterable, you can use it with the simpler for-each loop,
                           making the code easier to read and write.
    4. Custom Collections: If you create your own collection and make it implement Iterable, it can be used just
                            like Java’s built-in collections, allowing easy element traversal.

# Common Interview Questions and Answers:

Q1. What’s the role of the Iterable interface in Java?
Answer: The Iterable interface provides a way to systematically traverse the elements of a collection.
        It allows collections to be used with the enhanced for-loop, making traversal easier and more intuitive.

Q2. What’s the difference between Iterable and Iterator?
Answer: Iterable is an interface that represents a collection that can be traversed,
        while Iterator is used to actually perform the traversal,
        providing methods like hasNext() and next().

Q3. Can you implement Iterable in custom collections?
Answer: Yes, you can implement Iterable in custom collections, allowing them to be
        traversed like any standard Java collection, using the for-each loop.

 */