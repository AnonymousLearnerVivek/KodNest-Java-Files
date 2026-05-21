package com.DataStructures.Strings;
import java.util.Scanner;
/*
# Problem Statement:
    String Rotation Manipulation
        Write a Java program that rotates a specified string either to the left or right by a given number of positions. Your program should:
        Prompt the user to input a string.
        Ask the user to specify the number of positions for rotation and the direction (left or right).
        Output the resulting rotated string.

    Sample Input:
        HelloWorld
        3
        left
    Sample Output:
        Rotated String: loWorldHel

    Sample Input:
        HelloWorld
        2
        right
    Sample Output:
        Rotated String: ldHelloWor
 */
public class _5PracticeQuestion {
    public static void rotation(char[] ch, int start, int end){
        while(start < end)  {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input string
        String str = scanner.nextLine();
        // TODO: Ask user for the number of positions and direction
        int position = scanner.nextInt();
        String direction = scanner.next();

        char[] ch = str.toCharArray();

        // TODO: Rotate the string
        if(direction.equals("right")) {
            rotation(ch, 0, ch.length - 1);
            rotation(ch, 0, position - 1);
            rotation(ch, position, ch.length - 1);
        } else {
            rotation(ch, 0, position - 1);
            rotation(ch, position, ch.length - 1);
            rotation(ch, 0, ch.length - 1);
        }
        // TODO: Print the rotated string
        String rotated = new String(ch);
        System.out.println("Rotated String: " + rotated);
        scanner.close();
    }
}
