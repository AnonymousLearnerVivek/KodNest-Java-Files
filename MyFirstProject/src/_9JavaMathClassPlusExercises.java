import javax.swing.*;
import java.util.Scanner;

public class _9JavaMathClassPlusExercises {
    public static void main(String[] args){
//        System.out.println(Math.PI); // buit-in constant of Pi in math class
//        System.out.println(Math.E); // Exponential constant also known as eulers number

//        double result;
//        result = Math.pow(2, 3); // power of function like 2^3
//        result = Math.abs(-5); // absolute value method, it give +ve if negative given
//        result = Math.sqrt(9); // gives the square root of the number
//        result = Math.round(3.99); // it will round a number to the nearest whole integer
//        result = Math.ceil(3.14); // Ceiling method it will round the number upside ex.--> 3.14 will be 4
//        result = Math.floor(3.99); // floor method to always round downwards
//        result = Math.max(10, 20); // to find the max between 2 numbers
//        result = Math.min(10, 20); // To find the min between 2 numbers
//
//        System.out.println(result);

        // HYPOTENUSE  C = Math.sqrt(A^2 + B^2)
//        Scanner obj = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side A: ");
//        a = obj.nextInt();
//
//        System.out.print("Enter the length of side B: ");
//        b = obj.nextInt();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The Hypotenuse (Side C) is: " + c + "cm");

//        obj.close();

        // Find the Circumference, area, and volume of the Sphere
        // Circumference = 2 * Math.PI * radius;
        // area  = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        Scanner obj = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;


        System.out.print("Enter the radius: ");
        radius = obj.nextDouble();

        circumference = 2 * Math.PI * radius;
        area  = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The Circumference is: " + circumference + " Cm");
        System.out.println("The area is: " + area + " Cm^2");
        System.out.printf("The Volume is: %.1fcm^3\n", volume); // we can also do this if we want only one decimal
    }
}
