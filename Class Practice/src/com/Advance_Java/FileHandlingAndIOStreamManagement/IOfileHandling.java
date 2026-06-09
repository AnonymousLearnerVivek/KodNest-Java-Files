package com.Advance_Java.FileHandlingAndIOStreamManagement;

import java.io.*;

public class IOfileHandling {
    public static void main(String[] args) {
          // Byte-Based File Handling
//        try  {
//            String path1 = "C:\\janbatch\\io\\input.txt"; // this file is for digits
//            String path2 = "C:\\janbatch\\io\\output.txt";
//
//            FileInputStream file1 = new FileInputStream(path1);
//            FileOutputStream file2 = new FileOutputStream(path2);
//
//            int a; // to collect the data from the input file
//            /*
//                1) .read() method Reads a byte of data from this input stream.
//                   This method blocks if no input is yet available.
//                2) Returns: the next byte of data, or -1 if the end of the file is reached.
//             */
//            while ((a = file1.read()) != -1) {
//                file2.write(a);
//            }
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        // Character-Based File Handling
        try {
            String path3 = "C:\\janbatch\\io\\input1.txt"; // this file is for characters
            String path4 = "C:\\janbatch\\io\\output1.txt";

            FileReader file3  = new FileReader(path3);
            FileWriter file4  = new FileWriter(path4);

            BufferedReader br  = new BufferedReader(file3);
            BufferedWriter bw  = new BufferedWriter(file4);

            String a;
            while((a = br.readLine()) != null){
                bw.write(a);
            }
            bw.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
