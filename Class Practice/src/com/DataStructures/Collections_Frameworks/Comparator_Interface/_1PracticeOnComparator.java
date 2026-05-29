package com.DataStructures.Collections_Frameworks.Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/*
Q. Sort Integers in Descending Order Using Comparator:
    You are given a list of numbers. Your task is to sort them in descending order using the Comparator interface.
    This simple implementation demonstrates how you can customize the sorting logic using a Comparator.

    Your Task:
        1. Create a custom Comparator to sort integers in descending order.
        2. Use Collections.sort() with the custom Comparator.
        3. Display the sorted list of integers.

    Steps to Follow:
        1. Input:
            1. First, read an integer n, representing the number of integers.
            2. Next, read n space-separated integers.

        2. Output:
            1. Print the sorted list of integers in descending order.

    1. Sample Input:
            5
            1 3 2 5 4
    2. Sample Output:
            Integers sorted in descending order:
            5 4 3 2 1
 */
public class _1PracticeOnComparator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of integers (n)
        int n = sc.nextInt();
        // TODO: Create an ArrayList to store the integers
        ArrayList<Integer> list = new ArrayList<>();
        // TODO: Add integers to the ArrayList
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        // TODO: Sort the list using a custom Comparator
        // Here I use Anonymous Class Concept to use Comparator
        Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer a, Integer b) {
                        return b - a;
                    }
                }
        );

        System.out.println("Integers sorted in descending order:");
        for(Integer i : list) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
