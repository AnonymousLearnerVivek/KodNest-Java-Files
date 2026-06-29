package com.DataStructures.AnatomyOfMainMethod;

public class PracticeAnatomy {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            // Arguments passed in command line
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
