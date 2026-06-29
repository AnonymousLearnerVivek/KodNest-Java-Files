package com.Polymorphism.Downcasting;

/*
    # Limitations of a parent reference
    What Can a Parent Reference Access?
    When we use a parent class reference to hold a child class object, we can only call the methods that the parent class knows about.
    That means:
    1. Methods that are already in the parent class – If the child class doesn't change them, it will just use the parent’s version.
    2. Methods that the child has overridden – If the method is present in both parent and child, Java will run the child’s version during the program.

    But if the child class has a new method that doesn't exist in the parent class, we cannot call that method using the parent reference.
    Java blocks this to keep the code safe and easy to check when it's being compiled.

    # Some Limitations of Using a Parent Reference
    When you use a parent class reference to store a child class object, there are a few things you need to keep in mind:
    1)  You cannot use child-only methods directly
        If the child class has a special method that is not in the parent class, you can’t use it through the parent reference.

    2) Java checks the reference type while compiling
        Even if the object is of the child class, Java looks at the type of reference (parent) during compilation. So it won’t allow anything that the parent doesn’t know.

    3) Be careful with type casting
        If you try to convert (cast) the parent reference into the wrong child type, your program may crash while running.

    4) You can't use child-only variables
        Just like with methods, if the child class has extra variables that the parent doesn’t have, you can’t access them using the parent reference.

    5) Constructors are different
        You can’t access child constructors using the parent reference. Constructors are not inherited or overridden, and this is something many beginners get confused about.
 */

/*
    # Key Points to Remember
    1. A parent reference can only use methods that are available in the parent class.
    2. If a method is present in both parent and child, the child’s version will run when the program runs.
    3. You cannot directly use methods that are only written in the child class by using a parent reference.

    # Common Interview Questions and Answers

    Q1: Can a parent class reference use child class methods?
    A: No. A parent reference can only use the methods that are available in the parent class.
       If the child has some extra methods, you cannot use them directly unless you convert the reference.

    Q2: What happens if you try to use a method that only exists in the child class, but call it using the parent reference?
    A: Your code will show an error while typing or compiling. Java will say that the method doesn’t exist in the parent class.

    Q3: How can we use the child’s special methods using the parent reference?
    A: You need to convert (or cast) the parent reference to the child class type. After that, you can call the child’s methods.

    Q4: Is there any risk in using casting?
    A: Yes. If the object is not really from the child class, your program might crash while running. This crash is called a ClassCastException.

    Q5: Why doesn’t Java allow direct access to child methods through the parent reference?
    A: Because Java wants to be safe. It checks the reference type while writing the code to avoid mistakes and unexpected behavior later.
 */

class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
    void land() {
        System.out.println("Plane is landing");
    }
}
class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo Plane fly at low altitude");
    }
    void cargoInternal() {
        System.out.println("Cargo Plane are very big in size");
    }
}
class PassengerPlane extends CargoPlane {
    @Override
    void fly() {
        System.out.println("Passenger Plane fly at medium altitude");
    }

    void  passengerInternal() {
        System.out.println("Passenger Plane are normal size plane");
    }
}
class FighterPlane extends CargoPlane {
    @Override
    void fly() {
        System.out.println("Fighter Plane fly at high altitude");
    }
    void  fighterInternal() {
        System.out.println("Fighter Plane are very small in size");
    }
}
public class Downcasting {
    public static void main(String[] args) {
        Plane p;
        p = new CargoPlane();  // Upcasting happening here this is implicit UpCasting
        System.out.println("-----------------");
        p.takeOff();
        p.fly();
        p.land();
        ((CargoPlane)(p)).cargoInternal();  // doing downcasting to access child specific method using Parent reference

        System.out.println("-----------------");
        p = new PassengerPlane();
        p.takeOff();
        p.fly();
        p.land();

        System.out.println("-----------------");
        p = new FighterPlane();
        p.takeOff();
        p.fly();
        p.land();
    }
}
/*
    The type of casting used above is called downcasting. Downcasting occurs when you cast a reference of a superclass to a subclass.
    This is common in object-oriented programming when you need to access methods or properties specific to the subclass that aren't available or defined in the superclass.

    Q) What is Downcasting?
        Downcasting is a way to regain access to the methods and properties of a subclass from a reference variable that is
        currently referring to an object as its superclass type. This is necessary because the superclass reference by default
        only has access to methods and properties that the superclass knows about, which includes methods that the subclass has
        overridden but does not include methods that are unique to the subclass.

    Q) Why and When to Use Downcasting?
       1. Accessing Subclass-Specific Features:
          If you have a reference that is of a superclass type and you know that the actual object is an instance of a subclass,
          downcasting allows you to access methods and properties specific to that subclass.

       2. Implementing Polymorphic Behavior:
          In scenarios where methods are overridden in subclasses, and you might want to invoke these methods through superclass
          references, downcasting can be used after ensuring the object's actual type, to invoke methods that are specifically overridden or newly defined in the subclass.

       3. Leveraging Subclass-Specific Logic:
          When subclass instances contain additional logic or state not represented in the superclass, downcasting is necessary
          to make full use of those specific implementations.
 */
