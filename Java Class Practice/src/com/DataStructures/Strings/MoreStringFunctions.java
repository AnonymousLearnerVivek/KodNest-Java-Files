package com.DataStructures.Strings;

public class MoreStringFunctions {
    public static void main(String[] args) {
        String s1 = "Java full stack";
        System.out.println(s1.substring(5, 9)); // it gives you the part of string
        System.out.println(s1.contains("Java")); // it finds if it contains that char init or not
        System.out.println(s1.contains("Web")); // false
        System.out.println(s1.startsWith("J")); // True
        System.out.println(s1.endsWith("J")); // False

        String sentence = "Java is fun to learn!";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // use JOIN function to array
        String joined = String.join("-", words);  //it will join the values of the array with -
        System.out.println(joined); // O/P -> Java-is-fun-to-learn!

        String[] arr = new String[3];
        arr[0] = "Frontend";
        arr[1] = "Java";
        arr[2] = "Database";
        String joined2 = String.join("-", arr);
        System.out.println(joined2);

        String s2 = "";
        System.out.println(s2.isEmpty()); // True
        System.out.println(s2.isBlank()); // True
        String s3 = " ";
        System.out.println(s3.isEmpty()); // False
        System.out.println(s3.isBlank()); // True

        // Regular Expression Regex --> Regex Matching: Allows matching patterns in strings using regular expressions
        /*
        Pattern           Meaning
        \\D               no numbers
        \\d               Digit(0-9)
        \\W               no words
        \\w               Word Character
        \\s               whitespace
        .                 Any character
        +                 One or more
        *                 zero or more
        ?                  Optional
         */
        String s = "HelloWorld  ";

// Check if the string starts with "Hello"
        System.out.println(s.startsWith("Hello"));  // Output: true

// Check if the string ends with "World!"
        System.out.println(s.endsWith("World!"));   // Output: true

// Check if an empty string is empty
        String emptyString = "";
        System.out.println(emptyString.isEmpty());         // Output: true

// Regex matching (check if string contains only letters)
        String regex = "[a-zA-Z]+";
        System.out.println(s.matches(regex));       // Output: false
    }
}
/*
Q1. What Exactly Are Basic String Operations? 💡
Standard Definition:
    A String operation is an action you can perform on a string (a piece of text) in Java.
    These operations help you manipulate text, like finding the length of a string,
    comparing two strings, combining strings, or extracting part of a string.

# Accessing Characters – Getting Specific Letters 🔠
    1. Scenario: Creating a unique student ID using the first letter of the student’s first and last names.
    2. Definition: The charAt(index) method returns the character at a specific index.

# Substring – Extracting Parts of a String 🔍
    1. Scenario: Extracting a student’s first name from their full name.
    2. Definition: The substring(startIndex, endIndex) method extracts a portion of the string from the startIndex to endIndex (exclusive).

# Comparing Strings – Checking for Equality 🔄
    1. Scenario: Checking if the student’s entered password matches the one stored in the database.
    2. Definition: The equals() method compares the content of two strings, while == checks if they reference the same object.

# Changing Case – Uppercase and Lowercase 🔡
    1. Scenario: Standardizing student names by converting them all to uppercase.
    2. Definition:
        1. toUpperCase() converts all characters to uppercase.
        2. toLowerCase() converts all characters to lowercase.

# Trimming – Removing Extra Spaces ✂️
    1. Scenario: Removing unnecessary spaces from the start and end of a student’s email address
    2. Definition: The trim() method removes leading and trailing spaces from a string.
 */

/*
# Common interview Questions and Answers:

    Q1. What is String concatenation in Java?
    Answer: String concatenation is the process of combining two or more strings into one. In Java, concatenation can be done
            using the + operator or the concat() method. It's often used to combine strings, like joining a first name and
            a last name to form a full name.

    Q2. How can you find the length of a String in Java?
    Answer: To find the length of a string, Java provides the length() method, which returns the number of characters in a string.
            This includes letters, numbers, spaces, and special characters.

    Q3. How would you extract a part of a String in Java?
    Answer: To extract a part of a string, the substring() method is used. It allows you to specify a starting index and
            an optional ending index to get a specific portion of the string.

    Q4. What does the toUpperCase() method do in Java?
    Answer: The toUpperCase() method converts all characters of a string to uppercase. It is commonly used to standardize text,
            like converting all user input to uppercase for consistency.

    Q5. What is the purpose of the trim() method in Java?
    Answer: The trim() method is used to remove any leading or trailing spaces from a string. It's useful when dealing with
            user input to clean up any unwanted spaces around the text.

    Q6. How do you check if a String contains a particular word or substring in Java?
    Answer: To check if a string contains a certain substring, the contains() method is used. It returns true if the substring
            is present in the string and false otherwise.

    Q7. How can you convert a String to lowercase in Java?
    Answer: To convert a string to lowercase, Java provides the toLowerCase() method. This method converts all characters in the string to lowercase.
 */

/*
# Key Points:
    1. startsWith() and endsWith() are case-sensitive and return a boolean value (true or false).
    2. isEmpty() returns true if the string has zero length.
    3. Regular expressions (regex) are used for more complex pattern matching.

# 🔑 Quick Recap:
    1. startsWith() checks if a string begins with a specified prefix.
    2. endsWith() checks if a string ends with a specified suffix.
    3. isEmpty() checks if a string is empty.
    4. Regex Matching allows you to match patterns in strings using regular expressions. 🌟
 */
