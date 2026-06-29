package com.DataStructures.Collections_Frameworks.Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethos {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(50);
        list.add(45);
        list.add(10);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
        /*
            The Collections.reverse() method in Java is used to reverse the order of elements in a list.
            It modifies the original list, arranging its elements in the opposite sequence. This is helpful
            when you need the list in reverse order without creating a new list.
         */
        Collections.reverse(list);
        System.out.println(list);
        /*
        The Collections.binarySearch() Method in Java
            The Collections.binarySearch() method is an efficient way to search for elements in a sorted list.
            It returns the index if the element is found. If not, it returns a negative value indicating the
            insertion point where the element would fit in the list.

            Condition : list should be in sorted in ascending order
         */
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 25));


        /*
            The Collections.frequency() method in Java is used to count the occurrences of a specific element in a collection.
            It’s useful when you need to determine how often an element appears in a list, such as counting repeated items
            or tracking occurrences of a value.
         */
        System.out.println(Collections.frequency(list, 10));
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(20);
        list2.add(30);
        System.out.println(list2);
        System.out.println(Collections.disjoint( list2, list));// it returns true if the specified lists have NO elements in Common.

        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 100, 20, 30, 30);
        System.out.println(list3);




    }
}
