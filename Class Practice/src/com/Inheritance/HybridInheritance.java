package com.Inheritance;

/*
    What Exactly is Hybrid Inheritance? 💡
    Simple Explanation:
        Hybrid inheritance is when we mix different types of inheritance together in one program.
        For example, one class can inherit from a parent (single inheritance),
        and another class can then inherit from that (multilevel). At the same time,
        another class might also use the same parent (hierarchical).
        So, we are combining different ways of inheritance to show real-life relationships between classes.

    Standard Definition:
        Hybrid inheritance is a type of inheritance where two or more types of inheritance
        (such as single + multilevel, or single + hierarchical) are used together in a program
        to represent complex relationships between classes.
 */
class LibraryItem {
    String title;
    String itemId;

    public void displayDetails() {
        System.out.println("Title: " + title + ", Item ID: " + itemId);
    }
}

class Books extends LibraryItem {
    String author;

    public void displayBookDetails() {
        displayDetails();
        System.out.println("Author: " + author);
    }
}

class Magazine extends LibraryItem {
    String issue;

    public void displayMagazineDetails() {
        displayDetails();
        System.out.println("Issue: " + issue);
    }
}

class ScienceBook extends Books {
    String field;

    public void displayScienceBookDetails() {
        displayBookDetails();
        System.out.println("Field: " + field);
    }
}
public class HybridInheritance {
    public  static void main(String[] args) {
        ScienceBook scienceBook = new ScienceBook();
        scienceBook.title = "Physics Fundamentals";
        scienceBook.itemId = "B1001";
        scienceBook.author = "Dr. Smith";
        scienceBook.field = "Physics";
        scienceBook.displayScienceBookDetails();

        System.out.println("-----");

        Magazine magazine = new Magazine();
        magazine.title = "Tech Monthly";
        magazine.itemId = "M2001";
        magazine.issue = "July 2024";
        magazine.displayMagazineDetails();
    }
}
