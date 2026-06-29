package com.Advance_Java.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter first number:");
//        int num1 = input.nextInt();
//        System.out.println("Enter second number:");
//        int num2 = input.nextInt();
//
//        int res = num1 / num2;
//        System.out.println("result is : " + res); // ArithmaticException will occur if num2 = 0;
        // InputMismatchException might occur if user will write string instead of Integer
        // NegativeArraySizeException might occur if you give array size as Negative value

        /*
            Whatever the lines of code, you feel it might cause an Exception.
            Keep it inside One block called TRY BLOCK
            try{
                ........
                ........
                ........
            } // if in-case when the line inside try block getting executed, mif any exception occurs,
                  this Exception object will be taken by this CATCH BLOCK.
                  The CATCH BLOCK will handle, you can tell it inside the CATCH BLOCK
            catch(Exception e) {


            }

         */
//        String name = null;
//        System.out.println(name.length()); // This will throw an NullPointerException

        // We can have multiple Catch block for single try block

//        try(Scanner input = new Scanner(System.in)){
//        try(input){ // it will says that after try block close the scanner object
        try {
            System.out.println("Enter first number:");
            int num1 = input.nextInt();
            System.out.println("Enter second number:");
            int num2 = input.nextInt();

            int res = num1 / num2;
            System.out.println("result is : " + res);

            System.out.println("Enter the size of array");
            int size = input.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the value to be stored");
            int val = input.nextInt();
            System.out.println("Enter the index where the value should be stored");
            int index = input.nextInt();
            arr[index] = val;
            System.out.println(arr[index]);
        }
//        catch(Exception e) {
//            System.out.println("Exception is handled and you can continue with next line of code execution");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Can not divide by zero. Enter a valid number.");
//        }
//        catch (NegativeArraySizeException e) {
//            System.out.println("Size cannot be negative. Enter a valid size.");
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Be in your limits");
//        }

        // We can use multiple in ONE catch block
        catch (ArithmeticException | NegativeArraySizeException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }


        catch (Exception e) { // we use this as Generic exception catch block
            // and this Generic Catch block must always be kept in the last
//            System.out.println("Invalid Input. Please try again.");
//            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        finally {
            input.close();
        }

        System.out.println("Program ended");
    }
}
