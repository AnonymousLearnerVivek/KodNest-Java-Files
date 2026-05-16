package com.DataStructures.Arrays.One1DArrays;

import java.util.Scanner;

public class _1UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Array is Created");

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the marks of student " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Marks of students are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
# Common Interview Questions and Answers:

    Q1. What is the difference between a for loop and an enhanced for loop when traversing an array?
    Answer:
        1. For loop: Gives you access to both the index and the element, making it useful when you need
                     to perform operations involving the index or modify the array.
        2. Enhanced for loop: Simplifies the process of traversing an array when you only need to access
                              the elements and not their indices. It doesn’t require you to handle the loop index.

    Q2. How does a while loop work when traversing an array?
    Answer: A while loop can be used to traverse an array by manually controlling the index.
            The loop continues as long as the index is less than the length of the array.
            You increment the index inside the loop to access each element sequentially.

    Q3. What is Java Streams, and how do you use it to traverse an array?
    Answer: Java Streams provide a functional approach to array traversal, allowing you to perform operations
            like filtering, mapping, or iterating. You can convert an array into a stream using Arrays.stream()
            and then apply methods like forEach() to process each element.

    Q4. When would you use a for loop over an enhanced for loop?
    Answer: You would use a for loop when you need access to the index of the array elements.
            This is useful when you need to perform operations based on the position of elements
            or modify the array based on the index.
 */
/*
# Common Interview Questions and Answers:

    Q1. What is the purpose of using the Scanner class in Java?
    Answer: The Scanner class is used to capture input from the user. It allows the program to read various types of input,
            such as integers, strings, and floating-point numbers, from the console or other input sources.

    Q2. How do you take user input for an array in Java?
    Answer: To take user input for an array in Java, we declare and initialize the array first. Then, we use a loop (usually a for loop)
            along with the Scanner class to collect values from the user. The input is then stored in the array using the array index.

    Q3. Can you explain the importance of array indexing in Java?
    Answer: Array indexing in Java starts at 0, meaning the first element of the array is accessed using index 0, the second element
            with index 1, and so on. This is important for correctly storing and retrieving elements from the array.
            It's a key concept when looping through arrays.
 */
