package com.Polymorphism.Downcasting;

/*
    What Exactly is Casting?
    Let’s keep it simple. When you store a child class object in a parent class reference,
    you won’t be able to use any extra methods that exist only in the child class. Java will not allow it.
    But if you are fully sure that the object is actually from the child class, you can tell Java to treat
    it like a child — not like a parent. This is called type casting. After casting, you can use all the special
    features that belong to the child. For example, if a Car object is stored in a Vehicle reference,
    and Car has a method like openTrunk(), you can’t use that method unless you first cast the reference to Car.
    It’s like using the right remote for the right device. If you use a basic remote, you can only do basic things.
    But if you switch to the remote that was made for the car, now you can do everything — like opening the trunk or turning on special lights.
 */
/*
    # Let’s Understand step by step how to fix this:
    First, Check if the Object is Actually a Car
    Before trying to use any special features from the Car class, we must make sure the object is really a Car.
    If not, our program will crash while running. To check this, we use something called instanceof. This just asks Java: “Hey, is this object really a Car?”

    Here’s how we do that in code:

    if (myVehicle instanceof Car) {
        // Now it's safe to cast and use Car's methods
    }
    This is like checking if your remote belongs to the smart TV before pressing smart buttons. If the answer is yes, you can go ahead.

    Then, Convert (Cast) the Reference to Car

    Once the check is successful using instanceof, we can tell Java to treat the object like a Car.
    After casting, we can use the extra methods like openTrunk() that were not accessible before.

    Here’s the simple code:

    Car myCar = (Car) myVehicle;
    myCar.openTrunk(); // Now this works perfectly!

    Or if you don’t want to create a new variable, you can do it in one line:

    ((Car) myVehicle).openTrunk(); // This also works!

    Both are correct. Choose the one that feels easier to read.
 */

/*
    # Explanation of the Updated Code:
    1. Type Check: The instanceof check ensures that myVehicle is indeed an instance of Car before attempting to cast and call the openTrunk() method.
    2. Safe Casting: Once confirmed, myVehicle is cast to Car, allowing safe access to the openTrunk() method without risk of runtime errors.

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

/*
    Common Interview Questions:

    Q1: Can we use child class methods if we have a parent reference?
    Answer: Yes, but only after we convert (or cast) the parent reference to the child type. Otherwise, Java won’t allow us to use the child’s special methods.

    Q2: What happens if we cast the reference, but the object is not really a child?
    Answer: The program will run into trouble and crash while running. Java will throw an error called ClassCastException, because we told it the wrong type.

    Q3: How can we avoid that crash?
    Answer: Before casting, always use instanceof to check. It’s like asking, “Hey Java, is this really a child object?” If yes, then it’s safe to cast.

    Q4: Do we need casting for calling methods that are already in both parent and child classes?
    Answer: No need. If the method is already in both classes (overridden), Java will automatically run the child’s version — even if we are using a parent refer
 */
class Parent {
    void display1() {
        System.out.println("Parent class display1");
    }
    void display2() {
        System.out.println("Parent class display2");
    }
}
class Child1 extends Parent {
    @Override
    void display2() {
        System.out.println("Child1 class display2");
    }

    void child1Details() {
        System.out.println("Child1 specific Method");
    }
}
class Child2 extends Parent {
    @Override
    void display2() {
        System.out.println("Child2 class display2");
    }
    void child2Details() {
        System.out.println("Child2 specific Method");
    }
}

public class AccessingChildSpecificMethodsfeatCasting {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        accessDisplay(child1);
        accessDisplay(child2);

    }

    static void accessDisplay(Parent p) {
        p.display1();
        p.display2();

        if(p instanceof Child1) {
//            Child1 child1 = (Child1) p;  // we can do this conversion as well
//            child1.child1Details();
            ((Child1)(p)).child1Details();
        }
        else if(p instanceof Child2) {
//            Child2 child2 = (Child2)(p);
//            child2.child2Details();
            ((Child2)(p)).child2Details();
        }
    }
}
