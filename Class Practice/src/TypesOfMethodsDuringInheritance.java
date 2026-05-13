/*
    Let’s know the Types of Methods in Inheritance?
    In Java inheritance, there are three main types of methods you will work with:
    1. Inherited Methods – These are methods defined in the parent class (superclass) that the child class can use directly without changing anything.
    2. Overridden Methods – These are methods that the child class changes (overrides) to provide its own version of the behavior.
    3. Child-Specific Methods – These methods are created only in the child class and do not exist in the parent class. They provide new behavior unique to the child class.

    Why these methods are Important?
    1. Helps you understand how behavior is passed from parent class to child class.
    2. Makes it clear when you should reuse, change, or create new methods.
    3. Helps avoid confusion when reading or writing code in real-world projects.
    4. These concepts are frequently asked in Java interviews and coding tests.
 */
/*
    Key points to remember:
    1. Inherited Method: A method from the parent class that is used in the child class without any change.
    2. Overridden Method: A method that exists in the parent class but is redefined in the child class to change its behavior.
    3. com.Inheritance.Child-Specific Method: A new method written only in the child class to provide additional or special behavior.

    Common Interview Questions:

    Q1: What is an inherited method?
        An inherited method is a method written in the parent class that the child class uses without changing it.

    Q2: What is an overridden method?
        An overridden method is when the child class changes the method from the parent class using the same method name and parameters.

    Q3: What is a child-specific method?
        A child-specific method is a new method created only in the child class. It does not exist in the parent class.

    Q4: Can a child class override every method of the parent class?
        No. The child class can override non-final, non-private, and non-static methods.

    Q5: Why do we override methods?
        To change or customize the behavior of the parent method in the child class.
 */

class Parent2 {
    void eats() {
        System.out.println("eats veg");
    }
    void work() {
        System.out.println("farmer");
    }
}

class Child5 extends Parent2 {
    @Override // Annotation
    void work() {
        System.out.println("software developer");
    }

    void swim() {
        System.out.println("can swim");
    }
}

public class TypesOfMethodsDuringInheritance {
    public static void main(String[] args) {
        Parent2 p1 = new Parent2();
        p1.eats();
        p1.work();

        Child5 child = new Child5();
        child.eats(); // inherited method
        child.work(); // overridden method
        child.swim(); // child-specific method
    }
}
