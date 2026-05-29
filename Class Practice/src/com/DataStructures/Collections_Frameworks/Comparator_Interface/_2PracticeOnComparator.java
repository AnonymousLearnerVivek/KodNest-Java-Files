package com.DataStructures.Collections_Frameworks.Comparator_Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/*
# Sort a List of Strings in Ascending Order Using Comparator:

    Imagine you're organizing a bookshelf in a library where each book is labeled by its title. Your goal is to sort the titles in alphabetical order
    to make it easier for people to find books quickly. Sorting in alphabetical order ensures the list is structured, just like arranging books on a shelf from A to Z.

    In this task, you are given a list of strings, which could represent book titles, names, or any text-based data. Your job is to sort these strings
    in ascending order (alphabetically) using the Comparator interface.

    Your Task:
        1. Create a custom Comparator to sort strings in ascending order.
        2. Use Collections.sort() with the custom Comparator.
        3. Display the sorted list of strings.

    Steps to Follow:
        Input:
            1. First, read an integer n, representing the number of strings.
            2. Next, read n space-separated strings.

        Output:
            1. Print the sorted list of strings in ascending order.

    Sample Input:
            3
            banana
            apple
            cherry
    Sample Output:
            Strings sorted in ascending order:
            apple
            banana
            cherry
 */
public class _2PracticeOnComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of strings (n)
        int n = sc.nextInt();
        // TODO: Create an ArrayList to store the strings
        ArrayList<String> list = new ArrayList<>();

        // TODO: Add strings to the ArrayList
        for(int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        // TODO: Sort the list using a custom Comparator
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return a.compareTo(b);
//            }
//        });

        // Here I use Lambda Expression to use Comparator class

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("Strings sorted in ascending order:");
        for(String i : list) {
            System.out.println(i);
        }
        sc.close();
    }
}

