package com.DataStructures.Collections_Frameworks.Map_Interface;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
/*
# LinkedHashMap:
    Let’s say you're building a shopping app. As users add items to their cart,
    they expect to see the items in the same order they added them — not shuffled around.
    While HashMap stores key-value pairs efficiently, it doesn’t maintain any order.

    This is where LinkedHashMap comes in.

    LinkedHashMap is like a neat list of labeled items — it stores data with a unique key (like a product ID),
    gives fast access to the value (like the product name), and remembers the order in which items were added.

Q1. What is LinkedHashMap?
Standard Definition
    LinkedHashMap is a Java class from the java.util package. It implements the Map interface and
    stores key-value pairs while maintaining the order of insertion.
 */
public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(101, "Mango");
        lhm.put(102, "Apple");
        lhm.putFirst(100, "Banana");
        lhm.putLast(104, "Papaya");

        System.out.println(lhm);

        Set objects=  lhm.entrySet();
        for(Object i : objects){
            System.out.println(i);
        }
    }
}
/*
# Key Features of LinkedHashMap:

    1. It remembers the order
    2. One key = one value
    3. It’s okay with nulls: You can add one key that’s null, and you can even have multiple null values. LinkedHashMap doesn’t mind.
    4. Fast and friendly ⚡
    5. Not made for teamwork (by default) 🧍
        1. If you're using LinkedHashMap in a program where many things are happening at once (like multiple threads),
        2. it won’t handle that safely unless you manage it properly.

# Common Operations with LinkedHashMap
    1. put()
        The put() method is like adding a new item to the shopping cart.
        If a user adds the same item again, the old one gets replaced with the new one.
        This method adds or updates key-value pairs in the LinkedHashMap.

            Map<Integer, String> cart = new LinkedHashMap<>();
            cart.put(1, "Notebook");
            cart.putFirst(2, "Pen");
            cart.putLast(3, "Water Bottle");

    2. get()
        The get() method is like checking what’s in a specific cart slot.
        It returns the value linked to the given key.

            String item = cart.get(2);
            System.out.println("Item in slot 2: " + item); // Output: Pen

    3. remove()
        The remove() method is like removing an item from the cart.

            cart.remove(3);
            System.out.println("Cart after removal: " + cart);

    4. containsKey()
        The containsKey() method checks if an item is still in the cart.

            boolean hasItem2 = cart.containsKey(2);
            System.out.println("Cart has item 2? " + hasItem2);

    5. keySet()
        The keySet() method gives you a list of all the item numbers — and keeps the same order they were added.

            Set<Integer> keys = cart.keySet();
            System.out.println("Item numbers in cart: " + keys);

    6. values()
        The values() method gives you all the item names in the cart — in the same order you added them.

            Collection<String> items = cart.values();
            System.out.println("Items in cart: " + items);

# Key Points to Remember:
    1. LinkedHashMap stores data in key-value pairs, just like HashMap.
    2. It remembers the order in which you added items — no shuffling.
    3. Keys must be unique, and values can repeat.
    4. Fast for adding, searching, updating, and removing items.
    5. Allows one null key and multiple null values.
    6. Not thread-safe by default, so be careful when using it in multi-threaded apps.
    7. Great for use cases like shopping carts, form submissions, and recent activity logs.

# Common Interview Questions & Answers:
    Q1: What is LinkedHashMap in Java?
    A: LinkedHashMap is a class that stores key-value pairs and remembers the order in which the keys were added.

    Q2: How is LinkedHashMap different from HashMap?
    A: HashMap does not keep any order of keys. LinkedHashMap keeps the insertion order, which is useful when order matters.

    Q3: Can LinkedHashMap have duplicate keys?
    A: No. If you add a key that already exists, it will simply update the old value.

    Q4: Can it store null values and null keys?
    A: Yes. It can store one null key and many null values.

    Q5: Is LinkedHashMap thread-safe?
    A: No, it’s not. If you’re using it in a program with multiple threads, you’ll need to add synchronization yourself.
*/













