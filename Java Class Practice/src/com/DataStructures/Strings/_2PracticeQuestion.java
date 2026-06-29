package com.DataStructures.Strings;
import java.util.*;

/*
    Problem Statement:
    Capitalize Each Word in a String
        Imagine you're building a text processing tool, and one of the features requires capitalizing the first letter of each word in a sentence.
        This feature helps users format their sentences to look more polished, especially when preparing a list of titles or headings from text input.
        Your task is to take an entire sentence and capitalize the first letter of each word while ensuring the rest of the letters are in lowercase.

            For example, if the user enters "hello world this is java", the output should be "Hello World This Is Java".

        You are given a sentence. Your task is to capitalize the first letter of each word while keeping the rest of the letters in lowercase.
 */
public class _2PracticeQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] arr = sentence.split(" ");

        for(int i = 0; i < arr.length; i++) {

            // First character uppercase
            char first = Character.toUpperCase(arr[i].charAt(0));

            // Remaining characters lowercase
            String rest = arr[i].substring(1).toLowerCase();

            // Combine and store back
            arr[i] = first + rest;
        }

        String joined = String.join(" ", arr);

        System.out.println(joined);
    }
}