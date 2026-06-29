package com.DataStructures.Collections_Frameworks.Set;

import java.util.Scanner;
import java.util.TreeSet;
// Finding Products Within a Price Range Using TreeSet's subSet() Method
public class _2PracticeOnTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of product prices (n)
        int n = sc.nextInt();
        // TODO: Create a TreeSet to store product prices
        TreeSet<Integer> set1 = new TreeSet<>();
        // TODO: Read and add n product prices to the TreeSet
        for(int i = 0; i < n; i++){
            set1.add(sc.nextInt());  // Example input : 100 200 300 400 500 600
        }
        // TODO: Read the minPrice and maxPrice for the range query
        int minPrice = sc.nextInt();  // Example : 250
        int maxPrice = sc.nextInt();  // Emample : 550
        // TODO: Perform the range query using TreeSet's subSet() method
        TreeSet<Integer> set2 = new TreeSet<>(set1.subSet(minPrice, true, maxPrice, true));
        // TODO: Print the product prices in the range, or "NO PRODUCTS" if none are found
        if(!set2.isEmpty()){
            for(Integer i : set2){
                System.out.print(i + " ");
            }
        } else {
            System.out.println("NO PRODUCTS");
        }
        sc.close();
    }
}
/*
    | Method      | Meaning                     |
    | ----------- | --------------------------- |
 1. | `subSet()`  | elements between a range    |
 2. | `headSet()` | elements smaller than value |
 3. | `tailSet()` | elements greater than value |

1. subSet() → Between a Range
    Syntax:
        set.subSet(start, end)
    Returns:
        start <= elements < end
    (start is included)
    (end is excluded)
Inclusive Range Version:
        set.subSet(20, true, 50, true)
    Now both included.

2. headSet() → Smaller Elements
    Syntax:
        set.headSet(value)
    Returns:
        elements < value
Inclusive Version:
        set.headSet(value, true)
    Returns:
            elements <= value

3. tailSet() → Greater Elements
    Syntax:
        set.tailSet(value)
    Returns:
        elements >= value
Exclusive Version:
        set.tailSet(value, false)
    Returns:
        elements > value

 */