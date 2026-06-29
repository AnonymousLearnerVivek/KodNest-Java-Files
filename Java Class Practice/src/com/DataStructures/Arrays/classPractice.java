package com.DataStructures.Arrays;

public class classPractice {
    public static void main(String[] args) {
        System.out.println("1D Array:");
        int[] arr1 = {10,20,30,40,50};
        for(int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("2D Array:");
        int[][] arr2 = {{10,20,30}, {40, 50, 60}};
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("2D Jagged Array:");
        int[][] arr3 = {{10,20,30}, {40, 50, 60, 70}};
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("3D Array:");

        int[][][] arr4 = {{{10, 20, 30}, {40,50,60}}, {{100,200,300}, {400,500,600}}};
        for(int i = 0; i < arr4.length; i++){
            for(int j = 0; j < arr4[i].length; j++){
                for(int k = 0; k < arr4[i][j].length; k++){
                    System.out.print(arr4[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("3D Jagged Array:");
        int[][][] arr5 = {{{10, 20}, {40,50,60}}, {{100,200}, {400,500,600}, {121,2323,32,43}}};
        for(int i = 0; i < arr5.length; i++){
            for(int j = 0; j < arr5[i].length; j++){
                for(int k = 0; k < arr5[i][j].length; k++){
                    System.out.print(arr5[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
