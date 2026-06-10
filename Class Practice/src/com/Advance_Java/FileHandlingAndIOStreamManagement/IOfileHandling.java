package com.Advance_Java.FileHandlingAndIOStreamManagement;

import java.io.*;

public class IOfileHandling {
    public static void main(String[] args) {
          // Byte-Based File Handling
        /*
            # Key Classes for Byte-Based Streams in Java:
            1. FileInputStream – Reading Files Byte by Byte
                This class helps you read data from a file, one byte at a time. It’s useful when
                you want to process the file very carefully, byte after byte.

                Q1. How Does It Work?
                    1. Open the file you want to read.
                    2. Read the data using the .read() method.
                    3. Keep reading until the file is finished (when .read() returns -1).
                    4. Close the file when done to free up memory.

            2. FileOutputStream – Writing Files Byte by Byte
                This class helps you write data to a file, one byte at a time. It’s useful for
                saving any kind of data — text or binary — with full control.

                Q1. How Does It Work?
                    1. Open or create a file to write into.
                    2. Use .write() to send bytes into the file.
                    3. Always close the stream to make sure everything is saved properly.
         */
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
        FileReader file3 = null;  //  Initializing them becuz they are still local variable becauz they are still inside main method
        FileWriter file4 = null;
        BufferedReader br = null;
        BufferedWriter bw =  null;
        try {
            String path3 = "C:\\janbatch\\io\\input1.txt"; // this file is for characters
            String path4 = "C:\\janbatch\\io\\output1.txt";

            file3  = new FileReader(path3);
            file4  = new FileWriter(path4);

            br  = new BufferedReader(file3);
            bw  = new BufferedWriter(file4);

            String a;
            while((a = br.readLine()) != null){
                bw.write(a);
            }
            bw.flush(); // flush() is used to manually push any remaining buffered data to the file before closing.
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                file3.close();
                file4.close();
                br.close();
                bw.close();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
/*
Q1. Why is file handling important in programming?
 A. 1. To allow programs to store and retrieve data even after they stop running.
    2. File handling enables programs to save data permanently, making it accessible even after the program closes.

Q2. What Exactly Are Java I/O Streams?
 A. Java I/O Streams (Input/Output Streams) are used to read data from a source (like a file, keyboard, or network)
    and write data to a destination (like a file, screen, or socket) — one piece at a time.

# Buffered Streams – Making File Handling Faster and Smoother:

Q1. What Are Buffered Streams?
    Buffered streams add a temporary memory buffer between your program and the file system. This makes file reading
    and writing much faster — especially when working with large files or repeated reads/writes.

    Instead of reading or writing one character or byte at a time, buffered streams collect a chunk of data in
    memory first, then process it together.

Q2. When Should You Use Buffered Streams?
    Use buffered streams when:
        1. You're reading a big text file (like interview questions or logs)
        2. You're writing a lot of data at once
        3. You want to speed things up and reduce file I/O operations

| Stream Type      | Buffered Class         | Used For                    |
| ---------------- | ---------------------- | --------------------------- |
| Character Stream | `BufferedReader`       | Fast reading of text lines  |
| Character Stream | `BufferedWriter`       | Fast writing of text        |
| Byte Stream      | `BufferedInputStream`  | Fast reading of binary data |
| Byte Stream      | `BufferedOutputStream` | Fast writing of binary data |

Q3. What is a best practice to follow when working with byte-based streams?
 A. 1. Use buffered streams to improve efficiency for large files.
    2. Buffered streams (like BufferedInputStream and BufferedOutputStream) reduce the number of I/O operations,
       enhancing performance when handling large files.
*/
/*
4. Data Streams
Q1. What Are Data Streams?
 A. When your Java program needs to store basic values like numbers or true/false flags (called primitive data types),
    Data Streams are the right choice.

    They allow you to directly write and read values like:
        1. int (numbers)
        2. double (decimal values)
        3. boolean (true/false)
    No need to convert them to strings — data streams handle them as-is.

Q2. When Should You Use Data Streams?
    1. You want to save test scores or marks
    2. You want to store boolean answers from a quiz
    3. You need to write/read numbers without converting to text

# Key Java Classes:
    1. DataInputStream:- Reads primitive values from a file
    2. DataOutputStream:- Writes primitive values to a file

    Java Example: Saving Exam Scores to a File
    Suppose you want to save three test scores into a file named scores.dat.
    Here’s how to do it:

                    import java.io.DataOutputStream;
                    import java.io.FileOutputStream;
                    import java.io.IOException;

                    public class DataStreamExample {
                        public static void main(String[] args) {
                            try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("scores.dat"))) {
                                dataOut.writeInt(85);  // Math score
                                dataOut.writeInt(90);  // Java score
                                dataOut.writeInt(78);  // DBMS score

                                System.out.println("Scores saved successfully.");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
 */