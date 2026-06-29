package com.DataStructures.AnatomyOfMainMethod;

public class Main {
    public static void main(String[] args) { // args is a name of parameter
        // its return type is void because JVM does not accept anything
        // String[] args holds the command-line argument
        // JVM always called main method with signature string[] args no matter how many main method overloading happen in the code

/*
Q1. What is String[] args in Java?
Answer:
    String[] args is a parameter in the main() method that holds command-line arguments passed when running the Java program.
    It allows the user to provide input dynamically when running the program from the command line, making the program more flexible and interactive.

Q2. What Exactly is the main() Method in Java? 💡
Standard Definition:
    The main() method is a special method that serves as the entry point of every Java application. It’s where the Java program
    begins execution. Without it, your program won’t know where to start!
*/
    }
    public static void main(int a){

    }
    public static void main(int a,int b){

    }
}
/*
# Breakdown of the Signature:
    1. public: This access modifier makes the main() method accessible to anyone, including the JVM, so it can start running the program.

    2. static: The static keyword means that the method belongs to the class, not to a specific object of the class.
               This is important because the main() method runs without creating an instance of the class.

    3. void: The main() method doesn’t return any value. It simply starts the program and runs the instructions
             inside it without sending anything back.

    4. String[] args: This is an array that holds command-line arguments. When you run the program from the terminal,
                      you can pass additional information through this array. Although you won’t use it often in
                      simple programs, it can be really helpful in complex ones!
 */

/*
# Key Points to Remember:
    1. Entry Point: The main() method is the starting point of any Java program.
    2. Signature: It must be public static void main(String[] args).
    3. public: Allows access from anywhere, including the JVM.
    4. static: Belongs to the class, not an object.
    5. void: Doesn’t return anything.
    6. String[] args: Holds command-line arguments passed to the program.

# Common Interview Questions and Answers:

    Q1. What is the role of the main() method in a Java program?
    Answer: The main() method is the entry point for any Java application. It tells the Java Virtual Machine (JVM) where to start executing the program.

    Q2. Can the main() method in Java return a value? Why or why not?
    Answer: No, the main() method cannot return a value. It is declared with void, meaning it does not return anything,
            as its purpose is to start the program’s execution.

    Q3. What is the significance of the String[] args parameter in the main() method?
    Answer: String[] args allows command-line arguments to be passed into the program when it is run, providing flexibility to the program.

    Q4. What happens if you don't include the main() method in a Java program?
    Answer: If the main() method is missing, the program will not run because the JVM won't know where to start execution
 */
/*
# Key Takeaways 📝
    1. String[] args lets your program accept information when you run it.
    2. It makes the program flexible because you can give input without changing the code.
    3. The input is stored in an array (a list) of text (called String[]), and you can get each piece using its position or loop through them.
    4. You can give multiple pieces of information, and they can change how your program works.

# Common Interview Questions and Answers:

Q1. How can you pass command-line arguments to a Java program?
Answer: You can pass command-line arguments to a Java program by typing them after the class name when running the program.
        For example:
            java MyProgram arg1 arg2 arg3
        In this case, arg1, arg2, and arg3 are the command-line arguments passed to the main() method, and they can be accessed using the String[] args array.

Q2. What happens if no arguments are passed to a Java program?
Answer: If no arguments are passed, the args.length will be 0, and the program can handle it accordingly.
        For example, you could display a message like "No arguments were passed."
        This can be checked using an if condition to see if args.length is greater than 0.

Q3. Can you modify the values in String[] args?
Answer: Yes, the values in String[] args can be modified because it is an array of strings. However, since String objects
        in Java are immutable (cannot be changed after they are created), you cannot modify the content of a String in the
        array directly, but you can assign a new value to the array element.
 */
