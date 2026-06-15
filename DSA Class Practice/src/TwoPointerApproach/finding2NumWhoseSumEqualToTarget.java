package TwoPointerApproach;

import java.util.Scanner;

public class finding2NumWhoseSumEqualToTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Target elemtent");
        int target = sc.nextInt();

        TwoPointerApproach(arr,target);

    }

    public static void TwoPointerApproach(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            int sum = arr[i] + arr[j];
            if(sum == target) {
                System.out.println(arr[i] + " " +  arr[j]);
                return;
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }
    }
}
