package com.DataStructures.Strings;

public class Strings {
    public static void main(String[] args) {

//        String s1 = "Java"; // S1 will hold the reference of Container that store "Java" in the String constant pool
//        String s2 = "Java";  // S1 and S2 will both store the same reference because they values are same and created in String constant pool
//        System.out.println(s1 == s2); // s1= 1000 and s2 = 1000 // '==' This Comparison Operator will compare the references // True
//        System.out.println(s1.equals(s2)); // This .equals() function will compare the values store in their references addresses //Ture
//
//        String s3 = new String("Java"); // s3 and s4 also hold the reference of container that store "Java" in the Heap area
//        String s4 = new String("Java"); // s3 and s4 both store different references because they are create in the Heap Area
//        System.out.println(s3 == s4);  // let say s3 = 2000 reference and s4 = 3000 reference that's why this is false
//        System.out.println(s3.equals(s4)); // This is true because it will compare the values stores in there reference address
//        System.out.println(s1.equals(s3)); // This will be true also because values are same

        // s1, s2, s3, s4 all 4 strings are immutable Strings

        // Now will learn about concat method
//        String s5 = "Java Full";
//        String s6 = "Stack";
//
//        System.out.println(s5.concat("Stack Developer")); // Original string will not change here
////        System.out.println(s5); // it will be not change
//        s5 = s5.concat("Stack Developer");
//        System.out.println(s5); // here it will print 'Java FullStack Developer' but these doesnot mean the original string is change Java will create new object 'Java FullStack Developer' and store its reference to s5
//
//        String s7 = new String("Vivek");
//        System.out.println(s7);
//        System.out.println(s7.concat("Surana"));
//        System.out.println(s7); // it will be original Vivek only
//
//        String s1 = "Java";
//        String s2 = "Tech";

//        String s3 = s1.concat(s2); // S3 and S4 will be created in Heap area not in string pool because they concat
//        String s4 = s1.concat(s2);
//        System.out.println(s3 == s4); // will be false
//        System.out.println(s3.equals(s4)); // will be true

//        String s3 = s1.concat("Fullstack"); // S3 and S4 will be created in Heap area not in string pool because they concat
//        String s4 = s1.concat("Fullstack");
//        System.out.println(s3 == s4); // will be false
//        System.out.println(s3.equals(s4)); // will be true

//        String s3 = "Fullstack".concat(s2); // S3 and S4 will be created in Heap area not in string pool because they concat
//        String s4 = "FullStack".concat(s2);
//        System.out.println(s3 == s4); // will be false
//        System.out.println(s3.equals(s4)); // will be true
//
//        String s3 = "Vivek".concat("Surana"); // S3 and S4 will be created in Heap area not in string pool because they concat
//        String s4 = "Vivek".concat("Surana");
//        System.out.println(s3 == s4); // will also be false
//        System.out.println(s3.equals(s4)); // will be true
//
//        String s3 = s1 + s2; // S3 and S4 will be created in Heap area not in string pool because they concat
//        String s4 = s1 + s2;
//        System.out.println(s3 == s4); // will be false
//        System.out.println(s3.equals(s4)); // will be true

//
//        String s3 = s1 + "Fullstack"; // S3 and S4 will be created in Heap area not in string pool because they concat
//        String s4 = s1 + "Fullstack";
//        System.out.println(s3 == s4); // will be false
//        System.out.println(s3.equals(s4)); // will be true


//        String s3 = "Fullstack" + s2; // S3 and S4 will be created in Heap area not in string pool because they concat
//        String s4 = "Fullstack" + s2;
//        System.out.println(s3 == s4); // will be false
//        System.out.println(s3.equals(s4)); // will be true

//        String s3 = "Fullstack" + "Web"; // Here S3 and S4 will be created in string pool
//        String s4 = "Fullstack" + "Web";
//        System.out.println(s3 == s4); // will be  TRUE
//        System.out.println(s3.equals(s4)); // will be TRUE

        // Some more operations on String
        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2));// will be false
        System.out.println(s1.equalsIgnoreCase(s2)); // will be true// it will compare both the strings are same by ignoring the cases

        System.out.println(s1.length());
        System.out.println(s1.charAt(2)); // it will give particular character present at the given index in string s1
        System.out.println(s1.indexOf('a'));// it will give you the first occurrence index of character 'a'
        System.out.println(s1.lastIndexOf('a')); // it will give u last occurrence index of character 'a'
        System.out.println(s1.toLowerCase()); // Convert complete string into lower case
        System.out.println(s1.toUpperCase()); // Convert complete string into UPPER case

        String s = "technology";
        char[] arr = s.toCharArray(); // it will convert string into array of char
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
        String abc = new String(arr); // it will convert array of charater to String again
        System.out.println(abc);

        String s3 = "I Love Java Language";
        String[] strs = s3.split(" "); // it will split the string where ever it will find space in the string and convert it array of Strings
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
/*
Q1. What Exactly is charAt(int index)? 💡
Simple Definition:
    charAt(int index) is a method in Java that helps you get a character from a specific position (or index) in a string.

Q2. What is the index-based system in Java for strings?
Answer: Java uses zero-based indexing for strings. This means the first character in a string is at index 0,
        the second character is at index 1, and so on. So, in the string "Hello", the index of 'H' is 0, 'e' is 1, and so on.

# Key Points to Remember :
    1. Strings are Immutable: Changing a string creates a new object, which can slow down your program.
    2. Use StringBuilder/StringBuffer: For frequent string modifications, use StringBuilder (faster) or StringBuffer (thread-safe).
    3. Avoid + in Loops: Use StringBuilder for string concatenation in loops to improve performance.
    4. Use String.format(): It makes your code cleaner and easier to read when formatting strings.
    5. Compare Strings with equals(): Use String.equals() to compare string content, not ==.
    6. Avoid Unnecessary Strings: Use substring() to work with parts of a string without creating new objects.
    7. Use split(): Split strings into parts with the split() method for cleaner code.
 */
