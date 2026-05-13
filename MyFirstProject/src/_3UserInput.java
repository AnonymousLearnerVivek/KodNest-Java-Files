import jdk.jshell.Snippet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _3UserInput {
    public static void main(String[] args){
        // Scanner - Scanner is an object that allows us to accept
        // user input in Java
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name  = obj.nextLine();

        System.out.print("Enter your age: ");
        int age = obj.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = obj.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = obj.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " +  gpa);
      //  System.out.println("Student: " + isStudent);
        if(isStudent){
            System.out.println("You are enrolled as a student");
        }else{
            System.out.println("You are NOT enrolled");
        }

        //obj.close(); // it is good practice to close Scanner object

        // Calculate area if a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner obj1 = new Scanner(System.in);

        System.out.print("Enter the Width: ");
        width = obj1.nextDouble();

        System.out.print("Enter the height: ");
        height = obj1.nextDouble();

        area = width * height;

        System.out.println("The area of rectangle is: " + area + "cm^2");

        obj1.close();
        obj.close();


//        // Common error issue in Java
//        Scanner obj2 = new Scanner(System.in);
//
//        System.out.print("enter your class ");
//        int grade = obj2.nextInt();  // so when we type  in a No. let say 25 then hit enter within the input buffer there's still a new line charter (\n)
//        // becuz we hit enter so the nextLine method is picking up that new line charater(\n) and using that as the input, So to get rid of it after accepting an
//        // int or double we can use our scanner obj and call the nextLine method but don't assign it to anything, this will get rid of this new line charater(\n).
//        obj2.nextLine();
//
//        System.out.print("Enter your favorite day ");
//        String favDay = obj2.nextLine();
//
//        System.out.println("you are in " + grade + "th Standard");
//        System.out.println("your fav day is " + favDay);
//
//        obj2.close();
    }
}
