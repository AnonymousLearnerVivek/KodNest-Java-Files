package com.DataStructures.Collections_Frameworks.Map_Interface;

import java.util.IdentityHashMap;
import java.util.Map;

/*
# IdentityHashMap — When Identity Really Matters

Q1. What is IdentityHashMap?
    IdentityHashMap is a map that doesn’t check keys based on content, like other maps.
    Instead, it compares keys by identity — using == instead of .equals().

    That means two objects that look exactly the same are still considered different
    if they’re different in memory.

# Real-Life Analogy:
    1. Imagine two restaurants with the same name and menu: “Burger Haven.” One is in Delhi,
       the other in Bangalore. They might look the same, but they’re not the same place.
    2. IdentityHashMap sees that difference — and keeps both entries separate.

# When Would You Use It?
    1. When you want to keep track of the exact object, even if it looks the same as another one
    2. When your program needs to treat two similar-looking things as different, because they’re not the same in memory
    3. When you’re saving some extra info or settings for a specific object — and you don’t want it
       to get mixed up with others that look similar

# Key Characteristics: IdentityHashMap
    1. Reference-Based Comparison: Compares keys with == instead of equals(), meaning only identical instances match.
    2. Unique Instance Handling: It ignores equals() and hashCode(), focusing on object identity.
    3. Not Thread-Safe: If different parts of your program try to use the same map at the same time,
                        things can go wrong. You’ll need to add some extra steps to handle that safely.
 */
/*
# ✅ Advantages and ❌ Limitations: IdentityHashMap
    What’s Good:
        1. Checks if it’s the same object, not just the same content: Two things may look the same, but if they’re not
           the exact same object, IdentityHashMap treats them as different — which is exactly what you want in some cases.
        2. Keeps similar-looking items separate: Even if two keys have the same name or data, it doesn’t get confused —
           because it only cares if they’re the same object in memory.

    Limitations:
        1. Might feel strange at first: If you’re used to regular maps that match things based on content, this can be a little confusing.
        2. Not safe to use from many places at once: Just like WeakHashMap, if multiple parts of your code use it at the same time,
           you’ll need to handle it carefully.
 */
/*
# Key Points to Remember: IdentityHashMap
    1. Compares keys by reference (==), not by value or content
    2. Treats two identical-looking objects as separate if they’re different in memory
    3. Useful when tracking specific object instances, not just what they contain
    4. Behaves differently from regular maps — might be confusing at first
    5. Also not thread-safe by default

 */
public class IdentityHashhMapClass {
    public static void main(String[] args) {

        IdentityHashMap<String, Integer> list = new IdentityHashMap<String, Integer>();

        String s1 = new String("Dominos");
        String s2 = new String("Dominos");
        String s3 = new String("Dominos");
        String s4 = new String("Dominos");
        list.put(s1, 100);
        list.put(s2, 200);
        list.put(s3, 300);
        list.put(s4, 400);

        System.out.println(list);

        /*
        # IdentityHashMap Example
           Now imagine Swiggy wants to track specific instances of restaurant objects, ensuring each one is unique.
           An IdentityHashMap is perfect for this.
         */
        Map<String, String> restaurantMap = new IdentityHashMap<>();
        String restaurant1 = new String("Burger Haven");
        String restaurant2 = new String("Burger Haven");

        restaurantMap.put(restaurant1, "Rating: 4.5");
        restaurantMap.put(restaurant2, "Rating: 4.7");

        System.out.println("IdentityHashMap: " + restaurantMap);
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
