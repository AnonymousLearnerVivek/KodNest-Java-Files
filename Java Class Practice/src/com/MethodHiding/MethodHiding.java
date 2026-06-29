package com.MethodHiding;
/*
    Q) What Exactly is Method Hiding?
       Standard Definition:
       Method Hiding happens when a static method in the child class has the same name and parameters as a static method in the parent class.
       In this case, the method in the child class hides the method in the parent class.

       Simple Explanation:
       In Java, if a parent class has a static method, and the child class creates another static method with the same name and same inputs,
       then the child method does not replace the parent method. It simply hides it. This is because static methods belong to the class, not the object.
       So Java will decide which method to run based on the class reference, not based on the actual object created.

    Q) Why is Method Hiding Important?
       Here are some simple reasons why method hiding is important:
       1. It helps us to understand how static methods behave when they are used in parent-child class relationships.
       2. It shows that static methods are connected to the class, not to objects.
       3. It helps us avoid confusion when both parent and child classes have methods with the same name.
       4. It teaches us that static methods cannot be overridden, they can only be hidden.
       5. It helps us write better and cleaner code in real-world Java projects.

    # Let’s Understand the Basic Rules of Method Hiding:
      Here are the main rules to remember:
      1. Both the parent and the child class methods must be marked as static.
      2. The method name and the input parameters must be exactly the same.
      3. Java will not look at the object to decide which method to run. It will look at the reference type.
      4. If you remove the static keyword, then this becomes method overriding, not hiding.

    Static methods belong to the class, so method hiding depends on the class used on the left side during method calling.
 */
/*
    Common Interview Questions and Answers:

    Q1: What is Method Hiding in Java?
    Answer: Method Hiding happens when both parent and child classes have static methods with the same name and inputs.
            The method in the child class hides the one in the parent class.

    Q2: Can static methods be overridden?
    Answer: No. Static methods cannot be overridden because they belong to the class, not to the object. They can only be hidden.

    Q3: How does Java decide which hidden method to run?
    Answer: Java checks the class used in the reference. It does not look at the object type.

    Q4: What is the difference between method hiding and method overriding?
    Answer: Method hiding works with static methods and is based on the reference type. Method overriding works
            with non-static methods and is based on the object type at runtime.

    Q5: Is method hiding useful in real life?
    Answer: Yes, it helps in large programs where static methods are reused in many places. Understanding method hiding prevents errors when using inheritance.
 */
class School {
    static void announceHoliday() {
        System.out.println("Holiday announced by the main school");
    }
}
class BranchSchool extends School {
    static void announceHoliday() {
        System.out.println("Holiday announced by the branch school");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        School s = new School();
        s.announceHoliday(); // Output: Holiday announced by the main school

        BranchSchool b = new BranchSchool();
        b.announceHoliday(); // Output: Holiday announced by the branch school

        School sb = new BranchSchool();
        sb.announceHoliday(); // Output: Holiday announced by the main school
    }
}
/*
    What’s Happening Here?
    We created a parent class called School with a static method announceHoliday().
    Then we created a child class called BranchSchool that also has a static method with the same name.
    Now in the main part of the program:
     1. When we create an object of the School class and call the method, it runs the School version.
     2. When we create an object of the BranchSchool class and call the method, it runs the BranchSchool version.
     3. But when we create an object of BranchSchool and store it in a School reference, Java still runs the School version.
    This is because static methods are linked to the class used in the reference, not the actual object created.
    So even if the object is from the child class, Java checks the reference and runs the parent’s method. That is why it is called Method Hiding.
 */

/*
    # Key points to remember:
    1. Method hiding happens when a static method in the child class has the same name and parameters as a static method in the parent class.
    2. This is not method overriding. Static methods cannot be overridden.
    3. Java chooses the method to run based on the class type used in the reference, not the object created.
    4. If you use a parent class reference, the parent’s static method will run — even if the object is of the child class.
    This concept helps us understand how class-level methods work in inheritance.
    Knowing this helps us avoid confusion in real coding and also helps in interviews.
 */

