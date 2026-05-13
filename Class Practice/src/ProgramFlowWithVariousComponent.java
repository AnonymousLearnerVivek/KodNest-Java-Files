class Student1 {
    static {
        System.out.println("com.Consturctor.Student static block is executed");
    }

    {
        System.out.println("com.Consturctor.Student Instance block is executed");
    }
    public Student1() {
        System.out.println("com.Consturctor.Student Constructor is executed");
    }
}

public class ProgramFlowWithVariousComponent {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

    }
}
/*
    Key Takeaways:

    1. Static blocks run once when the class is loaded.
    2. main() is the first method that runs in your program.
    3. Creating an object triggers:
        1. Instance variable initialization
        2. Instance block
        3. Constructor
    4. Instance methods can only be used after the object is created.
    5. Java always follows the same order — so once you learn it, you won’t forget it.


    Common Interview Questions:

    Q1: What runs first — static block or main()?
    Static block. It runs when the class is loaded — before main().

    Q2: What happens when you create an object?
    First, instance variables are initialized, then the instance block runs, and finally the constructor runs.

    Q3: What’s the difference between static and instance methods?
    Static methods belong to the class and can run without creating an object. Instance methods need an object.

    Q4: Can a class have multiple static blocks?
    Yes. They will run in the order they appear — but still only once when the class is loaded.

    Q5: Do instance blocks run before or after the constructor?
    Before. Instance blocks run immediately after instance variables are initialized, and just before the constructor.
 */
