import java.util.Scanner;

public class _33SearchInArray {
    public static void main(String[] args){

        // How to SEARCH through the elements of an ARRAY

//        int[] numbers = {1, 2, 3, 4, 7, 8};
//        int target = 9;
//        boolean isFound = false;

//        for(int i = 0; i < numbers.length; i++){
//            if(target == numbers[i]){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }

        Scanner obj = new Scanner(System.in);
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;


        System.out.print("Enter a fruit to search for: ");
        target = obj.nextLine();


        for(int i = 0; i < fruits.length; i++){
            if(target.equals(fruits[i])){ // if we are comparing strings then we need to use .equals() method becuz strings are reference data type
                // so if we use == for comparing then we end up comparing the 2 different memory addresses/ references
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");

        }
        obj.close();
    }
}
