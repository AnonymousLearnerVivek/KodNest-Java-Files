package com.DataStructures.Arrays.Two2DArrays;

/*
Q1. What Exactly is a Jagged Array?
Standard Definition:
    A jagged array is an array of arrays, where each element of the main array is itself an array,
    and these inner arrays can have different lengths. It’s different from a 2D array,
    where all rows must have the same number of columns.

# Key Points to Remember:
    1. Jagged Arrays: Arrays of arrays where the size of each row (sub-array) can be different.
    2. Flexible Memory Usage: Jagged arrays save memory by only allocating space for what is needed.
    3. Array Indexing: You can access elements using two indices—one for the row and one for the column.
    4. Declaration: First, declare the number of rows; then, each row can be dynamically initialized with different column sizes.
    5. Nested Loops: Use nested loops to access or print each element of a jagged array.
 */

import java.util.Scanner;
public class _2DJaggedArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of classes");
        int c = obj.nextInt();

        int[][] marks = new int[c][];

        for(int i = 0; i < marks.length; i++) {
            System.out.println("Enter the number of students in class " + (i+1));
            int s = obj.nextInt();
            marks[i] = new int[s];
        }
        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter the marks of student " + (j+1) + " of class " + (i+1));
                marks[i][j] = obj.nextInt();
            }
        }

        System.out.println("The marks of students are");
        for(int i = 0; i < marks.length; i++) {
            System.out.print("Class " + (i+1) + ": ");
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
# Common Interview Questions and Answers

    Q1. What is a jagged array in Java?
    Answer: A jagged array is an array of arrays where the rows can have different lengths.
            Unlike a 2D array, where all rows must have the same number of columns,
            jagged arrays allow each row to have a different number of columns.

    Q2. How do you declare a jagged array in Java?
    Answer: You declare a jagged array by defining the number of rows first, and
            then you define each row’s length separately. For example:
                int[][] jaggedArray = new int[3][];
                jaggedArray[0] = new int[2];  // First row has 2 elements
                jaggedArray[1] = new int[3];  // Second row has 3 elements
                jaggedArray[2] = new int[4];  // Third row has 4 elements

    Q3. What are the advantages of using jagged arrays over 2D arrays?
    Answer: Jagged arrays are more memory-efficient because each row can have a different number of elements.
            This allows for better space utilization, especially when dealing with non-uniform data.
            In contrast, 2D arrays require each row to have the same number of columns, which may result in wasted space.

    Q4. Can a jagged array be multidimensional in Java?
    Answer: Yes, a jagged array can be multidimensional. Each element in a jagged array can be another jagged array,
            allowing for multiple levels of jagged arrays.
 */