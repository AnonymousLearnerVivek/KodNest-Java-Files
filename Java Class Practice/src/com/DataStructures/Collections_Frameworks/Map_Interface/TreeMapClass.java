package com.DataStructures.Collections_Frameworks.Map_Interface;

import java.util.*;

/*
# TreeMap:
    Imagine you're building a billing system for a supermarket. Each product has a code like 101, 102, 103 — and
    you want the final bill to show the items sorted by product code (smallest to largest).

    Sure, HashMap and LinkedHashMap can store the data — but they don’t sort it. You’ll either get
    random order (HashMap) or the order in which items were added (LinkedHashMap).

    But what if you want it sorted automatically?

    That’s where TreeMap steps in. It stores key-value pairs and keeps the keys in sorted order — no extra work from your side!

Q1. What is TreeMap?
Standard Definition
    TreeMap is a class in Java (part of java.util) that implements the Map interface.
    It stores key-value pairs and automatically keeps the keys sorted in natural order (like numbers or alphabets).

# Key Features of TreeMap:
    1. Always keeps things sorted
    2. Each key must be different
    3. No null keys allowed: You can’t add a key that’s null. Java will throw an error.
                             But if your value is null, that’s perfectly fine.
    4. Slower than HashMap — but smarter
    5. Not safe when many things happen at once
 */
public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(101, "Mango");
        tm.put(102, "Apple");
        tm.put(100, "Banana");
        tm.put(104, "Papaya");

        System.out.println(tm);

        Set objects=  tm.entrySet();
        for(Object i : objects){
            System.out.println(i);
        }
/*
 # Key Methods of TreeMap:
    1. put() – Add or Update a Product
    2. get() – Find Out What an Item Is
    3. remove() – Take an Item Off the Shelf
    4. firstKey() – Get the First Item EX: System.out.println(products.firstKey()); // Output: 101
    5. lastKey() - Get the Last Item EX: System.out.println(products.lastKey()); // Output: 103
    6. higherKey() – What’s Next? EX: System.out.println(products.higherKey(101)); // Output: 102

 */
        Map<String, String> productMap = new TreeMap<>();

        productMap.put("Apples", "Price: ₹120/kg");
        productMap.put("Bananas", "Price: ₹40/dozen");
        productMap.put("Oranges", "Price: ₹90/kg");

        System.out.println("Sorted Product Map: " + productMap);

        // Retrieve a value
        String price = productMap.get("Bananas");
        System.out.println("Price for Bananas: " + price);

        // Remove a value
        productMap.remove("Apples");
        System.out.println("After removal: " + productMap);

    }
}
/*
# Key Points to Remember:
    1. TreeMap stores key-value pairs like HashMap, but it always keeps the keys sorted
    2. Doesn’t allow null keys, but values can be null
    3. Best used when you want your data to appear in sorted order automatically
    4. A little slower than HashMap, but it saves you from writing your own sorting code
    5. Not safe to use with multiple threads at once — unless you handle that manually

# Common Interview Questions & Answers

    Q1: What is TreeMap in Java?
    TreeMap is a type of Map that stores data in key-value pairs and always keeps the keys sorted.

    Q2: How is TreeMap different from HashMap?
    TreeMap keeps everything sorted by key. HashMap doesn’t care about the order at all.

    Q3: Can TreeMap have a null key?
    No, TreeMap doesn’t allow null keys. If you try to add one, you’ll get an error.

    Q4: Is TreeMap fast?
    It’s fast, but slightly slower than HashMap — because it takes time to keep things sorted.

    Q5: When should I use TreeMap?
    Use TreeMap when you want your data to always appear in order — like sorted names, roll numbers, dates, or product codes.
 */














