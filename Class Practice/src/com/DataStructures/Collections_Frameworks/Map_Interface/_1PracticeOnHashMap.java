package com.DataStructures.Collections_Frameworks.Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/*
Q. Manage Employee Records Using HashMap:
    The HR department of a company needs an employee management system that allows storing
    and managing employee information. Each employee has a unique Employee ID and a name.

    Your Task:
        1. Implement a program that performs the following operations using HashMap:
        2. Add Employee: Add a new employee with a unique ID and name.
        3. Retrieve Employee: Retrieve an employee's name using their ID.
        4. Remove Employee: Remove an employee from the system using their ID.
        5. Print All Employees: Print the entire list of employee records.

    Input Format:
        1. First Line: An integer n indicating the number of initial employees.
        2. Next n Lines: Each line contains an integer Employee ID followed by a name (space-separated).
        3. Next Line: An integer representing the Employee ID to retrieve the name.
        4. Next Line: An integer representing the Employee ID to remove from the system.
 */
/*
    Sample Input:
            3
            101 Alice
            102 Bob
            103 Charlie
            102
            103
    Sample Output:
            Added: ID 101 -> Alice
            Added: ID 102 -> Bob
            Added: ID 103 -> Charlie
            Employee Name: Bob
            Employee removed: Charlie
            ID: 101, Name: Alice
            ID: 102, Name: Bob
 */
public class _1PracticeOnHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Create a HashMap to store employee records
        HashMap<Integer, String> list = new HashMap<Integer, String>();
        // TODO: Read employee information and add them to the HashMap
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String value = sc.next();
            list.put(id, value);

            System.out.println("Added: ID " + id + " -> " + value);
        }
        // TODO: Retrieve an employee’s name using their ID
        String name = list.get(sc.nextInt());
        if(name != null)  {
            System.out.println("Employee Name: " + name);
        } else {
            System.out.println("Employee not found.");
        }

        // TODO: Remove an employee using their ID
        System.out.println("Employee removed: " + list.remove(sc.nextInt()));

        // TODO: Print all employee records
        Set keys = list.keySet();
        for(Object i : keys) {
            System.out.println("ID: " + i + ", Name: " + list.get(i));
        }

        sc.close();
    }
}
