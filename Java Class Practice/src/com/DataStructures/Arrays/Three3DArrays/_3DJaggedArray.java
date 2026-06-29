package com.DataStructures.Arrays.Three3DArrays;

import java.util.Scanner;

public class _3DJaggedArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of colleges");
        int coll =  obj.nextInt();

        int[][][] marks = new int[coll][][];

        for(int i = 0; i < marks.length; i++) {
            System.out.println("Enter the number of classes in college " +  (i+1) + ":");
            int cls =  obj.nextInt();
            marks[i] = new int[cls][];
            for(int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter the number of students in class " + (j+1) + " of college " + (i+1));
                int s =  obj.nextInt();
                marks[i][j] = new int[s];
            }
        }
        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                for(int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("Enter the marks of student " + (k+1) + " of class " + (j+1) + " of college " + (i+1) + ":");
                    marks[i][j][k] = obj.nextInt();
                }
            }
        }

        System.out.println("The marks of students are");
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
