package Sorting_Algorithm.SelectionSort;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Select sort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Select sort: " + Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for(int i = 0; i <= arr.length - 2; i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j = i+1; j <= arr.length - 1; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
