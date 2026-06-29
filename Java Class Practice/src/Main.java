import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Largest of Three Numbers (If-Else Ladder)
        //Write a program that takes three numbers as input and prints the largest among them.
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter first Number");
//        int n1 =  obj.nextInt();
//        System.out.println("Enter second Number");
//        int n2 = obj.nextInt();
//        System.out.println("Enter third Number");
//        int n3 = obj.nextInt();
//
//        if(n1 > n2 && n1 > n3) {
//            System.out.println("Largest Number is: " + n1);
//        } else if(n2 > n1 && n2 > n3) {
//            System.out.println("Largest Number is: " + n2);
//        }
//        else {
//            System.out.println("Largest Number is: " + n3);
//        }


//        Reverse a Number
//
//        Write a program to reverse the digits of a number.
//
//        Example:
//        Input: 1234
//        Output: 4321

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the Number: ");
//        int num = obj.nextInt();
//        while(num > 0){
//            int  rem = num % 10;
//            System.out.print(rem);
//            num = num / 10;

        /*
            Sum of Digits
            Write a program to calculate the sum of digits of a number.
            Example:
            Input: 123
            Output: 6
         */

//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num = obj.nextInt();
//        int sum = 0;
//        while(num > 0){
//            int rem = num % 10;
//            sum = sum + rem;
//            num /= 10;
//        }
//        System.out.println("The sum is " + sum);

        /*
            Count Digits in a Number
            Write a program that takes an integer and counts how many digits it has.
            Example:
            Input: 4567
            Output: 4
         */

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = obj.nextInt();
//
//        int count = 0;
//        while(num > 0){
//            count++;
//            num = num / 10;
//        }
//        System.out.println("Total number of digits is: " + count);

        /*
            Strong Number
            A number is a Strong number if the sum of factorial of its digits equals the number itself.
            Example: 145 = 1! + 4! + 5!
            Write a program to check whether a number is Strong or not.
         */

//        Scanner obj = new Scanner(System.in);
//
//        System.out.print("Enter the number: ");
//        int num = obj.nextInt();
//        int sum = 0;
//        int value = num;
//
//        while(num > 0) {
//            int rem = num % 10;
//            int factorial = 1;
//            while(rem > 0){
//
//                factorial = factorial * rem;
//                rem--;
//            }
//            sum =  sum + factorial;
//            num = num / 10;
//        }
//
//        if(sum == value){
//            System.out.println("YES it is a Strong number");
//        } else {
//            System.out.println("NO it is NOT a Strong number");
//        }

        /*
            Spy Number
            A number is a Spy number if the sum of digits equals the product of digits.
            Example: 1124 → Sum = 8, Product = 8
            Write a program to check it.
         */

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = obj.nextInt();
//
//        int sum = 0;
//        int product = 1;
//
//        while(num > 0){
//            int digit = num % 10;
//            sum += digit;
//            product *= digit;
//            num /= 10;
//        }
//        if(sum == product) System.out.println("YES it is a SPY number");
//        else System.out.println("NO it is not a SPY number");

        /*
            Neon Number
            A number is Neon if the sum of digits of its square equals the number.
            Example: 9 → 9² = 81 → 8 + 1 = 9
            Check whether a number is Neon.
         */
//        Scanner obj = new Scanner(System.in);
//
//        System.out.print("Enter the number: ");
//        int num = obj.nextInt();
//        int square = num * num;
//        int sum = 0;
//        while( square != 0 ) {
//            int digit = square % 10;
//            sum += digit;
//            square = square / 10;
//        }
//        if(sum == num) System.out.println("YES it is a NEON number");
//        else System.out.println("NO it is not a NEON number");

        /*
        Find the Largest Digit in a Number (Without Arrays)
        Given an integer, find the largest digit using loops and conditionals only.
         */
//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = obj.nextInt();
//        int max = 0;
//        while(num > 0) {
//            int digit = num % 10;
//            if(digit > max) {
//                max = digit;
//            }
//            num = num / 10;
//        }
//
//        System.out.println("Maximum number is " + max);

        /*
            Automorphic Number
            A number is Automorphic if its square ends with the same number.
            Example: 25 → 25² = 625
            Check whether a number is Automorphic.
         */
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();
        int sqr = num * num;
        while(num != 0) {
            int rem = num % 10;
            int rem2 = sqr % 10;
            if(rem == rem2) {
                System.out.print("" + rem2);
            }
            num = num / 10;
            sqr = sqr / 10;

        }

    }

}
