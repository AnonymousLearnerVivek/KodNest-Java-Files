package com.Advance_Java.FileHandlingAndIOStreamManagement;

import java.io.File;
/*
# The File Class:
    Imagine you’re cleaning up your computer. You might create new folders, check if a file is there,
    rename some files, or delete the ones you no longer need. You’re not opening each file—you’re just organizing things.

    Java gives us a special tool called the File class that helps us do the same in our programs.
    It lets us manage files and folders — like checking if they exist, creating or deleting them —
    without actually opening them to read what’s inside.

Q1. What Exactly Is the File Class?
Standard Definition
    The File class in Java (from java.io package) represents a file or directory (folder) in your computer system.
    It provides methods to create, delete, rename, check existence, get size, and more — but it doesn’t deal with
    the content inside the file.
 */
public class FileClassUnderstanding {
    public static void main(String[] args) {
        try {
            String path1 = "C:\\janbatch\\io\\input.txt";
            String path2 = "C:\\";

            File f1 = new File(path1);
            File f2 = new File(path2);

            System.out.println(f1.exists());  // it checks if file exist or not, it returns true or false
            System.out.println(f1.getAbsolutePath()); // write the files path C:\janbatch\io\input.txt
            System.out.println(f1.getCanonicalPath()); // write the files path C:\janbatch\io\input.txt
            System.out.println(f1.getParent()); // write the immediate parent of the file C:\janbatch\io
            System.out.println(f1.getName()); // write the file name input.txt
            System.out.println(f1.isFile()); // checks if it is a file or not, return true or false -> true
            System.out.println(f1.isDirectory()); // checks if it is a directory(Folder) or not, return true or false -> false
            System.out.println(f2.isFile()); // false
            System.out.println(f2.isDirectory()); // true
            System.out.println(f1.canRead()); //it checks if a file can read or not --> true
            System.out.println(f1.canWrite()); //it checks if a file can write or not --> true
            System.out.println(f1.canExecute());//it checks if a file can executable or not --> true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
# Key Points to Remember about the File Class:
    1. The File class is used to manage files and folders, not to read or write the content inside them.
    2. It can check if a file or folder exists, create or delete them, rename them, and more.
    3. File class is part of the **java.io** package.
    4. Methods like exists(), isFile(), and isDirectory() are used for validation and checks before working with files.
    5. Use getAbsolutePath() to get the full file path on your system.
    6. Use getPath() to get the relative file path (how it’s written in your code).
    7. Doesn’t deal with file contents — for that, use streams or readers/writers.

# Common Interview Questions and Answers:

    Q1. What is the purpose of the File class in Java?
    Answer: The File class is used to represent file and directory path names in Java. It helps manage files
            and folders (like checking existence, creating, renaming, or deleting) without opening or editing
            the file content.

    Q2. Can the File class be used to read or write content inside a file?
    Answer: No. The File class is only used to manage file or directory structures. To read or write data
            inside a file, we use classes like FileReader, FileWriter, BufferedReader, etc.

    Q3. What’s the difference between isFile() and isDirectory()?
    Answer: 1. isFile() returns true if the path refers to a file.
            2. isDirectory() returns true if the path refers to a folder.
            3. Both are useful to check what kind of resource a path points to.

    Q4: What does the exists() method do?
    Answer: It checks whether the specified file or directory physically exists on the system and returns true or false
 */
