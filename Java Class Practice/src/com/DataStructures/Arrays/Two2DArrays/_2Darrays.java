package com.DataStructures.Arrays.Two2DArrays;


/*
Q1. What Exactly is a 2D Array? 💡
Standard Definition:
    A 2D array is an array of arrays. It consists of multiple rows, with each row being an array.
    This allows us to represent data in a tabular or matrix form. In a 2D array, data is stored
    in both rows and columns, and each element is accessed using two indices: one for the row and one for the column.

# Key Points to Remember:
    1. Array Size: A 2D array has both rows and columns. You need to specify both when declaring it.
    2. Accessing Elements: Use two indices to access elements—one for the row and one for the column.
    3. Nested Loops: Use nested loops (one for rows and one for columns) to traverse and print the array.
    4. Fixed Size: The size of a 2D array is fixed once initialized. If you need a larger array, you’ll have to create a new one.

# Real-Life Applications:
    1. Storing student marks for multiple subjects
    2. Representing a chessboard or game grid
    3. Storing matrix data in mathematics
    4. Keeping data for booking movie seats (rows and columns)
    5. Representing pixel data in image processing
 */
import java.util.Scanner;

public class _2Darrays {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of classes");
        int c = obj.nextInt();
        System.out.println("Enter the number of Students in each class");
        int s = obj.nextInt();

        int[][] marks = new int[c][s];

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter the marks of student " + (j+1) + " of class " + (i+1));
                marks[i][j] = obj.nextInt();
            }
        }

        System.out.println("The marks are");
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
# Common Interview Questions and Answers:

    Q1: What is a 2D array in Java?
    Answer: A 2D array is an array of arrays. It allows you to store data in a tabular format with rows and columns.
            In Java, it is declared using two sets of square brackets, for example: int[][] marks = new int[3][4];,
            which means 3 rows and 4 columns.

    Q2: How do you access an element in a 2D array?
    Answer: To access an element in a 2D array, you use two indices: one for the row and one for the column.
            For example, marks[0][1] will access the element at the first row and second column.

    Q3: What are the key differences between 1D and 2D arrays?
    Answer:
        1. A 1D array is a single list of elements, and you access its elements using one index.
        2. A 2D array is an array of arrays, where each element is another array. You need two indices
           to access its elements: one for the row and another for the column.

    Q4: How do you initialize a 2D array in Java?
    Answer: You can initialize a 2D array by specifying its size or by directly assigning values. For example:
            1. Size-based initialization: int[][] marks = new int[3][4];
            2. Value-based initialization: int[][] marks = {{85, 90, 78, 88}, {88, 92, 84, 91}, {75, 80, 70, 85}};
 */
