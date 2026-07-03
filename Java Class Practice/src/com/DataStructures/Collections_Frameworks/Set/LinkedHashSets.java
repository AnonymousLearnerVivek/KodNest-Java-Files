package com.DataStructures.Collections_Frameworks.Set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
# LinkedHashSet:
    When building a workshop sign-up system, we often face the challenge of handling users who accidentally submit the form more than once:
    we need to display everyone in the exact order they signed up, without any repeats. A simple List will preserve the order
    but allow duplicate names; a HashSet will prevent duplicates but discard the insertion order; and a TreeSet will both eliminate
    duplicates and sort the names alphabetically—still not what we want. The ideal solution is a LinkedHashSet, which guarantees that
    each name appears only once and that the original signup order is maintained.

Q1. What Exactly Is a LinkedHashSet? 💡
Standard Definition:
    A LinkedHashSet is a hash-based Set that remembers insertion order by linking its entries in a list.
    It gives you constant-time performance for basic operations, while guaranteeing no duplicates
    and preserving the order elements were added.
 */
public class LinkedHashSets {
    public static void main(String[] args) {
        // LinkedHasSet class Inherits HashSet class which implements Set interface
        // so no duplicates allowed
        // In LinkedHashSet it remembers the insertion order of an element by linking its entries in a list
        // LinkedHashSet is same as LinkedList, i.e. why it is called as combination of both HashSet and LinkedList
        /* Which means here also for every object a unique hash code will be generated along with that when it is storing
            those value it will also store the details of the next node where the next object is there, and
            it will also have the details of the previous objects node value
         */
        LinkedHashSet lhs1 =  new LinkedHashSet();

        lhs1.add(10);
        lhs1.add(400);
        lhs1.add(302);
        lhs1.add(200);
        lhs1.add(200); // will not be added
        System.out.println(lhs1);

        LinkedHashSet lhs2 =  new LinkedHashSet();
        lhs2.add(20);
        lhs2.add(30);
        lhs2.add(60);
        lhs2.add(70);
        System.out.println(lhs2);

//        lhs1.addAll(lhs2);
        lhs1.retainAll(lhs2);
        System.out.println(lhs1);

        // Create a LinkedHashSet of strings
        Set<String> techTools = new LinkedHashSet<>();
        // Adding elements to the LinkedHashSet
        techTools.add("Java");
        techTools.add("Spring");
        techTools.add("Docker");
        techTools.add("Java"); // Duplicate element, will not be added
        // Display the elements (order is maintained)
        System.out.println("Tech Tools: " + techTools);
        // Removing an element
        techTools.remove("Spring");
        System.out.println("After removing Spring: " + techTools);
        // Checking if an element exists
        if (techTools.contains("Docker")) {
            System.out.println("Docker is in the tech tools set.");
        }
    }
}
/*
# Let’s Understand the Key Characteristics:
    1. No Duplicate Elements: Like all sets, LinkedHashSet ensures that no duplicates are present. Each element must be unique.
    2. Maintains Insertion Order: Unlike HashSet, LinkedHashSet maintains the order in which elements were added. This means that
                                  if you iterate over a LinkedHashSet, you’ll get elements in the same order they were inserted.
    3. Efficient Performance: The performance of LinkedHashSet for adding, removing, and checking elements is slightly slower than HashSet,
                              but still very efficient (average time complexity of O(1)) due to its hash table.

Q2. Why Do We Need LinkedHashSet?
    1. Ensures Uniqueness: Like all Set implementations, LinkedHashSet stores only unique elements—duplicate entries are automatically ignored.
    2. Preserves Order: Unlike HashSet, LinkedHashSet maintains the order in which elements were added, making the data more predictable
                        and user-friendly.
    3. More Efficient Than TreeSet (When Sorting Isn’t Needed): While TreeSet also maintains order, it sorts elements, which can introduce
                                                                unnecessary processing. LinkedHashSet avoids this by preserving insertion order
                                                                without sorting.
    4. Ideal for Activity Tracking and History Logs: For example, in a student application like Kodnest, if you’re tracking which features
       a user interacts with, LinkedHashSet allows you to:
            1. Avoid repeated entries
            2. Maintain the exact sequence of actions
    5. Balanced Performance: It combines the speed of HashSet with the order-maintaining behavior of a list, offering a
                              practical middle ground for many use cases.

# Summary of Key Points 📝:
    1. LinkedHashSet ensures uniqueness like a HashSet but also keeps track of the order in which elements were added.
    2. No Duplicate Elements: Maintains only unique elements, ensuring no repetitions.
    3. Insertion Order Maintained: Elements are stored and iterated in the same order they were inserted.
    4. Efficient Operations: Average time complexity for basic operations is O(1).
    5. Use Cases: Ideal for maintaining a list of unique entries that also respects the order they were added,
       like sign-up sheets, caches, and user preferences.

# Common Interview Questions & Answers:
    Q1. What is a LinkedHashSet in Java?
    Answer: A LinkedHashSet is a hash-based Set implementation that maintains the insertion order of elements.
            It ensures no duplicates and returns elements in the order they were added.

    Q2. How does LinkedHashSet maintain insertion order?
    Answer: Internally, LinkedHashSet maintains a doubly-linked list along with the hash table.
            This linked list keeps track of the insertion sequence.

    Q3. How is LinkedHashSet different from HashSet?
    Answer: 1. Both avoid duplicates.
            2. HashSet does not preserve order.
            3. LinkedHashSet does preserve the order elements were inserted.

    Q4. When would you use LinkedHashSet over TreeSet?
    Answer: 1. When you care about insertion order but not natural sorting.
            2. TreeSet sorts elements (which is slower), while LinkedHashSet just remembers
               the order of insertion (faster if sorting isn’t needed).

# Common interview questions and Answers:
    Q1. How does LinkedHashSet prevent duplicates?
    Answer: It uses hashing to check if an item already exists. If the item is already in the set, it won’t be added again.

    Q2. How does it maintain the order of elements?
    Answer: It uses a doubly linked list internally to remember the order in which items were inserted.

    Q3. What is the time complexity of add(), remove(), and contains()?
    Answer: All three operations typically take O(1) time on average.

    Q4. Give a real-world example where LinkedHashSet is useful.
    Answer: In an app like Kodnest, when showing the list of recently viewed courses, we want no duplicates
            and the correct order of viewing. LinkedHashSet helps achieve this.

    Q5. What happens if you try to add a duplicate item?
    Answer: The duplicate is ignored, and the set remains unchanged.
 */