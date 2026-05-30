package com.DataStructures.Collections_Frameworks.Map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
# HashMap:
    Let’s say you’re building a food delivery app — something like Swiggy. Every restaurant in
    your app has a special number, like 101 or 102. That number is linked to the restaurant’s name,
    its ratings, and the kind of food it serves.

    Now imagine this: a user clicks on restaurant number 102. Your app needs to instantly show
    the correct details for that restaurant. You don’t want to go through a big list and
    check each one — that would be slow.

Q1. What you need is a simple way to say:
    “Give me the details for restaurant 102.”

    This is where HashMap becomes really useful. It helps you connect one thing to another,
    like an ID to a name — and lets you find it fast, without searching through everything.

Q1. What Exactly is HashMap?
Standard Definition
    HashMap is a class in Java, part of the java.util package. It implements the Map interface
    and stores data as key-value pairs. Keys must be unique, but values can be duplicated.
    Internally, it uses a hash table to make operations like add, search, and delete very fast.

 */
public class HashMapClass {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//        hm.add() // add() will not work here
        hm.put(1, "Ajay");
        hm.put(2, "Akash");
        hm.put(3, "Sachin");
        hm.put(4, "Virat");
        hm.put(5, "Akash");
//        hm.put(3, "Dhoni"); // it will update key 3 to value Dhoni
        hm.put(6, "Akash");
        System.out.println(hm); // output -> {1=Ajay, 2=Akash, 3=Sachin, 4=Virat, 5=Akash, 6=Akash}

        System.out.println(hm.get(2)); // .get(key) method will give the value at that key

//        Iterator iter = hm.iterator(); // Iteraotor will not work with for MAP interface, because Iterator is a part of Collections

        Set s = hm.entrySet(); // .entrySet() will returns a SET view of the mappings contained in the map

        Iterator ite1 = s.iterator();
        while (ite1.hasNext()) {
            System.out.print(ite1.next() + " ");
        }

        System.out.println(hm.containsKey(5)); // it will return true if this map contains a mapping for the specified key

        Set keys = hm.keySet(); // it will returns a Set view of the keys contained in this map.

        Iterator ite2 = keys.iterator();
        while (ite2.hasNext()) {
            System.out.print(ite2.next() + " ");
        }

        System.out.println();

        Collection values = hm.values(); // returns the List view of the values contains in the map
        Iterator ite3 = values.iterator();
        while (ite3.hasNext()) {
            System.out.print(ite3.next() + " ");
        }
        System.out.println();
        hm.remove(3); // it will remove the value and its return type is value's return type
        System.out.println(hm);

        System.out.println(hm.remove(4, "Virat")); //  it wll remove the value and its return type is Boolean
        System.out.println(hm);

        hm.clear(); // it will delete all the key value pair in the Map
        System.out.println(hm);

    }
}
/*
# Key Features of HashMap:
    1. Keys must be different
        In a HashMap, every key must be unique. If you try to add the same key again, it won’t give an error
        — it’ll simply update the old value with the new one.

    2. No fixed order
        HashMap doesn’t remember the order in which you added things. You might add items in one order,
        but when you check the data, the order might be completely different — and that’s normal.

    3. It allows nulls
        You can store one null key (meaning no key at all), and you can also store multiple null values.

    4. It’s really fast
        HashMap is made for speed. Whether you’re adding something, checking if it exists, or removing it
        — it does the job quickly, even if the data is large.

    5. Not safe for multi-threading
        If two parts of your program try to use the same HashMap at the same time, things can go wrong.
        So if you’re using it in multi-threaded code, you’ll need to add some safety measures on your own.
 */
/*
Q2. How Does HashMap Work Internally?
    Inside Java, HashMap has a smart way of organizing data. When you add a key (like a restaurant ID),
    Java turns that key into a number using something called a hash code. This number helps decide
    where the value should be stored.

    Here’s what happens:
        1. When you add something: Java checks the hash code and puts the value into a specific
                                   storage spot called a “bucket.”
        2. When you search for something: It uses the hash code to jump straight to that bucket
                                          and get the value — no need to check every entry.
        3. When you update something: It finds the same bucket and replaces the old value
                                      with the new one.
        4. When you remove something: It goes to the bucket and deletes that key-value pair.

    This smart way of organizing and accessing data is what makes HashMap so fast,
    even when you're working with a lot of data.
 */

/*
# Common Operations with HashMap:
1. put()
    The put() method is like adding a new restaurant to the database. For instance,
    if a new restaurant partners with Swiggy, you add it to the HashMap using the put() method,
    with the restaurant ID as the key and the details as the value.

    The put() method is used to add key-value pairs to the HashMap.
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Laptop", 1500);
        productMap.put("Phone", 800);
        productMap.put("Tablet", 400);

2. get()
    The get() method is similar to searching for a specific restaurant by its ID.
    When a user looks for details about a restaurant, the app uses get() to
    retrieve the information quickly.

    The get() method retrieves the value associated with a specific key.
        int price = productMap.get("Phone");
        System.out.println("Price of Phone: " + price);

3. remove()
    The remove() method is like a restaurant ending its partnership with Swiggy. When this happens,
    you use remove() to delete the restaurant's details from the HashMap.

    The remove() method removes the key-value pair for the specified key.
        productMap.remove("Tablet");

4. containsKey()
    The containsKey() method is like checking if a restaurant is still available on the app.
    It helps determine whether a specific restaurant ID exists in the system.

    The containsKey() method checks if a specific key exists in the HashMap.
        boolean hasLaptop = productMap.containsKey("Laptop");
        System.out.println("Contains Laptop: " + hasLaptop);

5. keySet()
    The keySet() method is like creating a list of all restaurant IDs available on Swiggy.
    It returns a set of all the keys, which in this case would be the unique IDs of each restaurant.

    The keySet() method returns a set view of all the keys in the HashMap.
        Set<String> keys = productMap.keySet();
        System.out.println("Keys: " + keys);

6. values()
    The values() method is like creating a list of all restaurant details, such as names, ratings, and cuisines.
    It returns a collection of all the values stored in the HashMap.

    The values() method returns a collection view of all the values in the HashMap.
        Collection<Integer> values = productMap.values();
        System.out.println("Values: " + values);

# 👍 Advantages and 👎 Limitations of HashMap:
    1. ✅ Advantages
        1. Quick to Find Things
        2. Flexible with Data
        3. Works Well for Large Data

    2. ❌ Limitations
        1. No Fixed Order
        2. Not Safe for Multiple Users at Once
        3. Uses More Memory
 */
/*

#📝 Key Points to Remember:

    1. HashMap stores data as key-value pairs, where each key is unique, and each key points to one value.
    2. Keys must be different, but values can be repeated.
    3. Adding the same key again will update its value, not create a duplicate.
    4. HashMap doesn’t keep things in order, so the items might not appear in the same order you added them.
    5. It allows one null key and multiple null values.
    6. Very fast for searching, adding, and removing data — even when the map is large.
    7. Not safe to use with multiple threads at the same time unless you manage it carefully.
    8. Useful for real-world tasks like:
        1. Looking up restaurant details by ID
        2. Storing quiz answers
        3. Keeping product info in a shopping cart
        4. Counting how many times something appears (like most-ordered dishes)

# Common Interview Questions & Answers
    Q1: What is a HashMap in Java?
    A: HashMap is a class in Java that stores data in key-value pairs. Each key must be unique,
       and it helps you quickly find the value linked to that key.

    Q2: Can a HashMap have duplicate keys?
    A: No. If you try to add a duplicate key, HashMap will replace the old value with the new one.

    Q3: Can values be repeated in a HashMap?
    A: Yes. Different keys can point to the same value.

    Q4: Does HashMap keep items in order?
    A: No. The order of keys or values is not maintained. The output order can be different
       from the insertion order.

    Q5: Is HashMap thread-safe?
    A: No. If multiple threads use the same HashMap at the same time, it can cause problems.
       You need to manage safety separately.
 */














