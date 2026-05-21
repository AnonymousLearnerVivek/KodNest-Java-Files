package com.DataStructures.Strings;

import java.util.Scanner;
/*
Problem Statement:
    String Rotation Check:
        Write a Java program that checks if one string is a rotation of another string. Your program should:
        Ask the user to input two strings.
        Check if the second string is a rotation of the first string.
        Print whether or not the second string is a rotation of the first string.

        Sample Input:
            HelloWorld
            WorldHello
        Sample Output:
            The string 'WorldHello' is a rotation of 'HelloWorld'.
 */

public class _3PracticeQuestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // Step 1:
        // Rotation strings must have same length

        if(str1.length() == str2.length()) {

            // Step 2:
            // Double the first string

            String doubled = str1 + str1;

            // Step 3:
            // Check if second string exists inside doubled string
            if(doubled.contains(str2)) {

                System.out.println("The string \'" + str2 + "\' is a rotation of \'" + str1 + "\'.");

            }
            else {

                System.out.println("The string \'" + str2 + "\' is NOT a rotation of \'" + str1 + "\'.");
            }
        }
        else {
            System.out.println("The strings are of different lengths.");
        }
        scanner.close();
    }
}
/*
CONCEPT:
A string rotation means shifting characters circularly.

Example:
        "abcde" rotations are:
            abcde
            bcdea
            cdeab
            deabc
            eabcd

Observation: If we concatenate the original string with itself:
    "abcde" + "abcde" = "abcdeabcde"

    Then all possible rotations of the string
    will appear as a substring inside the doubled string.

Example:
    "deabc" exists inside "abcdeabcde"

So If:
    1. Both strings have same length
    2. The second string exists inside (str1 + str1)

Then the second string is a rotation of the first string.

Logic:
    (str1 + str1).contains(str2)

Time Complexity:
    O(n)

*/