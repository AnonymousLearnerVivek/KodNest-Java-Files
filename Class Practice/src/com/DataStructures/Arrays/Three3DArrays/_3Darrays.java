package com.DataStructures.Arrays.Three3DArrays;

/*
Q1. What Exactly is a 3D Array?
Standard Definition:
    A 3D array is a data structure in which the elements are organized in three dimensions—rows, columns, and depth (layers).
    You can think of it as a collection of 2D arrays, each representing a "slice" of the 3D array.

Q2. Why Are 3D Arrays Important?
    3D arrays are helpful when you need to organize and manage data that has three dimensions.
    They allow you to store data in a way that would be difficult or inefficient with simpler arrays.

    Here are some examples where 3D arrays are useful:
    1. Games: Storing a 3D game world where the three dimensions could represent
              position in space (like x, y, and z coordinates).
    2. Medical Imaging: Storing 3D images, where each point in the image is represented
                        by three values (such as height, width, and depth).
    3. Time-series data: Storing data over time for multiple things, like tracking sales
                          for different stores and products over multiple years.
*/

import java.util.Scanner;
public class _3Darrays {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of Colleges");
        int coll = obj.nextInt();
        System.out.println("Enter the number of classes in each college");
        int cls = obj.nextInt();
        System.out.println("Enter the number of students in each classes");
        int s = obj.nextInt();

        int[][][] marks = new int[coll][cls][s];

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                for(int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("Enter the marks of student " + (k+1) + " of class " + (j+1) + " of college " + (i+1));
                    marks[i][j][k] = obj.nextInt();
                }
            }
        }
        System.out.println("The Marks of students are: ");
        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print("Class " + (j+1) + " of College " + (i+1) + ": ");
                for(int k = 0; k < marks[i][j].length; k++) {
                    System.out.print(marks[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/*
# Key Points to Remember:
    1. 3D Array: It’s an array of arrays of arrays. Use it when you need to store and manage data with three dimensions.
    2. Layer, Row, Column: The first index refers to the layer (depth), the second refers to the row, and the third refers to the column.
    3. Nested Loops: Use nested loops to access or print values in a 3D array—one loop for each dimension (layers, rows, columns).
    4. Fixed Size: The size of a 3D array is fixed once it is initialized. If you need more space, you must create a new array.

# Real World Usage of 3D Arrays:
    1. 3D Video Games: Storing and managing a game world made of blocks or objects in 3D space (like in Minecraft).
    2. Medical Imaging (MRI, CT Scans): Storing images from a 3D scan, where each slice shows a 2D picture of the body.
    3. Weather Forecasting: Tracking weather data (like temperature and humidity) in 3D across different places and times.
    4. Robotics Path Planning: Helping robots navigate and avoid obstacles by mapping the environment in 3D.
    5. 3D Image Processing (RGB values): Storing colors of images in a 3D format, with each pixel having a red, green, and blue value.

# Common Interview Questions and Answers:
    Q1. What is a 3D array in Java?
    Answer: A 3D array in Java is an array of arrays of arrays. It allows us to store data in three dimensions,
            and each element is accessed using three indices: one for the layer, one for the row, and one for the column.

    Q2. How do you declare a 3D array in Java?
    Answer: To declare a 3D array in Java, you use the syntax:
            dataType[][][] arrayName = new dataType[layers][rows][columns];
            For example: int[][][] array = new int[3][4][5];

    Q3. How do you access a value in a 3D array?
    Answer: You access a value in a 3D array using three indices—one for the layer, one for the row, and one for the column.
            For example: array[0][1][2]

    Q4. What is the advantage of using a 3D array over a 2D array?
    Answer: A 3D array is useful when you need to represent more complex data structures, such as storing data across
            multiple dimensions. A 2D array is limited to rows and columns, while a 3D array adds depth, which is
            helpful in scenarios like representing a 3D grid or time series data.
 */