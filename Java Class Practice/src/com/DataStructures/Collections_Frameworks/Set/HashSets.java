package com.DataStructures.Collections_Frameworks.Set;

import java.util.HashSet;
import java.util.Set;

/*
# HashSet
    Getting Started with HashSet in Java

    In the previous topic, we discussed TreeSet, a collection that stores unique elements in a sorted order.
    While TreeSet is ideal when both uniqueness and order matter, not every application needs sorting.

    Sometimes, all you need is a quick way to store items while making sure there are no duplicates—without
    worrying about the order in which they're stored or retrieved.

    That’s where HashSet comes in.

Q1. What Actually is HashSet?
Standard Definition
    HashSet is a class in Java that implements the Set interface and is backed by a hash table.
    It stores values in no particular order and does not allow duplicates. HashSet is part of the java.util package.

# In Simple Terms:
    HashSet is like a fast, automatic checklist.
    Every time you try to add something:
        1. Java checks if it’s already on the list
        2. If it’s not there, it gets added
        3. If it’s already there, it’s ignored — no errors, no duplicates
    Unlike a list, HashSet doesn’t care about the order of the items. It simply makes sure that
    each item is unique and can be found quickly when needed.
    It’s ideal when you want to store data that must not repeat, and you don’t need to sort it.

Q2. How Does HashSet Work Internally?
    HashSet uses a hashing mechanism to store items. Behind the scenes, it places each element
    into a "bucket" based on its hash code — a number generated from the item’s value.

    When you add an item:
    1. Java checks its hash code
    2. If the item doesn’t already exist in that bucket, it’s added
    3. If it does, the new item is ignored (because it's a duplicate)

    This is what allows HashSet to provide quick performance, even with large amounts of data.
 */
public class HashSets {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        //Hashset class works on algorithm known as Hashing Algorithm, there is a method inside Hashing algorithm known as Hash Method
        // Hash Method have one operation known as mod 10
        // HashSet store data in hash Table which has containers known as buckets and it stores single value
        hs.add(100);
        hs.add(50);
        hs.add(25);
        hs.add(175);
        hs.add(125);
        hs.add(150);
        hs.add(75);
        hs.add(125); // will not allow duplicate

        System.out.println(hs); // You cannot predict order of output of the hashset

        // Create a HashSet of strings
        Set<String> techTools = new HashSet<>();

        // Adding elements to the HashSet
        techTools.add("Git");
        techTools.add("Docker");
        techTools.add("Kubernetes");
        techTools.add("Git"); // Duplicate element, will not be added

        // Display the elements (order may vary)
        System.out.println("Tech Tools: " + techTools);

        // Removing an element
        techTools.remove("Docker");
        System.out.println("After removing Docker: " + techTools);

        // Checking if an element exists
        if (techTools.contains("Kubernetes")) {
            System.out.println("Kubernetes is in the tech tools set.");
        }
    }
}
/*
# Key Features of HashSet:
    Understanding the features of HashSet helps you decide when it’s the right choice
    for your program. Here’s what makes it unique:

    1. No Duplicate Values
        HashSet automatically avoids duplicates. If you try to add the same value again,
        it will be ignored. This makes it a reliable choice for storing data where
        repetition isn’t allowed, like usernames or email addresses.

    2. No Guaranteed Order
        Unlike lists or arrays, HashSet does not maintain the order in which items are added.
        The elements may appear in any order when you view them, and that order can change over time.

    3. Fast Operations
        Because HashSet is built on a hash table, it offers fast performance for common tasks like
        adding, removing, and checking if a value exists. This makes it efficient even when
        working with large amounts of data.

    4. Supports One Null Value
        HashSet allows a single null element. If you try to add more than one null,
        the additional ones will be ignored, just like duplicates.
 */
/*
# Real-Life Analogies for HashSet:
    1. Unique Voter List
        During an election, each eligible voter is registered only once. Even if someone tries to
        register again, the system prevents duplicate entries.
        # How it relates: HashSet ensures each entry (voter) is unique. Any repeated registration is silently ignored.

    2. Conference Check-In System
        At a tech conference, participants check in by scanning their badge. If someone scans twice,
        the system still only stores their name once.
        # How it relates: Just like HashSet, duplicates are not allowed. Each participant is
                          stored once regardless of how many times they check in.

    3. Inventory Management in Retail
        A retail store keeps track of which products are in stock. The store doesn’t need to track
        how many times a product was scanned—just that it exists in the system.
        # How it relates: HashSet tracks whether something is present or not, without worrying about how or when it was added.

# Summary of Key Points:
    1. HashSet is designed to store only unique values. If you try to add something that’s already there, it will be skipped automatically.
    2. The order of items is not guaranteed. You might add items in one order, but they may appear in a different order when you check them.
    3. It's fast and efficient. Whether you're adding, removing, or checking if something exists, HashSet handles it quickly in the background.
    4. It avoids clutter. HashSet helps you keep your data clean by automatically ignoring duplicate values — no extra code needed.
    5. Ideal for use cases where duplicates are not allowed. Perfect for things like storing usernames, emails, tags, and more
       — anywhere you just need to know if something is in the list or not.

# Common Interview Questions & Answers:

    Q1. What is HashSet in Java?
    Answer: HashSet is a class in Java used to store a collection of unique values. It does not allow duplicates,
            does not maintain any order, and provides fast access to data because it uses a hash table in the background.

    Q2. Can HashSet store duplicate values?
    Answer: No, HashSet does not allow duplicate values. If you try to add a value that already exists,
            Java will simply ignore it without throwing any error.

    Q3. Does HashSet maintain the order of elements?
    Answer: No, HashSet does not guarantee the order of elements. Items may appear in a different order
            than they were added, and this order can change every time you run the program.

    Q4. What happens if you add the same element twice in a HashSet?
    Answer: The second attempt to add the same element is ignored. HashSet ensures that each value appears only once.

    Q5. How does HashSet ensure fast performance?
    Answer: HashSet uses a hash table behind the scenes. When you add an item, Java calculates a hash code for it
            and places it in a specific "bucket." This allows quick operations like add, remove, and search.
 */