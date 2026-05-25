package com.DataStructures.Collections_Frameworks.Set;

import java.util.TreeSet;
/*
Q1. What Exactly Is TreeSet?
Standard Definition
    TreeSet is a class in Java that implements the Set interface and stores elements in sorted order,
    using a built-in system called a red-black tree.

# Key Characteristics of TreeSet:
    1. No duplicates allowed – just like any Set, each item appears only once
    2. Sorted automatically – items are always kept in natural order (like A–Z or 1–100)
    3. No index-based access – you can’t say "give me the second item"
    4. Works with Comparable values – like Strings, numbers, or anything that can be compared

Q3. How Does TreeSet Work?
    TreeSet has a smart system behind it that helps it do two things at once:
        1. It keeps your items in order (like A to Z or from smallest to biggest)
        2. It avoids duplicates (each item appears only once)

    When you add something to a TreeSet:
        1. It quietly checks if it’s already there
        2. If it’s new, it adds it in the correct position to keep everything sorted
        3. All of this happens automatically — you don’t need to write sorting code or worry about repeats.
 */
public class TreeSets {
    public static void main(String[] args) {
        // In the set interface duplicates are not allowed
        // TreeSet class store the Data in Balanced Binary tree structure
        /*
            Balanced Binary Tree is also known as RED BLACK BALANCED BINARY TREE ALGORITHM
            In Balanced Binary Tree: There is a rule to add data to be followed:
            1. always value of leftNode is less than the value of RootNode
                i.e, LeftNode < RootNode
            2. And always value of rightNode is greater than the value of rootNode
                i.e, RightNode > RootNode
         */
        // The moment you are keeping the data in TreeSet, By-Default They are sorted in ascending order

        TreeSet<Integer> ts = new TreeSet<>();
        //OR
//        Set<Integer> set = new TreeSet<>();
        ts.add(100);
        ts.add(200);
        ts.add(175);
        ts.add(50);
        ts.add(75);

        ts.add(100); //  Duplicates are not allowed it will only print single 100 // This will not show any error
        System.out.println(ts);
        System.out.println(ts.remove(175));
        System.out.println(ts);
        System.out.println(ts.contains(125));
        System.out.println(ts.first());
        System.out.println(ts.last());
    }
}
/*
# Summary of Key Points 📝:
    1. TreeSet is an implementation of the Set Interface that keeps elements sorted in natural or custom order.
    2. No Duplicate Elements: Like all sets, TreeSet doesn’t allow duplicates.
    3. Backed by Red-Black Tree: Ensures elements are always balanced, making operations efficient with O(log n) complexity.
    4. Great for Sorted Collections: Use TreeSet when you need data in a sorted format, like usernames, timestamps, or rankings.

# Common Interview Questions & Answers: TreeSet
    Q1. What is a TreeSet in Java?
    Answer: TreeSet is a class in Java that stores only unique items and keeps them automatically sorted in order.
            It belongs to the java.util package and implements the Set interface.

    Q2. What happens if you add a duplicate item to a TreeSet?
    Answer: It will not be added again. TreeSet checks for duplicates automatically and ignores them without any error.

    Q3. What type of sorting does TreeSet use?
    Answer: By default, TreeSet sorts items in natural order (like alphabetically for strings or numerically for numbers).
            But you can also provide a custom rule using a comparator if needed.

    Q4. Can TreeSet store null values?
    Answer: No, TreeSet does not allow null if you're working with objects that need to be compared. Adding null may cause an error.
 */





