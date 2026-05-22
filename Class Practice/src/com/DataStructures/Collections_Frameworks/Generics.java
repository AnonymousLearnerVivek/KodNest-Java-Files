package com.DataStructures.Collections_Frameworks;

// Generic class with a type parameter T
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Generics {
    public static void main(String[] args) {
        // Creating a Box for Strings
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Textbook");
        System.out.println("String item: " + stringBox.getItem());

        // Creating a Box for Integers
        Box<Integer> intBox = new Box<>();
        intBox.setItem(101);
        System.out.println("Integer item: " + intBox.getItem());
    }
}

/*
Generics: With generics, Java lets you write one piece of code that works for many types of data

Q1. What Are Generics? 🤔
Standard Definition:
    Generics in Java allow you to write code that can work with different types of data while keeping it safe and easy to manage.
    Instead of writing separate code for each data type, you can use a single class or method that works for all types.
    Generics help catch errors early and make your code more reusable and clean.

# In Java, you can create generic classes and generic methods that use type parameters. Let’s dive into both of these concepts.
    1. Generic Classes:
        A generic class is a class that can work with any data type. You define the type when you instantiate the class.
        It’s like creating a locker at your college—depending on what you need to store, you can use the locker
        for books, sports equipment, or lunch.

    2. Generic Methods:
        A generic method is a method that can operate on objects of various types. Just like you have one teacher who can teach
        multiple subjects, a generic method can work with different types of objects.

        Example of a Generic Method:
                public class Main {
                    // Generic method with a type parameter T
                    public static <T> void displayItem(T item) {
                        System.out.println("Item: " + item);
                    }

                    public static void main(String[] args) {
                        // Calling the generic method with different types
                        displayItem("Notebook");
                        displayItem(123);
                        displayItem(45.67);
                    }
                }

# Diamond Operator (<>) — Making Code Shorter and Neater
        When writing code with collections and generics, you’ll see these angle brackets <>.
        These brackets are called the diamond operator.

    Earlier, you had to write the type twice, like this:
        List<String> names = new ArrayList<String>();
    But now, with the diamond operator, you can simply write:
        List<String> names = new ArrayList<>();
 */
/*
# Key Points to Remember:
    1. Generics act like labels on your data containers, helping you store only the right type of data.
    2. You write one class or method that works with many data types, making your code reusable.
    3. Java catches errors early—like putting a number in a list meant for names—before the program runs.
    4. Generic classes and methods allow you to build flexible tools that adapt to different types
    5. Collections like lists and queues work better with generics—they become type-safe and easier to manage.
    6. The diamond operator (<>) helps shorten your code by letting Java guess the type automatically.
    7. Real-world apps like Uber and Swiggy use generics to manage large amounts of organized data.

# Common interview Questions and Answers:

    Q1: What are generics in Java?
    A: Generics let you write code that works with different types of data while making sure only the correct data goes in. It keeps your code safer and reusable.

    Q2: Why should we use generics?
    A: To avoid writing the same code again and again for different data types and to prevent errors like putting a number in a list meant for names.

    Q3: What is a generic class?
    A: A generic class is a class that can work with different data types. You decide the data type when you create an object of that class.

    Q4: What is a generic method?
    A: A generic method is a method that can work with any type of data. You can use the same method to handle a number, a word, or anything else.

    Q5: What happens if you add a wrong type of data to a generic collection?
    A: Java will give a compile-time error and stop you from running the code until it’s fixed.
 */
