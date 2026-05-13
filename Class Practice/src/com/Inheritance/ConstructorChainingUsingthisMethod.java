package com.Inheritance;/*
    Constructor chaining with this() method also known as Local Chaining

    When we create objects in Java, sometimes we use constructors to give values to the object.
    But what if we want to create different versions of constructors in the same class?
    For example, one constructor may take just a name, while another may take both name and age.
    If we write the same logic again and again in both constructors, it becomes hard to manage and wastes time.
    Instead, Java allows us to use a shortcut. We can call one constructor from another in the same class using the this() keyword. T
    his helps us avoid repeating code and makes our program simple and clean.

    What Exactly is Constructor Chaining with this()?

    Constructor chaining using this() means calling one constructor from another constructor within the same class.
    This helps reuse the logic already written in another constructor. It saves time and reduces errors in the program.
    In simple words, when a class has two or more constructors, and one of them needs to use another one, it can do that using the this() keyword.

    Standard Definition:

    this() is a special keyword in Java used to call another constructor of the same class from within a constructor.
    It helps in constructor chaining, allowing code reusability and reducing duplication.

    Why Is It Important?

    1. It helps us write less code by reusing logic from one constructor in another.
    2. It keeps all the constructor logic in one place, so we don’t repeat the same lines.
    3. It makes the program easier to understand and read.
    4. If we need to change something later, we update it in one constructor only, not in many places.
    5. It reduces errors and makes the code more clean and professional.
 */

/*
    Key points to remember:
    1. The this() keyword is used to call another constructor within the same class.
    2. It helps to reuse code and avoid writing the same logic in multiple constructors.
    3. this() must be the first line inside a constructor.
    4. You can use only one constructor call (this() or super()) in a constructor.
    5. It makes the program cleaner, easier to read, and easier to maintain.

    Common Interview Questions:

    Q1. What is constructor chaining using this()?
    Answer: Constructor chaining using this() means calling one constructor from another in the same class. It helps avoid writing the same code again.

    Q2. Why is constructor chaining useful?
    Answer: It reduces repetition, keeps the logic in one place, and makes the code easy to understand and maintain.

    Q3. Can we use both this() and super() in the same constructor?
    Answer: No. You can use either this() or super(), not both. Also, it must be the first line in the constructor.

    Q4. What happens if this() is not the first line in the constructor?
    Answer: The program will give a compile-time error because Java requires constructor calls to be at the top.

    Q5. What is the difference between this() and super()?
    Answer: this() calls another constructor in the same class, while super() calls a constructor from the parent class.
 */
class Demo1 {
    int id;
    String name;

    public Demo1(){
        this(109, "Sachin");
    }

    public Demo1(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }

    public Demo1(int id){
        this();
        this.id = 100;
    }
}

class Demo2 extends Demo1 {
        int age;

        public Demo2(int id, String name, int age){
            this();
            this.age = age;
        }
        public Demo2(){
            this(21);
        }
        public Demo2(int age){
            super(103);
            this.age = age;
        }

        public void display() {
            System.out.println("id: " + id);
            System.out.println("name: " + name);
            System.out.println("age: " + age);
        }
}
public class ConstructorChainingUsingthisMethod {
    public static void main(String[] args) {

        Demo2 d1 = new Demo2(101, "Vivek", 23);
        d1.display();
        Demo2 d2 = new Demo2(22);
        d2.display();
        Demo2 d3 = new Demo2();
        d3.display();
    }
}

// Example Code
/*
    class com.Consturctor.Book {
        String title;
        String author;
        int year;

        // Constructor to initialize all details
        public com.Consturctor.Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
            System.out.println("Creating com.Consturctor.Book: " + this.title + ", " + this.author + ", " + this.year);
        }

        // Constructor with title and author only
        public com.Consturctor.Book(String title, String author) {
            this(title, author, 2020); // Calls the main constructor with a default year
        }

        // Default constructor
        public com.Consturctor.Book() {
            this("Unknown Title", "Unknown Author"); // Calls the constructor with two parameters
        }
    }
    public class Library {
        public static void main(String[] args) {
            com.Consturctor.Book myBook = new com.Consturctor.Book(); // Uses default constructor
        }
    }
// output: Creating com.Consturctor.Book: Unknown Title, Unknown Author, 2020

 */