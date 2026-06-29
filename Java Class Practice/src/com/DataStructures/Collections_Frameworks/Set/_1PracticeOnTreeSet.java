package com.DataStructures.Collections_Frameworks.Set;


import java.util.Scanner;
import java.util.TreeSet;
// Managing Product Categories Using Set Operations with TreeSets
public class _1PracticeOnTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of products in Electronics category (n1)
        int n1 = sc.nextInt();
        // TODO: Create a TreeSet to store product names for Electronics
        TreeSet<String> electronics = new TreeSet<>();
        // TODO: Read and add n1 product names to the Electronics TreeSet
        for(int i = 0; i < n1; i++) {
            electronics.add(sc.next());    // Example set : Laptop Phone Tablet TV Headphones
        }

        // TODO: Read the number of products in Home Appliances category (n2)
        int n2 = sc.nextInt();
        // TODO: Create a TreeSet to store product names for Home Appliances
        TreeSet<String> homeAppliances = new TreeSet<>();
        // TODO: Read and add n2 product names to the Home Appliances TreeSet
        for(int i = 0; i < n2; i++) {
            homeAppliances.add(sc.next());  // Example set: Phone Refrigerator WashingMachine TV
        }

        // TODO: Perform Union, Intersection, and Difference operations
        TreeSet<String> union = new TreeSet<>(electronics);
        union.addAll(homeAppliances);
        for(String i : union){
            System.out.print(i + " ");
        }
        System.out.println();

        TreeSet<String> intersection = new TreeSet<>(electronics);
        intersection.retainAll(homeAppliances);  // (products common to both categories)
        if(!intersection.isEmpty()){
            for(String i : intersection) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO PRODUCTS");
        }

        TreeSet<String> difference = new TreeSet<>(electronics);
        difference.removeAll(homeAppliances); // (products in Electronics but not in Home Appliances)
        if(!difference.isEmpty()){
            for(String i : difference) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO PRODUCTS");
        }
        // TODO: Print the result of each operation or "NO PRODUCTS" if empty

        sc.close();
    }
}

/*
Output Format:
    1. First Line: Print the union of the two categories (all unique products).
    2. Second Line: Print the intersection of the two categories (products common to both categories).
    3. Third Line: Print the difference of the two categories (products in Electronics but not in Home Appliances).
If any set operation results in no elements, print "NO PRODUCTS" for that operation.


 */
/*
    Operation	        Method
 1. Union / Merge	    addAll()      -> Add all elements of set2 into set1
 2. Intersection	    retainAll()   -> Keep only common elements between set1 and set2
 3. Difference	        removeAll()   -> Elements present in set1 but NOT in set2
 */