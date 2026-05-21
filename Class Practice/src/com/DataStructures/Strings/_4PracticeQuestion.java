package com.DataStructures.Strings;

import java.util.*;
/*
    Longest Substring Without Repeating Characters
        Write a Java program that finds the length of the longest substring without repeating characters. Your program should:
        Ask the user to input a string.
        Determine the length of the longest substring without repeating characters.
        Print the length.

     Sample Input:
            abcabcbb
     Sample Output:
            The length of the longest substring without repeating characters is: 3
 */
public class _4PracticeQuestion{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int maxLength = 0;

        // Pick starting point
        for(int i = 0; i < str.length(); i++) {

            String temp = "";

            // Build substring
            for(int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                // If duplicate found, stop
                if(temp.contains(ch + "")) {
                    break;
                }

                // Add character
                temp = temp + ch;

                // Update maximum length
                maxLength = Math.max(maxLength, temp.length());
            }
        }

        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);

        scanner.close();
    }
}
