package com.DataStructures.Concurrent_Collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(150);
        list.add(75);
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            list.add(999);
        }

        System.out.println(list);
    }
}
