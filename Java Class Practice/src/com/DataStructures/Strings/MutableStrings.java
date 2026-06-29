package com.DataStructures.Strings;

public class MutableStrings {
    public static void main(String[] args) {
        // We use StringBuffer and Stringbuilder classes
        // Mutable Strings are created at heap area

        StringBuffer s1 = new StringBuffer("Java");
        StringBuffer s2 = new StringBuffer("Java");

        System.out.println(s1 == s2); // False //  Both created at different reference area
        System.out.println(s1.equals(s2)); //  false as well because .equals method compare values of the String Class objects
        System.out.println(s1.toString().equals(s2.toString())); // here it is true because we convert StringBuffer Object to String Class Object
        System.out.println(s1.compareTo(s2)); // .compareTo() is used to compare the values of the StringBuffers object it will write 0 and 1 because its return type is int

        // here in StringBuffer and StringBuilder class we use append() method to Concat the values
        System.out.println(s1);
        s1.append("Tech");
        System.out.println(s1); // it will change to JavaTech because these are mutable

        s1.reverse();
        System.out.println(s1); // These will reverse the string
        // But keep in mind these reverse() and append() are for StringBuffer and StringBuilder class not for String Class


//        String s = "Java";
//        System.out.println(s.reverse()); // This will show an error

        StringBuffer s3 = new StringBuffer("Mava");
        System.out.println(s1.compareTo(s3)); // it will give -3 why, because it will subtract the UNICODE(ASCII) values of the charater and it will compare character by character
        // since Unicode for J is 74 and for M is 77 it will subtract J to M
        System.out.println(s3.compareTo(s1)); // it will give +3
    }
}
/*
3. Using StringBuilder or StringBuffer
    For scenarios where multiple string concatenations are performed (especially in loops or large-scale string operations),
    the StringBuilder or StringBuffer classes are the most efficient option.

    How it Works:
    These classes create a mutable sequence of characters, meaning the string can be modified without creating new objects every time.
    StringBuilder is generally preferred for single-threaded applications, while StringBuffer is thread-safe.
    Example:
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String greeting = sb.toString();
 */

/*
# Common Interview Questions and Answers:

    Q1. What is String concatenation in Java?
    Answer: String concatenation is the process of joining two or more strings together to form one continuous string.
            In Java, this can be done using the + operator, the concat() method, or StringBuilder/StringBuffer.

    Q2. What are the different methods to concatenate strings in Java?
    Answer: There are three main ways to concatenate strings in Java:
            1. Using the + operator: The simplest and most commonly used method.
            2. Using the concat() method: Joins the specified string to the current string and returns a new string.
            3. Using StringBuilder or StringBuffer: More efficient when performing multiple concatenations, especially in loops or large-scale operations.

    Q3. Which method is preferred for string concatenation in loops, and why?
    Answer: StringBuilder (or StringBuffer for thread-safe operations) is the preferred method for string concatenation in loops.
            This is because using the + operator in loops creates a new string object on each iteration, leading to inefficient
            memory usage and slower performance. StringBuilder avoids creating multiple objects by using a mutable sequence of characters.

    Q4. What is the difference between StringBuilder and StringBuffer in Java?
    Answer:
            1. StringBuilder: It is not thread-safe but is faster than StringBuffer because it does not have the overhead of synchronization.
                              It is suitable for single-threaded applications.
            2. StringBuffer: It is thread-safe, meaning it can be safely used in multi-threaded applications, but it is slightly slower
                             than StringBuilder due to the synchronization overhead.
 */
