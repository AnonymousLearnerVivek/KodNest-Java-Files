package com.DataStructures.Strings;

public class PracticeQuestion {  //ExtractDigits from the String
    public static void main(String[] args) {
        /*
        First Understand What replaceAll() Does
                replaceAll(pattern, replacement)
        It means:
        “Find everything matching the pattern and replace it with replacement.”
         */


        String str = "abc123x45@7";
        // =========================================================
        // METHOD 1 : Using Regular Expression with [^0-9]
        // =========================================================

        // [0-9]  -> means any digit from 0 to 9
        // ^ inside [] means NOT
        // [^0-9] -> means anything that is NOT a digit
        //
        // replaceAll() removes all non-digit characters
        // and keeps only numbers

        String result1 = str.replaceAll("[^0-9]", "");

        System.out.println("Using [^0-9] : " + result1);

        // =========================================================
        // METHOD 2 : Using \\D
        // =========================================================

        // \D means NON-DIGIT in regex
        //
        // But in Java we must use double slash \\D
        // because \ is treated specially in Java strings

        String result2 = str.replaceAll("\\D", "");

        System.out.println("Using \\\\D : " + result2);

        // =========================================================
        // METHOD 3 : Using Character.isDigit()
        // =========================================================

        // Loop through every character
        // Check if character is digit
        // If yes, add it to result

        String result3 = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Character.isDigit(ch)
            // returns true if ch is a number

            if(Character.isDigit(ch)) {
                result3 = result3 + ch;
            }
        }

        System.out.println("Using Character.isDigit() : " + result3);

        // =========================================================
        // BONUS : Extract digits as INTEGER one by one
        // =========================================================

        System.out.println("Digits individually as integers:");

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {

                // Convert char digit to integer
                // Example:
                // '7' - '0' = 7

                int digit = ch - '0';

                System.out.println(digit);
            }
        }
    }
}
