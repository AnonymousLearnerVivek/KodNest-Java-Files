package com.Polymorphism.RunTimePolymorphism;
/*
    Q4: How is method overriding related to polymorphism?
Answer:
    Method overriding is what makes polymorphism possible in Java. When we call an overridden method using a
    parent class reference that points to a child object, Java dynamically chooses the correct version of the method during runtime — this is polymorphism in action.
 */

/*
    Q) When Should You Use Method Overriding?
    Whenever a child class needs to give its own behavior for a method that already exists in the parent class.
    It’s best used when you have multiple types of objects that look similar, but each needs to act differently.

    Summary:
    Method overriding is when a child class redefines a method from its parent class to give it new behavior.
    This becomes super powerful when we use it along with polymorphism.

    It allows us to use one method name and trust Java to run the correct version at the right time — based on the object.
    That’s why overriding is not just a feature — it’s the backbone of polymorphism.

    Key Points to remember:
    1. Method overriding means changing the parent method in the child class.
    2. It makes the same method name do different things for different objects.
    3. It is the foundation that makes polymorphism work.
    4. It keeps code clean, flexible, and easy to maintain.
    5. It's perfect when you want one method name to handle multiple object behaviors.
 */

/*
    Common Interview Questions and Answers
    Q1: What is method overriding in Java?
Answer:
    Method overriding is when a subclass provides its own version of a method that is already defined in its parent class.
    Both methods must have the same name, return type, and parameters. The overridden method in the child class replaces the one from the parent class during runtime.

    Q2: Why do we use method overriding in Java?
Answer:
    We use method overriding to define a specific behavior in the child class that is different from the general behavior in the parent class. It allows us to achieve polymorphism — making one method behave differently depending on the object.

    Q3: Can we override static methods in Java?
Answer:
    No. Static methods belong to the class, not to the objects. They are resolved at compile time, not at runtime.
    So static methods can’t be overridden, but they can be hidden if declared again in the subclass.

    Q4: How is method overriding related to polymorphism?
Answer:
    Method overriding is what makes polymorphism possible in Java. When we call an overridden method using a
    parent class reference that points to a child object, Java dynamically chooses the correct version of the method during runtime — this is polymorphism in action.

    Q5: Can we override a method with a lower access modifier?
Answer:
    No. You cannot reduce the visibility of an overridden method. For example, if the parent method is public, the child class cannot override it with protected or private.
 */
class BookInteraction {
    public void performAction() {
        System.out.println("Performing book interaction...");
    }
}

class CheckAvailability extends BookInteraction {
    public void performAction() {
        System.out.println("Checking book availability...");
    }
}

class Borrow extends BookInteraction {
    public void performAction() {
        System.out.println("Borrowing a book...");
    }
}

class Return extends BookInteraction {
    public void performAction() {
        System.out.println("Returning a book...");
    }
}

public class MethodOverridingFeatPolymorphism {
    public static void main(String[] args) {
        BookInteraction check = new CheckAvailability();
        check.performAction();

        BookInteraction borrow = new Borrow();
        borrow.performAction();

        BookInteraction returnBook = new Return();
        returnBook.performAction();
    }
}
