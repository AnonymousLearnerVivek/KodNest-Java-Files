import java.util.Arrays;

public class _31Arrays {
    public static void main(String[] args){

        // Array = a collection of values of the same data type
        //        * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};

//        fruits[0] = "pineapple";
//        int numOfFruits = fruits.length;
        Arrays.sort(fruits);
//        Arrays.fill(fruits, "pineapple"); // will fill all the value with pineapple

//        System.out.println(fruits[0]);
//        System.out.println(numOfFruits);

//        for(int i = 0; i < fruits.length; i++){
//            System.out.print(fruits[i] + " ");
//        }

        // Enhanced For loop -> enhanced For loop will cycle once
        //                   for each element within an array
        // it is also known as FOR EACH loop

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
