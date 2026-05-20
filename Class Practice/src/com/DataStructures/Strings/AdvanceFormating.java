package com.DataStructures.Strings;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdvanceFormating {
    public static void main(String[] args) {
        int age = 25;
        String name = "Alice";

        String formattedString = String.format("Hello, my name is %s, and I am %d years old.", name, age);
        System.out.println(formattedString); // Output: Hello, my name is Alice, and I am 25 years old.

        /*
        Formatting Numbers:
        To format numbers, you can use String.format() with specific format specifiers:
            1. %d: Formats integers.
            2. %f: Formats floating-point numbers. You can control the number of decimal places.
            3. %,d: Formats integers with commas for thousands.
         */
        int number = 123456789;
        double pi = 3.14159265359;
        System.out.println(String.format("Integer with commas: %,d", number)); // Output: Integer with commas: 123,456,789
        System.out.println(String.format("Formatted Pi: %.2f", pi));    // Output: Formatted Pi: 3.14

        /*
        Formatting Dates:
        Java’s SimpleDateFormat allows you to format dates in various ways:
            1. dd/MM/yyyy: Day/Month/Year
            2. MM-dd-yyyy: Month-Day-Year
            3. E, MMM dd yyyy: Day of the week, Month, Day, Year
         */
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd yyyy");
        System.out.println("Today's date: " + sdf.format(today));// Output: Today's date: Tue, Sep 26 2024 / Present date will come here
    }
}
