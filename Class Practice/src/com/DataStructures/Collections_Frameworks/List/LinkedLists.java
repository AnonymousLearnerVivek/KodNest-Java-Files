package com.DataStructures.Collections_Frameworks.List;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); //  This way we create Heterogeneous List
        // This is known as Doubly linked data structure
        list.add(10);
        list.add("KodNest");
        list.add('V');
        list.add(true);
        list.add(32.232);

        System.out.println(list);
//  Addition Methods
        list.add(3, 30); // .add(index, element) method will add the element at the specific index
        System.out.println(list);

        list.addFirst(300); // will add at the starting
        System.out.println(list);

        list.addLast(400); // will add at the last
        System.out.println(list);
// Removal Methods
        System.out.println(list.remove(4)); // will remove and print the element of the specified index
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);

// Access Methods
        System.out.println(list.get(3)); // get the element at specified index
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list);
    }
}
/*
LinkedList: Elevate Your Data Handling Skills
# Problems with ArrayList in Certain Scenarios
    1. Inefficient Insertions and Deletions: Inserting or deleting elements at the beginning or middle of an ArrayList requires
                                             shifting all subsequent elements, which is time-consuming for large lists.
    2. Performance Bottlenecks: Frequent modifications can lead to performance issues, making your app sluggish.
    3. Not Ideal for Queues: If you need to frequently add or remove elements from both ends, ArrayList isn't the best choice.

# Benefits of LinkedList
    1. Efficient Insertions and Deletions: Adding or removing elements from the beginning or middle is faster
                                           because it doesn't require shifting elements.
    2. Doubly Linked Structure: Each element (node) knows about the element before and after it, allowing for quick navigation.
    3. Ideal for Implementing Queues and Deques: LinkedList implements both the List and Deque interfaces,
                                                 making it versatile for various use cases.

# Internal Structure: Nodes and Links
    A LinkedList consists of elements called nodes, where each node contains:
        1. Data: The actual value or object stored.
        2. Reference to Next Node: A pointer to the next node in the list.
        3. Reference to Previous Node: In a doubly linked list, a pointer to the previous node.

# When to Use LinkedList:
    1. Frequent Insertions/Deletions: Ideal when you need to add or remove elements frequently, especially at the beginning or end.
    2. Implementing Queues/Stacks: Perfect for FIFO (First-In-First-Out) or LIFO (Last-In-First-Out) structures.
    3. Memory is Not a Constraint: Acceptable when additional memory usage is not a major concern.

# When to Use ArrayList:
    1. Frequent Access by Index: Best when you need fast retrieval of elements by index.
    2. Memory Efficiency: More memory-efficient when storing large amounts of data without frequent modifications.
    3. When Change is Constant: LinkedLists are perfect if your data keeps changing and you need to add or remove
                                elements often. Think of it as managing a revolving door of party guests.
    4. Not for Random Access: If you need to find an element by its position repeatedly,
                              stick to ArrayList — it’s way faster at getting straight to the point.
    5. Memory Considerations: LinkedLists use more memory due to all the pointers, so call in LinkedList
                              when flexibility matters more than memory efficiency.

# Key Methods of LinkedList:
    Here are some essential methods to know:

    1. Insertion Methods:
        1. addFirst(E e): Inserts the element at the beginning.
        2. addLast(E e): Appends the element at the end.
        3. add(int index, E element): Inserts the element at the specified position.

    2. Removal Methods:
        1. removeFirst(): Removes and returns the first element.
        2. removeLast(): Removes and returns the last element.
        3. remove(int index): Removes the element at the specified position.

    3. Access Methods:
        1. getFirst(): Retrieves the first element without removing it.
        2. getLast(): Retrieves the last element without removing it.
        3. get(int index): Retrieves the element at the specified position.

    4. Utility Methods:
        1. size(): Returns the number of elements.
        2. isEmpty(): Checks if the list is empty.

# Key Points to remember:
    1. LinkedList is ideal for applications requiring frequent insertions and deletions.
    2. It has a doubly linked structure, allowing efficient navigation and modifications.
    3. Access time is slower (O(n)) compared to ArrayList due to traversal requirements.
    4. Memory usage is higher due to additional node references.
    5. Choose LinkedList when you need flexibility; choose ArrayList when you need fast random access.

# Common Interview Questions and How to Answer Them:
    Q1. What are the advantages of LinkedList over ArrayList?
    Answer: LinkedList provides efficient insertions and deletions at the beginning or middle of the list (O(1) at the ends),
            whereas ArrayList requires shifting elements (O(n)). LinkedList is ideal for scenarios where data changes frequently.

    Q2. What is the time complexity of accessing an element in a LinkedList?
    Answer: Accessing an element by index in a LinkedList has O(n) time complexity because it requires traversing the list
            from the beginning or end to the specified index.

    Q3. When would you prefer an ArrayList over a LinkedList?
    Answer: Prefer ArrayList when you need fast random access to elements and when insertions and deletions are infrequent.

    Q4. Can you explain the internal structure of a LinkedList?
    Answer: A LinkedList is made up of nodes where each node contains data and references to the next and previous nodes.
            This structure allows for efficient insertions and deletions by updating node references.

    Q5. How does memory usage differ between LinkedList and ArrayList?
    Answer: LinkedList uses more memory because each node stores additional references to other nodes.
            ArrayList uses a contiguous block of memory, which is more space-efficient.

    Tips for Interviews: Understand the internal workings, be ready to explain when to use LinkedList over ArrayList, and know their performance implications.

 */











