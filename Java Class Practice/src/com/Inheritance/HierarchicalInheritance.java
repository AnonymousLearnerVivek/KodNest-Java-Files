package com.Inheritance;/*
    What Exactly is Hierarchical Inheritance? 💡
    Simple Explanation:
        In hierarchical inheritance, multiple classes inherit from the same parent class.
        It’s like having one base class (a common blueprint), and many classes that extend it individually.
              Person
            /   |   \
     com.Consturctor.Student Teacher Admin
    Each child class gets all the common features from the parent, but still adds its own specific behavior.

    Standard Definition:
    Hierarchical inheritance is a type of inheritance where two or more classes inherit from the same base class.
 */

/*
    Q1: What is hierarchical inheritance in Java?
    Answer: Hierarchical inheritance is a type of inheritance in which multiple child classes inherit from a single parent class.
            Each child class gets access to the common properties and methods defined in the parent class.
            For example, if you have a class User, and two classes com.Consturctor.Student and Teacher that both extend User,
            then com.Consturctor.Student and Teacher can reuse the code in User without rewriting it. This helps maintain a clean and reusable structure in your program.
 */

class Parents {
    float height = 5.8f;
    void readBook() {
        System.out.println("Reads com.Consturctor.Book");
    }
}
class Child1 extends Parents {

}
class Child2 extends Parents {

}
class Child3 extends Parents {

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();

        System.out.println(c1.height);
        c1.readBook();
        System.out.println(c2.height);
        c2.readBook();
        System.out.println(c3.height);
        c3.readBook();
    }
}
/*
Common Interview Questions:

    Q1: What is hierarchical inheritance in Java?
    Answer:
        Hierarchical inheritance is a type of inheritance in which multiple child classes inherit from a single parent class.
        Each child class gets access to the common properties and methods defined in the parent class. For example, if you have a class User,
        and two classes Student and Teacher that both extend User, then Student and Teacher can reuse the code in User without rewriting it.
        This helps maintain a clean and reusable structure in your program.

    Q2: Why is hierarchical inheritance useful?
    Answer:
        Hierarchical inheritance is useful because it helps you avoid repeating the same code in multiple classes.
        Instead of writing shared properties or methods in every class, you define them once in a parent class and let all related child classes inherit them.
        This makes your code easier to update — if something changes, you only need to change it in one place.
        It also makes your program more organized, especially when you have several classes that share common features.

    Q3: Can each child class have its own methods?
    Answer:
        Yes! Each child class can define its own unique methods and variables, in addition to what it inherits from the parent class.
        For example, if both Student and Teacher inherit from User, they can still have their own methods like displayStudentDetails()
        and displayTeacherDetails(), while still using the common displayUserDetails() method from User.
 */
