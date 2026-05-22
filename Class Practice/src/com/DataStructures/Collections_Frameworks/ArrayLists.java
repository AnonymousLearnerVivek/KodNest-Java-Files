package com.DataStructures.Collections_Frameworks;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        // Initially the size of ArrayList is 10 which is dynamic mean if u add more it will be added

//        ArrayList al = new ArrayList();
//        al.add(1);
//        al.add(2);
//        al.add("Vivek");
//        al.add('K');
//        al.add(true);
//        al.add(73.98);
//        System.out.println(al);

        ArrayList<Integer> list = new ArrayList<>();  // This <> Angular Brackets are called as Generics
        list.add(1);
        list.add(2);
        list.add(3);  // using .add() method it will by-default add element in the last
        list.add(4);
        list.add(0, 70); // .add(index, element) method is used add element at specific index


//        int[] arr = new int[5];
//        System.out.println(arr);  // This will print the reference address of the arr

        System.out.println(list); // but this ArrayList will print the complete list
//        System.out.println(list.size()); // .size() is used to get the length of the ArrayList


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i)); // .get(index) method is used to get the values from the ArrayList
//        }
//        // using for-each loop
//        for(Integer i : list){ // using Integer because elements inside arraylist will be treated as Object we can also write Object in-place of Integer
//            System.out.println(i);
//        }

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);


        System.out.println(list2);

        list.addAll(list2); // .addAll(list/collection type) method will add all the elements of one collection to another collection
        System.out.println(list);
        System.out.println(list2);

        list.addAll(3,  list2); // we can also tell the index value where we need to add the another collection
        System.out.println(list);

        list2.set(1, 500); // .set(index, element) method will replace the element at the given specific index with the element which is passed
        System.out.println(list2);

        System.out.println(list2.contains(30)); // .contain(element) method return true if the element is present

        list2.remove(2); // .remove(index) method will remove the element from the specific index
        System.out.println(list2);
    }
}
