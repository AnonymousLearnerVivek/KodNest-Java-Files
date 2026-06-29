package com.DataStructures.Collections_Frameworks.Set;

import java.util.*;
/*
 # Implementation of TreeSet
    You are managing a tech stack of programming languages used by a company. Your task is to:
        1. Add new programming languages to the tech stack, ensuring the list is always sorted alphabetically.
        2. Remove languages from the stack.
        3. Check if a specific language is present in the tech stack.
        4. Print the first and last programming languages in alphabetical order.
        5. Print the entire stack in sorted order.
        6. Use a TreeSet to ensure no duplicates are added, and all operations maintain alphabetical order.

# Steps to Follow:

    Input:
        1. First, read an integer n, representing the number of operations.
        2. For each of the next n lines, read an operation, which will be one of the following:
        3. ADD language: Add the programming language language to the stack.
        4. REMOVE language: Remove the programming language language from the stack.
        5. CHECK language: Check if language is present in the stack.
        6. FIRST: Print the first language (alphabetically smallest).
        7. LAST: Print the last language (alphabetically largest).
        8. PRINT: Print all programming languages in sorted order.

    Output:
        1. For CHECK language, print YES if the language is in the list, otherwise print NO.
        2. For FIRST and LAST, print the language if there are any in the stack; otherwise, print NO LANGUAG
 */
/*
    Sample Input:
        1. 10
        2. ADD Java
        3. ADD Python
        4. ADD JavaScript
        5. CHECK Python
        6. REMOVE JavaScript
        7. CHECK JavaScript
        8. FIRST
        9. LAST
       10. PRINT
       11. REMOVE Java
    Sample Output:
        1. YES
        2. NO
        3. Java
        4. Python
        5. Java Python
 */
public class _3PracticeOnTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of operations
        int n = sc.nextInt();
        sc.nextLine();  // consume the newline

        // Implement TreeSet logic here
        TreeSet<String> list = new TreeSet<>();
        for(int i = 0; i < n; i++){
            String input = sc.nextLine();
            String[] parts = input.split(" ");

            switch(parts[0]) {
                case "ADD" -> list.add(parts[1]);
                case "REMOVE" -> list.remove(parts[1]);
                case "CHECK" -> System.out.println((list.contains(parts[1])) ? "YES" : "NO");
                case "FIRST" -> {
                    if(!list.isEmpty()) System.out.println(list.first());
                    else System.out.println("NO LANGUAGES");
                }
                case "LAST" -> {
                    if(!list.isEmpty()) System.out.println(list.last());
                    else System.out.println("NO LANGUAGES");
                }
                case "PRINT" -> {
                    if(!list.isEmpty()) {
                        for(String s : list){
                            System.out.print(s + " ");
                        }
                    } else {
                        System.out.println("NO LANGUAGES");
                    }
                }
            }
        }

        // Write your code here
    }
}