package com.DataStructures.Strings;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
/*
# StringBuilder and StringBuffer
Q1. Why Are Strings Slow When We Modify Them? 🤔
    In Java, strings are like pieces of paper. Once you write something on a piece of paper, you can't change it directly.
    If you want to add something else, you need a whole new piece of paper. This can be slow and wasteful,
    especially when you need to add or change text multiple times.

    When you keep changing text (for example, adding more posts to a social media feed or sending new messages in a chat),
    Java has to create a whole new string every time you change it. This takes time and uses more memory.

# The Solution: StringBuilder and StringBuffer 🔧
    Luckily, Java gives us two tools to make text changes faster: StringBuilder and StringBuffer.
    1. StringBuilder:
          i. This is used when your program has only one task at a time.
         ii. It's faster and great for situations like when you're creating a list of things or building a long string from smaller pieces.

    2. StringBuffer:
          i. This is like StringBuilder, but it is safe to use when there are multiple tasks trying to change the text at the same time.
         ii. It is slower than StringBuilder because it is built to handle multiple users or processes safely.

Q3. How Do They Help?
    The main advantage of StringBuilder and StringBuffer is that they do not create new strings every time you change something.
    They allow you to change the text directly, which is faster and uses less memory.

# Let's Look at StringBuilder First:
    Imagine you're creating a news feed for an app, and you want to keep adding new posts to it.
 */
        StringBuilder newsFeed = new StringBuilder("Latest News: ");
        // Add more news
        newsFeed.append("Java update released. ");
        newsFeed.append("AI is growing rapidly. ");

        System.out.println(newsFeed);  // Output: Latest News: Java update released. AI is growing rapidly.

/*
Q4. Why Use StringBuilder or StringBuffer Instead of String? 💡
    1. Efficiency: With StringBuilder and StringBuffer, you can change the text without creating new strings each time.
    2. Speed: They are faster than using regular strings when you need to make lots of changes.
    3. Memory: They use less memory because they reuse the same space for the text instead of creating new ones.

# Common Methods in StringBuilder and StringBuffer 🔍
    Here are a few useful methods you can use to work with StringBuilder and StringBuffer:
        Method                           What It Does                                                  Example
        append()               Adds more text to the end of the string                         builder.append(" World")
        insert()               Adds text at a certain position                                 builder.insert(0, "Hello")
        delete()               Removes text between two points                                 builder.delete(0, 5)
        reverse()              Reverses the entire string                                      builder.reverse()
 */
/*
Q5. When to Use Each? 📝
    1. Use StringBuilder: When you don’t need to worry about multiple processes changing the text at the same time.
                          It's best for tasks where only one task is involved (e.g., creating a report).
    2. Use StringBuffer: When you have multiple processes changing the text at once. It’s great for things like chat rooms
                         or any app where multiple users are interacting with the text at the same time.

# key points to remember:
    1. Strings in Java are immutable and can be slow when changed frequently.
    2. StringBuilder is fast and used for single tasks.
    3. StringBuffer is safe for multi-tasks but slower than StringBuilder.
    4. Both StringBuilder and StringBuffer make string manipulation faster and more memory-efficient

# Common Interview Questions and Answers:

    Q1. What is the difference between StringBuilder and StringBuffer in Java?
    Answer:
           1. StringBuilder is faster but can only be used when one task is changing the text.
           2. StringBuffer is slower but can be used when multiple tasks need to change the text at the same time.

    Q2. Why should we use StringBuilder or StringBuffer instead of String?
    Answer: Strings are fixed, so every time you change a string, Java makes a new one. This is slow and uses a lot of memory.
            StringBuilder and StringBuffer let you change the text directly, which is faster and saves memory.

    Q3. When should we use StringBuilder and StringBuffer?
    Answer:
           1. StringBuilder: Use when one task is changing the text (it’s faster).
           2. StringBuffer: Use when many tasks are changing the text at the same time (it’s safer but slower).

    Q4. What are the common methods in StringBuilder and StringBuffer?
    Answer:
           1. append(): Adds text to the end.
           2. insert(): Adds text at a specific position.
           3. delete(): Removes text.
           4. reverse(): Reverses the text.

    Q5. Can StringBuilder and StringBuffer be used interchangeably?
    Answer: Yes, but StringBuilder is better when there’s only one task. Use StringBuffer when you need to handle multiple tasks safely.

    Q6. What happens if you call append() multiple times on a StringBuilder or StringBuffer?
    Answer: Each time you use append(), it adds text to the same object, making it faster than using a regular string, which would create a new one every time.
 */
    }
}
