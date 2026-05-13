package com.MethodOverriding;
/*
    Method overriding feat. return types
    Imagine you’re working with an application that calculates different types of shapes, like circles and rectangles.
    You have a basic Shape class, and you want to add specific behavior for each shape. But here's the problem:
    both the parent and child classes need a method to calculate the area, but the return types might differ depending
    on the shape. For example, a circle’s area might return a float, while a rectangle might return an integer.

    Without method overriding, you’d have to write different methods for each class, resulting in redundant code.
    So, how do we make sure that we can use the same method name for each shape but with different return types?

    What Exactly is Method Overriding with Return Types?
    Method overriding with return types is when a child class provides its own implementation of a method that exists in the parent class
    but with a different return type. In Java, this is allowed as long as the return type is compatible with the parent class’s method.
 */

/*
    Understanding the rules about return types:
    When you override a method, there are some rules you need to follow about return types:

    1. Return Type Compatibility:
        The return type of the overridden method in the child class should be a subtype or the same as the return type in the parent class.
        For example, you can override a method that returns Object with a more specific return type like String.

    2. Covariant Return Types:
        Java allows covariant return types, where the child class method can return a more specific type than the parent class method.
 */
/*
    Example 2: Covariant Return Types
    i. Parent class method returns a Food object.
   ii. Child class method can return a Samosa object (a subtype of Food).

    class Food {
        // Some properties and methods
    }

    class Samosa extends Food {
        // Some properties and methods
    }

    class StreetFood {
        public Food makeSnack() {
            return new Food();
        }
    }

    class SpicyStreetFood extends StreetFood {
        @Override
        public Samosa makeSnack() { // Covariant return type (Samosa is a subtype of Food)
            return new Samosa();
        }
    }

    Here, the makeSnack() method in the SpicyStreetFood class returns a Samosa object, which is a subtype of Food.
    This is allowed because of covariant return types.
 */
/*
    Common Interview Questions and Answers

    Q1: Can we change the return type in method overriding in Java?
    Answer: Yes, but the return type must be compatible with the parent method's return type.
            This is called covariant return type.

    Q2: What is a covariant return type?
    Answer: A covariant return type occurs when the child class method’s return type is a subclass or
            a more specific type of the return type in the parent class method.

    Q3: Can we override a method with a return type that is not compatible with the parent class?
    Answer: No, the return type in the child class must be compatible with the parent class method’s return type.

    Q4: Can the child class method return a more specific type than the parent class method?
    Answer: Yes, the child class method can return a more specific type (a subtype) of the return type in the parent class.

    Q5: What happens if the return type is incompatible in method overriding?
    Answer: If the return type is incompatible, a compile-time error will occur because
            Java will not allow the method overriding with mismatched return types.
 */
class Animal {

}
class Tiger extends Animal {

}

class Parent1 {
    Animal display() {
        System.out.println("Hi");
        Animal a = new Animal();
        return a;
    }
}

class Child1 extends Parent1 {
    @Override
    Tiger display(){
    // The rule is generally what is the rule, parent class method, whatever is the return type the same return type even the overridden method also should have,
    // this is the rule. But if in case, the return type is a child of parent class method return type, then you can change the return type to that,
        // This is known as Co varient Inheritance
        System.out.println("Hello");
        Tiger b = new Tiger();
        return b;
    }
}

public class MethodOverridingwithReturnTypes {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.display();
    }
}
