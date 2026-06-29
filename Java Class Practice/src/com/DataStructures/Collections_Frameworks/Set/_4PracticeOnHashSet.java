package com.DataStructures.Collections_Frameworks.Set;

import java.util.HashSet;
import java.util.Scanner;
/*
Q1. Find the Longest Consecutive Sequence in an Array Using HashSet
    Imagine you are analyzing daily temperature readings over a period of time. Some days have
    consecutive temperature increases (e.g., 70, 71, 72), and you want to find the longest
    consecutive increase in temperature. Similarly, in this problem, you are given an array of integers,
    and your task is to find the longest consecutive sequence of integers in the array.

    Task:
    Write a program that finds the longest sequence of consecutive integers in an unsorted array.
    The sequence must be made up of consecutive numbers (e.g., 1, 2, 3, 4).

    Input Format:
        The first input is an integer n (the number of elements in the array).
        The second input is n space-separated integers representing the elements of the array.

    Output Format:
        Print the length of the longest consecutive sequence in the array.

    Sample Input:
        5
        10 5 12 6 11
    Sample Output:
        3
 */
public class _4PracticeOnHashSet  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of elements in the array (n)
        int n = sc.nextInt();
        // TODO: Use a HashSet to store unique elements
        HashSet<Integer> list = new HashSet<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        // TODO: Find the longest consecutive sequence
        int longest = 0;

        // Traverse through HashSet
        for(Integer i : list) {
            // Check if current number is starting point
            if(!list.contains(i - 1)){
                int currentNum = i;
                int count = 1;

                // Count consecutuce Numbers
                while(list.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);

        sc.close();
    }
}