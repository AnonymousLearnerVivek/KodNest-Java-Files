package com.Has_a_Relationship;
/*
    HAS-A Relationship
    Think about your daily life. You have a phone. The phone HAS-A screen, HAS-A battery, HAS-A camera.
    These are different components that together make your phone work. Just like that, in programming,
    classes can have other objects inside them to represent these components. This is known as the HAS-A relationship,
    where one class "owns" another class or contains objects from another class. In programming, you’ll
    often need this relationship to model real-world entities. This type of relationship helps break down
    complex systems into simpler, more manageable pieces.

    What Exactly is the HAS-A Relationship?
    Standard Definition:
        In object-oriented programming (OOP), the HAS-A relationship refers to the situation where
        one class contains objects of another class.
 */
/*
    Types of HAS-A Relationships:
    There are two main types of HAS-A relationships in Java:
    1. Aggregation (The "Friends with Benefits" of Object Relationships)
    2. Composition (The "Till Death Do Us Part" of Object Connections)

    1. Aggregation:-
       Aggregation is a type of HAS-A relationship where the contained object can exist independently of
       the container object. This represents a weak relationship between the objects.

      # Real-World Example of Aggregation:
        Imagine a university and its professors. The university employs many professors,
        but each professor can also work at another university or leave and still continue
        teaching elsewhere. So, even if the university shuts down, the professors can still exist independently.
        i) A University HAS-A Professor.
       ii) Professors can exist independently of the University.

      # Characteristics of Aggregation:
        i) Dependency: The part (contained object) can exist without the whole (container object).
       ii) Lifespan: The part's lifespan is not dependent on the whole.

        Aggregation is like two roommates sharing a house. They live together, but each can move out
        and live elsewhere without any problem. They are connected, but not dependent on each other.

    2. Composition:-
       Composition is a stronger type of HAS-A relationship where the contained object cannot exist
       independently of the container object. This represents a strong relationship between the objects, indicating a whole-part relationship.

        # Real-World Example of Composition:
          Think about a house and its rooms. A house is composed of various rooms like the living room,
          bedroom, kitchen, and bathroom. These rooms cannot exist independently without the house.
          If the house is demolished, the rooms cease to exist as separate entities.
          i) House has multiple Rooms.
         ii) Rooms cannot exist independently of the House.

        # Characteristics of Composition:
          i) Dependency: The part (contained object) cannot exist without the whole (container object).
         ii) Lifespan: The part's lifespan is directly tied to the whole.

        Now, composition is the ride-or-die of object relationships. These objects are so tight,
        they can't exist without each other. It's all for one and one for all!
 */

public class HasArelationship {
    public static void main(String[] args) {
        Mobile m = new Mobile("Apple", 50000, "iOS", 12.5f);
        Charger c = new Charger(66, 'C');
        c.chargerDetails();

        m.mobileDetails();
        m.chargeMobile(c);

        // Now to access only os details
        m.os.osDetails();
    }
}
/*
    Common Interview Questions:
    Q1: What is the HAS-A relationship in Java?
Answer: The HAS-A relationship in Java is when one class contains objects of another class.
        This is known as composition, and it helps model real-world associations between entities.

    Q2: Can you give an example of the HAS-A relationship in real life?
Answer: A smartphone HAS-A battery, HAS-A camera, HAS-A screen. These components together make the phone functional.

    Q3: How does the HAS-A relationship improve code flexibility?
Answer: The HAS-A relationship allows us to change the internal objects without affecting the outer class.
        For example, we can update the Engine class in a car without changing the Car class itself.

    Q4: Can a class have multiple HAS-A relationships?
Answer: Yes, a class can have multiple HAS-A relationships.
        For example, a House object can have a Window, a Door, and a Roof as its components.
 */

/*
# Common Interview Questions related to Aggregation:

    Q1: What is aggregation in Java?
    Answer: Aggregation is a type of HAS-A relationship where one class contains a reference to another class, but the contained object can exist independently of the container object.

    Q2: Can you give a real-life example of aggregation?
    Answer: Yes. A university has professors. If the university shuts down, professors can still work at other institutions. So, a University HAS-A Professor is an example of aggregation.

    Q3: How is aggregation implemented in Java?
    Answer: Aggregation is implemented by creating one object separately and then passing its reference into another class. The contained object is not created inside the container class.

    Q4: Why is aggregation useful?
    Answer: Aggregation makes the code more reusable, flexible, and modular. It allows different parts of a program to share and use common objects without depending on each other completely.

    Q5: Is aggregation a type of inheritance?
    Answer: No. Aggregation is not inheritance. It is a type of object association — specifically a HAS-A relationship, not an IS-A relationship like inheritance.

 */

/*
# Common Interview Questions related to Composition:

    Q1: What is composition in Java?
    Answer: Composition is a HAS-A relationship where the contained object is fully managed by the container and cannot exist on its own.

    Q2: Can you give a real-life example of composition?
    Answer: Yes. A book has chapters. If the book is deleted, the chapters are deleted too. The chapters cannot exist without the book.

    Q3: How is composition different from aggregation?
    Answer: In composition, the contained object is created inside the container and destroyed with it. In aggregation, the object is passed in and can live independently.

    Q4: How do you implement composition in Java?
    Answer: By creating the contained object directly inside the class using the new keyword.

    Q5: Is composition better than aggregation?
    Answer: It depends on the use case. Use composition when the object must not exist alone, and use aggregation when it can be shared or reused.
 */
