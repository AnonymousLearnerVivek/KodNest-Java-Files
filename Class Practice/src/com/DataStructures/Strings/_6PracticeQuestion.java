package com.DataStructures.Strings;

import java.util.Scanner;
/*
Problem Statement:
    Longest Palindromic Substring
        Write a Java program to find the longest palindromic substring in a given string. Your program should:
        Ask the user to input a string.
        Find and print the longest palindromic substring.
        If there are multiple substrings of the same maximum length, return any one of them.

    Sample Input:
        babad
    Sample Output:
        bab
 */
public class _6PracticeQuestion      {

    // Method to check palindrome
    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            // If characters don't match
            // then not palindrome
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input string
        String str = scanner.nextLine();

        // Store longest palindrome substring
        String longest = "";

        // Generate all substrings
        for(int i = 0; i < str.length(); i++) {

            for(int j = i; j < str.length(); j++) {

                // Extract substring
                String sub = str.substring(i, j + 1);

                // Check palindrome
                if(isPalindrome(sub)) {

                    // Update longest substring
                    if(sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        // Print answer
        System.out.println(longest);

        scanner.close();
    }
}