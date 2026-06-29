package com.DataStructures.Collections_Frameworks.Map_Interface;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.WeakHashMap;
/*
# WeakHashMap and IdentityHashMap
    You’ve probably worked with maps like HashMap, LinkedHashMap, and TreeMap. They’re great when you want
    to store some data and get it back quickly — simple and fast.

    But sometimes, your app needs something a little different.

    Let’s say you’re building the backend for a food delivery app like Swiggy. You run into two real situations:
        1. You want to store temporary data, like a list of trending restaurants — and automatically
           remove it when it’s no longer needed.
        2. You have two restaurant objects that look the same, but you know they’re different in memory.
           You want to treat them as separate.

    This is where WeakHashMap and IdentityHashMap shine. They're not used every day, but when you need them,
    they're exactly the right tools for the job.

    WeakHashMap — A Self-Cleaning Map

Q1. What is WeakHashMap?
    WeakHashMap is a map that holds its keys weakly. That means if a key is no longer used anywhere else in the program,
    Java's garbage collector can remove that key and its value from the map — all by itself.

# Real-Life Analogy
    Imagine you’re keeping track of trending restaurants by writing their names on a whiteboard.
    But you use light pencil instead of a marker. If no one talks about a restaurant for a while,
    the name slowly fades away — you don’t have to erase it yourself.

    That’s how WeakHashMap works — if the key (like the restaurant name) isn’t used anywhere else,
    Java quietly removes it for you. No cleanup needed.

# When Would You Use It?
    1. When you want to keep some data only for a short time, like showing a list of trending restaurants for the day
    2. When the data should go away on its own once no one is using it anymore
    3. When you want to save memory without writing extra code to remove things manually

# Key Characteristics: WeakHashMap
    1. Automatic Cleanup: Removes entries if keys are no longer used, making it efficient for caching.
    2. No Strong References: Keys can be garbage collected since WeakHashMap doesn't hold strong references.
    3. Not Thread-Safe: Needs synchronization for use in multi-threaded environments.
 */
/*
# ✅ Advantages and ❌ Limitations: WeakHashMap
    What’s Good:
        1. Cleans up memory by itself: If a key isn’t used anymore, Java removes it for you. You don’t need to delete it manually.
        2. Perfect for short-term data: Great when you want to store something for a while and let it disappear when it’s no longer needed.

    Limitations:
        1. Entries can go away anytime: If a key becomes unused, its data might disappear — even if you didn’t expect it.
        2. Not safe to use in many places at once: If different parts of your program try to use it at the same time,
                                                   it could cause problems unless you handle it carefully.
 */
/*
# Key Points to Remember: WeakHashMap
    1. Stores key-value pairs like a normal map
    2. Keys are removed automatically if they're no longer used anywhere else in the program
    3. Great for temporary data like caching or session-based info
    4. Helps reduce memory usage without writing manual cleanup code
    5. Not safe to use in multiple threads at the same time unless you handle it properly

*/
public class WeakHashMapClass {
    public static void main(String[] args){
        Map<Object, String> restaurantCache = new WeakHashMap<>();
        Object key1 = new Object();
        restaurantCache.put(key1, "The Spicy Grill - Trending Today");

        System.out.println("Before GC: " + restaurantCache);
        key1 = null; // Remove strong reference to key1
        System.gc(); // Request garbage collection

        // Pause to let garbage collection work
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("After GC: " + restaurantCache);


        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("C");
        String s4 = new String("D");

        WeakHashMap<Integer, String> whm = new WeakHashMap<Integer,String>();
        whm.put(1000, s1);
        whm.put(2000, s2);
        whm.put(3000, s3);
        whm.put(4000, s4);

        System.out.println(whm);

        // After complete the program execution who call the Garbage collector internally -> it is JVM who will call it
        // but if in case In your program if you want to call the Garbage collector, You can also call it explicitly in the program

        System.gc(); // it will Run the Garbage Collector in the JVM
        for(int i = 0; i < 5000; i++){
            System.out.print(" "); // Wasting some time for Garbage collector
        }
        System.out.println();

        System.out.println(whm); // it will nothing in it here 
    }
}
/*
# Common Interview Questions & Answers:
    Q1: What is the purpose of WeakHashMap?
        It’s used to store data temporarily. If a key is no longer used, Java automatically
        removes the key-value pair to save memory.

    Q2: How is WeakHashMap different from HashMap?
        WeakHashMap removes entries automatically when keys are no longer referenced elsewhere.
        HashMap keeps entries until you remove them manually.

    Q3: What is IdentityHashMap used for?
        To store data where object identity matters. Even if two objects have the same content,
        they’re treated as different if they’re not the same instance.

    Q4: How does IdentityHashMap compare keys?
        It uses == (checks if they’re the same object in memory), unlike HashMap which uses .equals().

    Q5: Can WeakHashMap and IdentityHashMap have null keys?
        Yes. Both allow one null key.

    Q6: Are these maps thread-safe?
        No. You need to handle safety manually if you’re using them in multi-threaded code.
 */






