package Sorting_Algorithm;

import java.util.Arrays;
import java.util.Scanner;
/*
Q1. What Is Bubble Sort?
    Bubble Sort is a sorting algorithm that repeatedly steps through the list, compares adjacent elements, and
    swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

Efficiency:
Time Complexity: O(n²) – Super simple, but not very fast, especially for large datasets.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
